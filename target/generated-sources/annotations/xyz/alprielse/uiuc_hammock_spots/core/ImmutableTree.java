package xyz.alprielse.uiuc_hammock_spots.core;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Tree}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTree.builder()}.
 */
@Generated(from = "Tree", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableTree extends Tree {
  private final String nearestBuilding;
  private final Double x;
  private final Double y;
  private final Double latitude;
  private final Double longitude;
  private final String inventoryDate;
  private final Integer siteId;
  private final String siteComments;
  private final String siteLastChangeBy;
  private final String siteChangeDate;
  private final String siteChangeTime;
  private final String species;
  private final Integer dbh;
  private final String cultivarAbbreviation;
  private final Boolean multisteam;

  private ImmutableTree(
      String nearestBuilding,
      Double x,
      Double y,
      Double latitude,
      Double longitude,
      String inventoryDate,
      Integer siteId,
      String siteComments,
      String siteLastChangeBy,
      String siteChangeDate,
      String siteChangeTime,
      String species,
      Integer dbh,
      String cultivarAbbreviation,
      Boolean multisteam) {
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
    this.multisteam = multisteam;
  }

  /**
   * @return The value of the {@code nearestBuilding} attribute
   */
  @Override
  public String nearestBuilding() {
    return nearestBuilding;
  }

  /**
   * @return The value of the {@code x} attribute
   */
  @Override
  public Double x() {
    return x;
  }

  /**
   * @return The value of the {@code y} attribute
   */
  @Override
  public Double y() {
    return y;
  }

  /**
   * @return The value of the {@code latitude} attribute
   */
  @Override
  public Double latitude() {
    return latitude;
  }

  /**
   * @return The value of the {@code longitude} attribute
   */
  @Override
  public Double longitude() {
    return longitude;
  }

  /**
   * @return The value of the {@code inventoryDate} attribute
   */
  @Override
  public String inventoryDate() {
    return inventoryDate;
  }

  /**
   * @return The value of the {@code siteId} attribute
   */
  @Override
  public Integer siteId() {
    return siteId;
  }

  /**
   * @return The value of the {@code siteComments} attribute
   */
  @Override
  public String siteComments() {
    return siteComments;
  }

  /**
   * @return The value of the {@code siteLastChangeBy} attribute
   */
  @Override
  public String siteLastChangeBy() {
    return siteLastChangeBy;
  }

  /**
   * @return The value of the {@code siteChangeDate} attribute
   */
  @Override
  public String siteChangeDate() {
    return siteChangeDate;
  }

  /**
   * @return The value of the {@code siteChangeTime} attribute
   */
  @Override
  public String siteChangeTime() {
    return siteChangeTime;
  }

  /**
   * @return The value of the {@code species} attribute
   */
  @Override
  public String species() {
    return species;
  }

  /**
   * @return The value of the {@code dbh} attribute
   */
  @Override
  public Integer dbh() {
    return dbh;
  }

  /**
   * @return The value of the {@code cultivarAbbreviation} attribute
   */
  @Override
  public String cultivarAbbreviation() {
    return cultivarAbbreviation;
  }

  /**
   * @return The value of the {@code multisteam} attribute
   */
  @Override
  public Boolean multisteam() {
    return multisteam;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#nearestBuilding() nearestBuilding} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nearestBuilding
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withNearestBuilding(String value) {
    String newValue = Objects.requireNonNull(value, "nearestBuilding");
    if (this.nearestBuilding.equals(newValue)) return this;
    return new ImmutableTree(
        newValue,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#x() x} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for x
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withX(Double value) {
    Double newValue = Objects.requireNonNull(value, "x");
    if (this.x.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        newValue,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#y() y} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for y
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withY(Double value) {
    Double newValue = Objects.requireNonNull(value, "y");
    if (this.y.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        newValue,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#latitude() latitude} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for latitude
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withLatitude(Double value) {
    Double newValue = Objects.requireNonNull(value, "latitude");
    if (this.latitude.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        newValue,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#longitude() longitude} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for longitude
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withLongitude(Double value) {
    Double newValue = Objects.requireNonNull(value, "longitude");
    if (this.longitude.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        newValue,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#inventoryDate() inventoryDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for inventoryDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withInventoryDate(String value) {
    String newValue = Objects.requireNonNull(value, "inventoryDate");
    if (this.inventoryDate.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        newValue,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#siteId() siteId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for siteId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSiteId(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "siteId");
    if (this.siteId.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        newValue,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#siteComments() siteComments} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for siteComments
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSiteComments(String value) {
    String newValue = Objects.requireNonNull(value, "siteComments");
    if (this.siteComments.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        newValue,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#siteLastChangeBy() siteLastChangeBy} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for siteLastChangeBy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSiteLastChangeBy(String value) {
    String newValue = Objects.requireNonNull(value, "siteLastChangeBy");
    if (this.siteLastChangeBy.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        newValue,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#siteChangeDate() siteChangeDate} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for siteChangeDate
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSiteChangeDate(String value) {
    String newValue = Objects.requireNonNull(value, "siteChangeDate");
    if (this.siteChangeDate.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        newValue,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#siteChangeTime() siteChangeTime} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for siteChangeTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSiteChangeTime(String value) {
    String newValue = Objects.requireNonNull(value, "siteChangeTime");
    if (this.siteChangeTime.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        newValue,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#species() species} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for species
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withSpecies(String value) {
    String newValue = Objects.requireNonNull(value, "species");
    if (this.species.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        newValue,
        this.dbh,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#dbh() dbh} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dbh
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withDbh(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "dbh");
    if (this.dbh.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        newValue,
        this.cultivarAbbreviation,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#cultivarAbbreviation() cultivarAbbreviation} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cultivarAbbreviation
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withCultivarAbbreviation(String value) {
    String newValue = Objects.requireNonNull(value, "cultivarAbbreviation");
    if (this.cultivarAbbreviation.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        newValue,
        this.multisteam);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Tree#multisteam() multisteam} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for multisteam
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTree withMultisteam(Boolean value) {
    Boolean newValue = Objects.requireNonNull(value, "multisteam");
    if (this.multisteam.equals(newValue)) return this;
    return new ImmutableTree(
        this.nearestBuilding,
        this.x,
        this.y,
        this.latitude,
        this.longitude,
        this.inventoryDate,
        this.siteId,
        this.siteComments,
        this.siteLastChangeBy,
        this.siteChangeDate,
        this.siteChangeTime,
        this.species,
        this.dbh,
        this.cultivarAbbreviation,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTree} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTree
        && equalTo((ImmutableTree) another);
  }

  private boolean equalTo(ImmutableTree another) {
    return nearestBuilding.equals(another.nearestBuilding)
        && x.equals(another.x)
        && y.equals(another.y)
        && latitude.equals(another.latitude)
        && longitude.equals(another.longitude)
        && inventoryDate.equals(another.inventoryDate)
        && siteId.equals(another.siteId)
        && siteComments.equals(another.siteComments)
        && siteLastChangeBy.equals(another.siteLastChangeBy)
        && siteChangeDate.equals(another.siteChangeDate)
        && siteChangeTime.equals(another.siteChangeTime)
        && species.equals(another.species)
        && dbh.equals(another.dbh)
        && cultivarAbbreviation.equals(another.cultivarAbbreviation)
        && multisteam.equals(another.multisteam);
  }

  /**
   * Computes a hash code from attributes: {@code nearestBuilding}, {@code x}, {@code y}, {@code latitude}, {@code longitude}, {@code inventoryDate}, {@code siteId}, {@code siteComments}, {@code siteLastChangeBy}, {@code siteChangeDate}, {@code siteChangeTime}, {@code species}, {@code dbh}, {@code cultivarAbbreviation}, {@code multisteam}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + nearestBuilding.hashCode();
    h += (h << 5) + x.hashCode();
    h += (h << 5) + y.hashCode();
    h += (h << 5) + latitude.hashCode();
    h += (h << 5) + longitude.hashCode();
    h += (h << 5) + inventoryDate.hashCode();
    h += (h << 5) + siteId.hashCode();
    h += (h << 5) + siteComments.hashCode();
    h += (h << 5) + siteLastChangeBy.hashCode();
    h += (h << 5) + siteChangeDate.hashCode();
    h += (h << 5) + siteChangeTime.hashCode();
    h += (h << 5) + species.hashCode();
    h += (h << 5) + dbh.hashCode();
    h += (h << 5) + cultivarAbbreviation.hashCode();
    h += (h << 5) + multisteam.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Tree} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Tree")
        .omitNullValues()
        .add("nearestBuilding", nearestBuilding)
        .add("x", x)
        .add("y", y)
        .add("latitude", latitude)
        .add("longitude", longitude)
        .add("inventoryDate", inventoryDate)
        .add("siteId", siteId)
        .add("siteComments", siteComments)
        .add("siteLastChangeBy", siteLastChangeBy)
        .add("siteChangeDate", siteChangeDate)
        .add("siteChangeTime", siteChangeTime)
        .add("species", species)
        .add("dbh", dbh)
        .add("cultivarAbbreviation", cultivarAbbreviation)
        .add("multisteam", multisteam)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Tree} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Tree instance
   */
  public static ImmutableTree copyOf(Tree instance) {
    if (instance instanceof ImmutableTree) {
      return (ImmutableTree) instance;
    }
    return ImmutableTree.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTree ImmutableTree}.
   * <pre>
   * ImmutableTree.builder()
   *    .nearestBuilding(String) // required {@link Tree#nearestBuilding() nearestBuilding}
   *    .x(Double) // required {@link Tree#x() x}
   *    .y(Double) // required {@link Tree#y() y}
   *    .latitude(Double) // required {@link Tree#latitude() latitude}
   *    .longitude(Double) // required {@link Tree#longitude() longitude}
   *    .inventoryDate(String) // required {@link Tree#inventoryDate() inventoryDate}
   *    .siteId(Integer) // required {@link Tree#siteId() siteId}
   *    .siteComments(String) // required {@link Tree#siteComments() siteComments}
   *    .siteLastChangeBy(String) // required {@link Tree#siteLastChangeBy() siteLastChangeBy}
   *    .siteChangeDate(String) // required {@link Tree#siteChangeDate() siteChangeDate}
   *    .siteChangeTime(String) // required {@link Tree#siteChangeTime() siteChangeTime}
   *    .species(String) // required {@link Tree#species() species}
   *    .dbh(Integer) // required {@link Tree#dbh() dbh}
   *    .cultivarAbbreviation(String) // required {@link Tree#cultivarAbbreviation() cultivarAbbreviation}
   *    .multisteam(Boolean) // required {@link Tree#multisteam() multisteam}
   *    .build();
   * </pre>
   * @return A new ImmutableTree builder
   */
  public static ImmutableTree.Builder builder() {
    return new ImmutableTree.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTree ImmutableTree}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Tree", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NEAREST_BUILDING = 0x1L;
    private static final long INIT_BIT_X = 0x2L;
    private static final long INIT_BIT_Y = 0x4L;
    private static final long INIT_BIT_LATITUDE = 0x8L;
    private static final long INIT_BIT_LONGITUDE = 0x10L;
    private static final long INIT_BIT_INVENTORY_DATE = 0x20L;
    private static final long INIT_BIT_SITE_ID = 0x40L;
    private static final long INIT_BIT_SITE_COMMENTS = 0x80L;
    private static final long INIT_BIT_SITE_LAST_CHANGE_BY = 0x100L;
    private static final long INIT_BIT_SITE_CHANGE_DATE = 0x200L;
    private static final long INIT_BIT_SITE_CHANGE_TIME = 0x400L;
    private static final long INIT_BIT_SPECIES = 0x800L;
    private static final long INIT_BIT_DBH = 0x1000L;
    private static final long INIT_BIT_CULTIVAR_ABBREVIATION = 0x2000L;
    private static final long INIT_BIT_MULTISTEAM = 0x4000L;
    private long initBits = 0x7fffL;

    private @Nullable String nearestBuilding;
    private @Nullable Double x;
    private @Nullable Double y;
    private @Nullable Double latitude;
    private @Nullable Double longitude;
    private @Nullable String inventoryDate;
    private @Nullable Integer siteId;
    private @Nullable String siteComments;
    private @Nullable String siteLastChangeBy;
    private @Nullable String siteChangeDate;
    private @Nullable String siteChangeTime;
    private @Nullable String species;
    private @Nullable Integer dbh;
    private @Nullable String cultivarAbbreviation;
    private @Nullable Boolean multisteam;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Tree} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Tree instance) {
      Objects.requireNonNull(instance, "instance");
      nearestBuilding(instance.nearestBuilding());
      x(instance.x());
      y(instance.y());
      latitude(instance.latitude());
      longitude(instance.longitude());
      inventoryDate(instance.inventoryDate());
      siteId(instance.siteId());
      siteComments(instance.siteComments());
      siteLastChangeBy(instance.siteLastChangeBy());
      siteChangeDate(instance.siteChangeDate());
      siteChangeTime(instance.siteChangeTime());
      species(instance.species());
      dbh(instance.dbh());
      cultivarAbbreviation(instance.cultivarAbbreviation());
      multisteam(instance.multisteam());
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#nearestBuilding() nearestBuilding} attribute.
     * @param nearestBuilding The value for nearestBuilding 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder nearestBuilding(String nearestBuilding) {
      this.nearestBuilding = Objects.requireNonNull(nearestBuilding, "nearestBuilding");
      initBits &= ~INIT_BIT_NEAREST_BUILDING;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#x() x} attribute.
     * @param x The value for x 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder x(Double x) {
      this.x = Objects.requireNonNull(x, "x");
      initBits &= ~INIT_BIT_X;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#y() y} attribute.
     * @param y The value for y 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder y(Double y) {
      this.y = Objects.requireNonNull(y, "y");
      initBits &= ~INIT_BIT_Y;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#latitude() latitude} attribute.
     * @param latitude The value for latitude 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder latitude(Double latitude) {
      this.latitude = Objects.requireNonNull(latitude, "latitude");
      initBits &= ~INIT_BIT_LATITUDE;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#longitude() longitude} attribute.
     * @param longitude The value for longitude 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder longitude(Double longitude) {
      this.longitude = Objects.requireNonNull(longitude, "longitude");
      initBits &= ~INIT_BIT_LONGITUDE;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#inventoryDate() inventoryDate} attribute.
     * @param inventoryDate The value for inventoryDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder inventoryDate(String inventoryDate) {
      this.inventoryDate = Objects.requireNonNull(inventoryDate, "inventoryDate");
      initBits &= ~INIT_BIT_INVENTORY_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#siteId() siteId} attribute.
     * @param siteId The value for siteId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder siteId(Integer siteId) {
      this.siteId = Objects.requireNonNull(siteId, "siteId");
      initBits &= ~INIT_BIT_SITE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#siteComments() siteComments} attribute.
     * @param siteComments The value for siteComments 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder siteComments(String siteComments) {
      this.siteComments = Objects.requireNonNull(siteComments, "siteComments");
      initBits &= ~INIT_BIT_SITE_COMMENTS;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#siteLastChangeBy() siteLastChangeBy} attribute.
     * @param siteLastChangeBy The value for siteLastChangeBy 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder siteLastChangeBy(String siteLastChangeBy) {
      this.siteLastChangeBy = Objects.requireNonNull(siteLastChangeBy, "siteLastChangeBy");
      initBits &= ~INIT_BIT_SITE_LAST_CHANGE_BY;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#siteChangeDate() siteChangeDate} attribute.
     * @param siteChangeDate The value for siteChangeDate 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder siteChangeDate(String siteChangeDate) {
      this.siteChangeDate = Objects.requireNonNull(siteChangeDate, "siteChangeDate");
      initBits &= ~INIT_BIT_SITE_CHANGE_DATE;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#siteChangeTime() siteChangeTime} attribute.
     * @param siteChangeTime The value for siteChangeTime 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder siteChangeTime(String siteChangeTime) {
      this.siteChangeTime = Objects.requireNonNull(siteChangeTime, "siteChangeTime");
      initBits &= ~INIT_BIT_SITE_CHANGE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#species() species} attribute.
     * @param species The value for species 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder species(String species) {
      this.species = Objects.requireNonNull(species, "species");
      initBits &= ~INIT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#dbh() dbh} attribute.
     * @param dbh The value for dbh 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder dbh(Integer dbh) {
      this.dbh = Objects.requireNonNull(dbh, "dbh");
      initBits &= ~INIT_BIT_DBH;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#cultivarAbbreviation() cultivarAbbreviation} attribute.
     * @param cultivarAbbreviation The value for cultivarAbbreviation 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder cultivarAbbreviation(String cultivarAbbreviation) {
      this.cultivarAbbreviation = Objects.requireNonNull(cultivarAbbreviation, "cultivarAbbreviation");
      initBits &= ~INIT_BIT_CULTIVAR_ABBREVIATION;
      return this;
    }

    /**
     * Initializes the value for the {@link Tree#multisteam() multisteam} attribute.
     * @param multisteam The value for multisteam 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder multisteam(Boolean multisteam) {
      this.multisteam = Objects.requireNonNull(multisteam, "multisteam");
      initBits &= ~INIT_BIT_MULTISTEAM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTree ImmutableTree}.
     * @return An immutable instance of Tree
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTree build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTree(
          nearestBuilding,
          x,
          y,
          latitude,
          longitude,
          inventoryDate,
          siteId,
          siteComments,
          siteLastChangeBy,
          siteChangeDate,
          siteChangeTime,
          species,
          dbh,
          cultivarAbbreviation,
          multisteam);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_NEAREST_BUILDING) != 0) attributes.add("nearestBuilding");
      if ((initBits & INIT_BIT_X) != 0) attributes.add("x");
      if ((initBits & INIT_BIT_Y) != 0) attributes.add("y");
      if ((initBits & INIT_BIT_LATITUDE) != 0) attributes.add("latitude");
      if ((initBits & INIT_BIT_LONGITUDE) != 0) attributes.add("longitude");
      if ((initBits & INIT_BIT_INVENTORY_DATE) != 0) attributes.add("inventoryDate");
      if ((initBits & INIT_BIT_SITE_ID) != 0) attributes.add("siteId");
      if ((initBits & INIT_BIT_SITE_COMMENTS) != 0) attributes.add("siteComments");
      if ((initBits & INIT_BIT_SITE_LAST_CHANGE_BY) != 0) attributes.add("siteLastChangeBy");
      if ((initBits & INIT_BIT_SITE_CHANGE_DATE) != 0) attributes.add("siteChangeDate");
      if ((initBits & INIT_BIT_SITE_CHANGE_TIME) != 0) attributes.add("siteChangeTime");
      if ((initBits & INIT_BIT_SPECIES) != 0) attributes.add("species");
      if ((initBits & INIT_BIT_DBH) != 0) attributes.add("dbh");
      if ((initBits & INIT_BIT_CULTIVAR_ABBREVIATION) != 0) attributes.add("cultivarAbbreviation");
      if ((initBits & INIT_BIT_MULTISTEAM) != 0) attributes.add("multisteam");
      return "Cannot build Tree, some of required attributes are not set " + attributes;
    }
  }
}
