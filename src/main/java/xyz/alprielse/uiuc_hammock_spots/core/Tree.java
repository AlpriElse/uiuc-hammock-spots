package xyz.alprielse.uiuc_hammock_spots.core;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Tree {
    public abstract String nearestBuilding();

    public abstract Double x();

    public abstract Double y();

    public abstract Double latitude();

    public abstract Double longitude();

    public abstract String inventoryDate();

    public abstract Integer siteId();

    public abstract String siteComments();

    public abstract String siteLastChangeBy();

    public abstract String siteChangeDate();

    public abstract String siteChangeTime();

    public abstract String species();

    public abstract Integer dbh();

    public abstract String cultivarAbbreviation();

    public abstract Boolean multisteam();
}
