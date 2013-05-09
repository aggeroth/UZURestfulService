/*
 * Implementation of the UzuResource interface.
 */
package uzu.webservices;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import uzu.models.Uzu;

@Stateless
public class UzuResourceService implements UzuResource {

	@PersistenceContext(unitName = "uzu_db")
	EntityManager entityManager;
	
	private final float range = (float) 0.0004;
	
	public Response createUzu(Uzu uzu) {
		//entityManager.persist(uzu);
		String result = "Product created : " + uzu;
		return Response.status(201).entity(result).build();
	}

	public Uzu[] getUzus(float latitude, float longitude) {
		return null;
	}

	@GET
	@Path("/Trawl/PopcornBag")
	@Produces("application/json")
	public Uzu[] getAllUzus() {
		TypedQuery<Uzu> query = entityManager.createQuery("SELECT u FROM Uzu u ", Uzu.class);
		return (Uzu[]) query.getResultList().toArray(); 
	}
	
}
