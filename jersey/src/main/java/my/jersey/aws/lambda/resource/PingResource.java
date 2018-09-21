package my.jersey.aws.lambda.resource;


import java.util.Map;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.WILDCARD)
    public Response createPet() throws InterruptedException {
        Map<String, String> pong = new HashMap<>();
        Thread.sleep(1500);
        pong.put("pong", "Hello, World from Jersey - with a wait!");
        return Response.status(200).entity(pong).build();
    }
}