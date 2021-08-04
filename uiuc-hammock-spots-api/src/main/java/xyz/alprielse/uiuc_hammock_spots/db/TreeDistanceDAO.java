package xyz.alprielse.uiuc_hammock_spots.db;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import xyz.alprielse.uiuc_hammock_spots.core.TreeDistance;

import java.util.List;

@RegisterFieldMapper(TreeDistance.class)
public interface TreeDistanceDAO {
    @SqlQuery("SELECT d.site1_id as t1_site_id, " +
            "t1.latitude as t1_latitude, " +
            "t1.longitude as t1_longitude, " +
            "d.site2_id as t2_site_id, " +
            "t2.latitude as t2_latitude, " +
            "t2.longitude as t2_longitude, " +
            "d.distance as distance " +
            "FROM tree_distances d JOIN trees t1 ON d.site1_id = t1.site_id JOIN trees t2 ON d.site2_id = t2.site_id " +
            "WHERE t1.dbh > 1 AND t2.dbh > 1 " +
            "AND distance >= :minimum_distance AND distance <= :maximum_distance;")
    List<TreeDistance> find(
            @Bind("minimum_distance") Double minimumDistance,
            @Bind("maximum_distance") Double maximumDistance);
}
