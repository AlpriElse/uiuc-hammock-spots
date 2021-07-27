from multiprocessing import Process

from geopy import distance
from sqlalchemy import select, insert

from db_connect import engine
from tree_model import tree_table
from tree_distance_model import tree_distance_table

BATCH_SIZE = 1000
MAX_DISTANCE_TO_PERSIST = 25
METERS_TO_FEET_CONVERSION_CONSTANT = 3.28084


def persist_distances(tree_distances):
    with engine.connect() as conn:
        result = conn.execute(
            insert(tree_distance_table),
            tree_distances
        )


def calculate_distances_for_range(trees, start_idx, num=BATCH_SIZE):
    N = len(trees)
    tree_distances = []

    # Loop through each pair of trees without duplicates
    for i in range(start_idx, start_idx + num):

        # Log Progress
        if i % 100 == 0:
            progress = (i - start_idx) / num * 100
            print('{}:{} {}%'.format(start_idx, start_idx + num, progress))

        for j in range(i + 1, N):

            tree1 = trees[i]
            tree2 = trees[j]

            tree1_loc = (tree1.latitude, tree1.longitude)
            tree2_loc = (tree2.latitude, tree2.longitude)

            dist_meters = distance.distance(tree1_loc, tree2_loc).meters

            dist_feet = METERS_TO_FEET_CONVERSION_CONSTANT * dist_meters

            # Disregard distance if trees to far from each other
            if dist_feet > MAX_DISTANCE_TO_PERSIST:
                continue

            # Construct dict (conforms to tree_distance_model schema)
            new_tree_distance_row = {
                'distance': dist_feet,
                'site1_id': None,
                'site2_id': None
            }

            # Statisfy tree_distance table CHECK site1_id > site2_id
            if tree1.site_id > tree2.site_id:
                new_tree_distance_row['site1_id'] = tree1.site_id
                new_tree_distance_row['site2_id'] = tree2.site_id

            else:
                new_tree_distance_row['site1_id'] = tree2.site_id
                new_tree_distance_row['site2_id'] = tree1.site_id

            tree_distances.append(new_tree_distance_row)

    return tree_distances


def calculate_distances_and_persist(trees, start_idx, end_idx):
    print('Called with', start_idx, end_idx)

    tree_distances = calculate_distances_for_range(
        trees,
        start_idx,
        end_idx - start_idx
    )

    # Log progress
    print('{}:{} entries: {}'.format(start_idx, end_idx, len(tree_distances)))

    persist_distances(tree_distances)


if __name__ == '__main__':
    trees = None

    with engine.connect() as conn:
        result = conn.execute(select(tree_table))
        trees = result.all()

    N = len(trees)

    # Setup multiprocessing,
    ps = []
    for i in range(0, N, BATCH_SIZE):
        end_idx = min(i + BATCH_SIZE, N)
        p = Process(target=calculate_distances_and_persist,
                    args=(trees, i, end_idx))
        ps.append(p)

    for p in ps:
        p.start()

    for p in ps:
        p.join()

    print('done :)')
