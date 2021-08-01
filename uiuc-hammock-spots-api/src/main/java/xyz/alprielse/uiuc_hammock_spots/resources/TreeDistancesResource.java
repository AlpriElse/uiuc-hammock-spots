package xyz.alprielse.uiuc_hammock_spots.resources;

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
}
