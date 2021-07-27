package xyz.alprielse.uiuc_hammock_spots.db;

import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;
import xyz.alprielse.uiuc_hammock_spots.core.TreeDistance;

import java.util.List;

public class TreeDistanceDAO extends AbstractDAO<TreeDistance> {
    public TreeDistanceDAO(SessionFactory factory) {
        super(factory);
    }

    public List<TreeDistance> find(Double minimumDistance, Double maximumDistance) {
        List<TreeDistance> result = list(namedTypedQuery("xyz.alprielse.uiuc_hammock_spots.core.TreeDistance.find")
                .setParameter("minimum_distance", minimumDistance)
                .setParameter("maximum_distance", maximumDistance));

        return result;
    }

}
