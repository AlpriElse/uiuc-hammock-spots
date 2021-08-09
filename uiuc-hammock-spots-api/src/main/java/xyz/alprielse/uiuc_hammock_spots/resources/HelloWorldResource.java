package xyz.alprielse.uiuc_hammock_spots.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class HelloWorldResource {

    public HelloWorldResource() {
        //  do nothing
    }

    @GET
    public boolean alive() {
        return true;
    }
}
