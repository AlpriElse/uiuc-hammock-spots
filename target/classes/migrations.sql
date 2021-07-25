--liquibase formatted sql

--changeset author:aelse
CREATE TABLE trees (
  nearest_building      VARCHAR(64),
  x                     DOUBLE,
  y                     DOUBLE,
  latitude              DOUBLE,
  longitude             DOUBLE,
  inventory_date        VARCHAR(16),
  site_id               INT,
  site_comments         VARCHAR(128),
  site_last_changed_by  VARCHAR(32),
  site_change_date      VARCHAR(16),
  site_change_time      VARCHAR(16),
  species               VARCHAR(64),
  dbh                   INT,
  cultivar_abbreviation VARCHAR(8),
  multistem             TINYINT        -- 1 for true, 0 for false
);

--changeset aelse:1 created:07-23-2021
ALTER TABLE trees ADD PRIMARY KEY (site_id);

--changeset aelse:2 created:07-25-2021
CREATE TABLE tree_distances (
    site1_id INT,
    site2_id INT,
    distance DOUBLE,
    PRIMARY KEY (site1_id, site2_id),
    CHECK       (site1_id > site2_id),   -- enforce 'direction' to prevent double entries
    CHECK       (site1_id <> site2_id)
)