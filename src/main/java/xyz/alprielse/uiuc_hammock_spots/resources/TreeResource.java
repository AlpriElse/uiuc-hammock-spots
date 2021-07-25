package xyz.alprielse.uiuc_hammock_spots.resources;

import io.dropwizard.hibernate.UnitOfWork;
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
    @UnitOfWork
    public Response<List<Tree>> getTrees() {
        List<Tree> trees = treeDAO.findAll();

        Response<List<Tree>> res = new Response<>(200, true, trees);

        return res;
    }
}
