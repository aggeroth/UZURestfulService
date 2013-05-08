/*
 * Implementation of the UzuResource interface.
 */
package uzu.webservices;

import javax.inject.Inject;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import uzu.models.Uzu;
import uzu.name_me_something_useful.UzuManager;

public class UzuResourceService extends Application implements UzuResource {

	@Inject
	UzuManager entityManager;
	
	public Response createUzu(Uzu uzu) {
		String result = "Product created : " + uzu;
		return Response.status(201).entity(result).build();
	}

	public Uzu[] getUzus(long latitude, long longitude) {
		return entityManager.getAllUzusInRange(longitude, latitude);
	}

}
