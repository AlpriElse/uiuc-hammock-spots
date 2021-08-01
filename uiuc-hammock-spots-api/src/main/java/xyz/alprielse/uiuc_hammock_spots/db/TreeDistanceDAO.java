package xyz.alprielse.uiuc_hammock_spots.db;

import org.jdbi.v3.sqlobject.config.RegisterFieldMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import xyz.alprielse.uiuc_hammock_spots.core.TreeDistance;

import java.util.List;

@RegisterFieldMapper(TreeDistance.class)
public interface TreeDistanceDAO {
    @SqlQuery("SELECT * FROM tree_distances WHERE distance >= :minimum_distance AND distance <= :maximum_distance")
    List<TreeDistance> find(
            @Bind("minimum_distance") Double minimumDistance,
            @Bind("maximum_distance") Double maximumDistance);
}
