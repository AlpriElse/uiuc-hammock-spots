from sqlalchemy import MetaData, Table, Column, Integer, Float

_metadata = MetaData()

tree_distance_table = Table(
    'tree_distances',
    _metadata,
    Column('site1_id', Integer),
    Column('site2_id', Integer),
    Column('distance', Float)
)
