from sqlalchemy import CheckConstraint, MetaData, Table, Column, Integer, Float, ForeignKey

_metadata = MetaData()

tree_distance_table = Table(
    'tree_distances',
    _metadata,
    Column('site1_id', Integer, ForeignKey('trees.site_id')),
    Column('site2_id', Integer, ForeignKey('trees.site_id')),
    Column('distance', Float),
    CheckConstraint('site1_id > site2_id')
)
