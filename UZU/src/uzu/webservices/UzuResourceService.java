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
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import uzu.models.Uzu;

@Stateless
public class UzuResourceService extends Application implements UzuResource {

	@PersistenceContext(unitName = "uzu_db")
	EntityManager entityManager;
	
	private final float range = (float) 0.0004;
	
	public Response createUzu(Uzu uzu) {
		//entityManager.persist(uzu);
		String result = "Product created : " + uzu;
		return Response.status(201).entity(result).build();
	}

	public Uzu[] getUzus(float latitude, float longitude) {
		TypedQuery<Uzu> query = entityManager.createQuery("SELECT u FROM Uzu u " +
				"WHERE u.longitude <= :longitudeUpper " +
				"AND u.longitude >= :longitudeLower " +
				"AND u.latitude <= :latitudeUpper " +
				"AND u.latitude >= :latitudeLower ", Uzu.class);
		query.setParameter("longitudeUpper", longitude + range);
		query.setParameter("longitudeLower", longitude - range);
		query.setParameter("latitudeUpper", latitude + range);
		query.setParameter("latitudeLower", latitude - range);
		//return (Uzu[]) query.getResultList().toArray();
		if (query.getResultList().size() > 0)
		{
			return (Uzu[]) query.getResultList().toArray();
		}
		Uzu[] uzuArray = new Uzu[] {null, null, null};
		return uzuArray;
	}

	@GET
	@Path("/Trawl/PopcornBag")
	@Produces("application/json")
	public Uzu[] getAllUzus() {
		TypedQuery<Uzu> query = entityManager.createQuery("SELECT u FROM Uzu u ", Uzu.class);
		return (Uzu[]) query.getResultList().toArray(); 
	}
	
}
