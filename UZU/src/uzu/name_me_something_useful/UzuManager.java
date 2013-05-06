/**
 * 
 */
package uzu.name_me_something_useful;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import uzu.classes.Uzu;

/**
 * @author Marwan
 *
 */

@Named
@Stateless
public class UzuManager implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "uzu_db")
	EntityManager entityManager;
	
	private Uzu uzu;
	
	public UzuManager() {}
	public UzuManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
