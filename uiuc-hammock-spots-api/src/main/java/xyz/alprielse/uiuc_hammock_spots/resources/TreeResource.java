package xyz.alprielse.uiuc_hammock_spots.resources;

import org.geojson.Feature;
import org.geojson.FeatureCollection;
import org.geojson.Point;
import xyz.alprielse.uiuc_hammock_spots.core.Response;
import xyz.alprielse.uiuc_hammock_spots.core.Tree;
import xyz.alprielse.uiuc_hammock_spots.db.TreeDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/trees")
@Produces(MediaType.APPLICATION_JSON)
public class TreeResource {

    private final TreeDAO treeDAO;

    public TreeResource(TreeDAO treeDAO) {
        this.treeDAO = treeDAO;
    }

    @GET
    public Response<List<Tree>> getTrees() {
        List<Tree> trees = treeDAO.findAll();

        Response<List<Tree>> res = new Response<>(200, true, trees);

        return res;
    }

    @GET
    @Path("/asGeoJSON")
    public Response<FeatureCollection> getTreesGeoJSON() {
        List<Tree> trees = treeDAO.findAll();

        FeatureCollection treesGeoJSON = new FeatureCollection();

        trees.stream()
                .map(tree -> convertTreeToFeature(tree))
                .forEach(treeFeature -> treesGeoJSON.add(treeFeature));

        Response<FeatureCollection> res = new Response<>(200, true, treesGeoJSON);

        return res;
    }

    private Feature convertTreeToFeature(Tree tree) {
        Feature treeFeature = new Feature();
        treeFeature.setProperty("dbh", tree.getDbh());

        Point treeGeometry = new Point(tree.getLongitude(), tree.getLatitude());
        treeFeature.setGeometry(treeGeometry);

        return treeFeature;
    }
}
