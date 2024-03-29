package uzu.something;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import uzu.models.Uzu;

/**
* @author Marwan
*
*/

@Stateless
public class UzuManager implements Serializable {

	private static final long serialVersionUID = 1L;
	private final float range = (float) 0.0004;
	
	@PersistenceContext(unitName = "uzu_db")
	EntityManager entityManager;
	
	public UzuManager() {}
	
	public Uzu[] getAllUzusInRange(float longitude, float latitude) {
		TypedQuery<Uzu> query = entityManager.createQuery("SELECT u FROM Uzu u " +
			"WHERE u.longitude <= :longitudeUpper " +
			"AND u.longitude >= :longitudeLower " +
			"AND u.latitude <= :latitudeUpper " +
			"AND u.latitude >= :latitudeLower ", Uzu.class);
		query.setParameter("longitudeUpper", longitude + range);
		query.setParameter("longitudeLower", longitude - range);
		query.setParameter("latitudeUpper", latitude + range);
		query.setParameter("latitudeLower", latitude - range);
		
		if (query.getResultList().size() > 0)
		{
			java.util.List<Uzu> items = query.getResultList();
            Uzu[] iarray = new Uzu[items.size()];

            for (int i = 0; i < iarray.length; i++) {
                    iarray[i] = items.get(i);
            }

            return iarray;
			//return (Uzu[]) query.getResultList().toArray();
		}
		return new Uzu[] {null, null, null};
	}

}
