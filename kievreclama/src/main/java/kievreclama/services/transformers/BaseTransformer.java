/**
 * 
 */
package kievreclama.services.transformers;

import javax.ejb.Local;

/**
 * @author firsov
 *
 */
@Local
public interface BaseTransformer<E, M> {

	public E modelEntity(M model);
	
	public M entityModel(E entity);
}
