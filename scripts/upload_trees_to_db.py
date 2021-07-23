import csv

from sqlalchemy import insert

from db_connect import engine
from tree_model import tree_table

trees_to_add = []

with open('../data/tree-inventory.csv') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')

    # Skip first row
    next(reader)

    for row in reader:
        tree_dict = {
            'nearest_building': row[0],
            'x': float(row[1]),
            'y': float(row[2]),
            'latitude': float(row[3]),
            'longitude': float(row[4]),
            'inventory_date': row[5],
            'site_id': int(row[6]),
            'site_comments': row[7],
            'site_last_changed_by': row[8],
            'site_change_date': row[9],
            'site_change_time': row[10],
            'species': row[11],
            'dbh': int(row[12]),
            'cultivar_abbreviation': row[15],
            'multistem': row[21] == 'Yes' or row[21] == 'Multi-stem'
        }

        trees_to_add.append(tree_dict)

with engine.connect() as conn:
    result = conn.execute(
        insert(tree_table),
        trees_to_add
    )
