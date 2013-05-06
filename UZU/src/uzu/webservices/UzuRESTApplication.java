/**
 * 
 */
package uzu.webservices;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

/**
 * @author Marwan
 *
 */
public class UzuRESTApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public UzuRESTApplication(){
	     singletons.add(new UzuResourceService());
	}
	@Override
	public Set<Class<?>> getClasses() {
	     return empty;
	}
	@Override
	public Set<Object> getSingletons() {
	     return singletons;
	}
}