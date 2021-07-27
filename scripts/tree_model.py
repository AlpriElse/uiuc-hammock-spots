from sqlalchemy import PrimaryKeyConstraint, Table, Column, Integer, Float, String, Boolean, MetaData

_metadata = MetaData()

tree_table = Table(
    "trees",
    _metadata,
    Column('nearest_building', String),
    Column('x', Float),
    Column('y', Float),
    Column('latitude', Float),
    Column('longitude', Float),
    Column('inventory_date', String),
    Column('site_id', Integer),
    Column('site_comments', String),
    Column('site_last_changed_by', String),
    Column('site_change_date', String),
    Column('site_change_time', String),
    Column('species', String),
    Column('dbh', Integer),
    Column('cultivar_abbreviation', String),
    Column('multistem', Boolean),
    PrimaryKeyConstraint('site_id')
)
