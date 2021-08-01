package xyz.alprielse.uiuc_hammock_spots.core;


import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.beans.ConstructorProperties;

public class Tree {
    private String nearestBuilding;
    private Double x;
    private Double y;
    private Double latitude;
    private Double longitude;
    private String inventoryDate;
    private Integer siteId;
    private String siteComments;
    private String siteLastChangeBy;
    private String siteChangeDate;
    private String siteChangeTime;
    private String species;
    private Integer dbh;
    private String cultivarAbbreviation;
    private Boolean multistem;

    @ConstructorProperties({
            "nearestBuilding",
            "x",
            "y",
            "latitude",
            "longitude",
            "inventoryDate",
            "siteId",
            "siteComments",
            "siteLastChangeBy",
            "siteChangeDate",
            "siteChangeTime",
            "species",
            "dbh",
            "cultivarAbbreviation",
            "multistem"
    })
    public Tree(
            @ColumnName("nearest_building") String nearestBuilding,
            Double x,
            Double y,
            Double latitude,
            Double longitude,
            @ColumnName("inventory_date") String inventoryDate,
            @ColumnName("site_id") Integer siteId,
            @ColumnName("site_comments") String siteComments,
            @ColumnName("site_last_changed_by") String siteLastChangeBy,
            @ColumnName("site_change_date") String siteChangeDate,
            @ColumnName("site_change_time")String siteChangeTime,
            String species,
            Integer dbh,
            @ColumnName("cultivar_abbreviation") String cultivarAbbreviation,
            Integer multistem) {
        this.nearestBuilding = nearestBuilding;
        this.x = x;
        this.y = y;
        this.latitude = latitude;
        this.longitude = longitude;
        this.inventoryDate = inventoryDate;
        this.siteId = siteId;
        this.siteComments = siteComments;
        this.siteLastChangeBy = siteLastChangeBy;
        this.siteChangeDate = siteChangeDate;
        this.siteChangeTime = siteChangeTime;
        this.species = species;
        this.dbh = dbh;
        this.cultivarAbbreviation = cultivarAbbreviation;
        this.multistem = multistem == 1;
    }

    public String getNearestBuilding() {
        return nearestBuilding;
    }

    public void setNearestBuilding(String nearestBuilding) {
        this.nearestBuilding = nearestBuilding;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(String inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteComments() {
        return siteComments;
    }

    public void setSiteComments(String siteComments) {
        this.siteComments = siteComments;
    }

    public String getSiteLastChangeBy() {
        return siteLastChangeBy;
    }

    public void setSiteLastChangeBy(String siteLastChangeBy) {
        this.siteLastChangeBy = siteLastChangeBy;
    }

    public String getSiteChangeDate() {
        return siteChangeDate;
    }

    public void setSiteChangeDate(String siteChangeDate) {
        this.siteChangeDate = siteChangeDate;
    }

    public String getSiteChangeTime() {
        return siteChangeTime;
    }

    public void setSiteChangeTime(String siteChangeTime) {
        this.siteChangeTime = siteChangeTime;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getDbh() {
        return dbh;
    }

    public void setDbh(Integer dbh) {
        this.dbh = dbh;
    }

    public String getCultivarAbbreviation() {
        return cultivarAbbreviation;
    }

    public void setCultivarAbbreviation(String cultivarAbbreviation) {
        this.cultivarAbbreviation = cultivarAbbreviation;
    }

    public Boolean getMultistem() {
        return multistem;
    }

    public void setMultistem(Boolean multistem) {
        this.multistem = multistem;
    }
}
