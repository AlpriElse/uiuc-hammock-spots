package xyz.alprielse.uiuc_hammock_spots.core;

import javax.persistence.*;

@Entity(name = "trees")
@NamedQueries({
        @NamedQuery(
                name = "xyz.alprielse.uiuc_hammock_spots.core.Tree.findAll",
                query = "FROM trees t"
        )
})
public class Tree {
    @Column(name = "nearest_building")
    private String nearestBuilding;

    private Double x;

    private Double y;

    private Double latitude;

    private Double longitude;

    @Column(name = "inventory_date")
    private String inventoryDate;

    @Id
    @Column(name = "site_id")
    private Integer siteId;

    @Column(name = "site_comments")
    private String siteComments;

    @Column(name = "site_last_changed_by")
    private String siteLastChangeBy;

    @Column(name = "site_change_date")
    private String siteChangeDate;

    @Column(name = "site_change_time")
    private String siteChangeTime;

    private String species;

    private Integer dbh;

    @Column(name = "cultivar_abbreviation")
    private String cultivarAbbreviation;

    @Column(columnDefinition = "tinyint")
    private Boolean multistem;

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
