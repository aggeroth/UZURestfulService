/**
 * 
 */
package uzu.name_me_something_useful;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Marwan
 *
 */

@Stateless
public class UzuManager implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "uzu_db")
	EntityManager entityManager;
	
	public UzuManager() {}
	
}
