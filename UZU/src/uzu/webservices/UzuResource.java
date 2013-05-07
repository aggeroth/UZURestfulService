/**
 * Interface for JAX-RS RESTful service.
 */
package uzu.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import uzu.models.Uzu;

/**
 * @author Marwan
 *
 */

@Path("/Ocean")
public interface UzuResource {
	
	@POST
	@Path("/Drop")
	@Consumes("application/json")
	public Response createUzu(Uzu uzu);
	
	@GET
	@Path("/Trawl/{latitude}/{longitude}")
	@Produces("application/json")
	public Uzu[] getUzus(@PathParam("latitude") long latitude, @PathParam("longitude") long longitude);
	
	
}
