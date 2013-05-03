package org.jboss.samples.rs.webservices;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/MaRWaN")
public class HelloWorldResource {

	@GET()
	@Path("{myname}/{yourname}")
	@Produces("text/plain")
	public String sayHello(@PathParam("myname") String name, @PathParam("yourname") String yourName) {
	    return "Hello World! and " + name + " stuff " + yourName;
	}
}
