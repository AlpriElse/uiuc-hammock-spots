package xyz.alprielse.uiuc_hammock_spots.resources;

import org.geojson.Feature;
import org.geojson.FeatureCollection;
import org.geojson.LineString;
import org.geojson.LngLatAlt;
import xyz.alprielse.uiuc_hammock_spots.core.Response;
import xyz.alprielse.uiuc_hammock_spots.core.TreeDistance;
import xyz.alprielse.uiuc_hammock_spots.db.TreeDistanceDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tree-distances")
@Produces(MediaType.APPLICATION_JSON)
public class TreeDistancesResource {
    private final TreeDistanceDAO treeDistanceDAO;

    public TreeDistancesResource(TreeDistanceDAO treeDistanceDAO) {
        this.treeDistanceDAO = treeDistanceDAO;
    }

    @GET
    public Response<List<TreeDistance>> getDistances(
            @QueryParam("minimum_distance") @DefaultValue("0.0") Double minimumDistance,
            @QueryParam("maximum_distance") @DefaultValue("25.0") Double maximumDistance
    ) {
        List<TreeDistance> distances = treeDistanceDAO.find(minimumDistance, maximumDistance);

        Response<List<TreeDistance>> res = new Response<>(200, true, distances);

        return res;
    }

    @GET
    @Path("/asGeoJSON")
    public Response<FeatureCollection> getTreeDistancesGeoJSON(
            @QueryParam("minimum_distance") @DefaultValue("0.0") Double minimumDistance,
            @QueryParam("maximum_distance") @DefaultValue("25.0") Double maximumDistance
    ){
        List<TreeDistance> distances = treeDistanceDAO.find(minimumDistance, maximumDistance);

        FeatureCollection distancesGeoJSON = new FeatureCollection();

        distances.stream()
                .map(distance -> convertDistanceToFeature(distance))
                .forEach(distanceFeature -> distancesGeoJSON.add(distanceFeature));

        Response<FeatureCollection> res = new Response<>(200, true, distancesGeoJSON);

        return res;
    }

    private Feature convertDistanceToFeature(TreeDistance distance) {
        Feature distanceFeature = new Feature();
        distanceFeature.setProperty("t1_site_id", distance.t1_site_id);
        distanceFeature.setProperty("t2_site_id", distance.t2_site_id);

        LngLatAlt t1Point = new LngLatAlt(distance.t1_longitude, distance.t1_latitude);
        LngLatAlt t2Point = new LngLatAlt(distance.t2_longitude, distance.t2_latitude);

        LineString hammock = new LineString(t1Point, t2Point);
        distanceFeature.setGeometry(hammock);

        return distanceFeature;
    }

}
