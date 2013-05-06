/*
 * Implementation of the UzuResource interface.
 */
package uzu.webservices;

import javax.ws.rs.core.Response;

import uzu.classes.Uzu;

public class UzuResourceService implements UzuResource {

	public Response createUzu(Uzu uzu) {
		String result = "Product created : " + uzu;
		return Response.status(201).entity(result).build();
	}

	public Uzu[] getUzus(long latitude, long longitude) {
		Uzu[] uzuArray = new Uzu[3];
		int uzuLength = uzuArray.length;
		for (int i = 0; i < uzuLength; ++i)
		{
			uzuArray[i] = new Uzu(i+1);
		}
		return uzuArray;
	}

}
