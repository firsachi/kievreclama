/**
 * 
 */
package kievreclama.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author firsov
 *
 */
public abstract class BaseRepository<E> {

	@PersistenceContext(unitName="kievreclamaDS")
	private EntityManager enManager;
	
	public EntityManager getEntityManager() {
		return this.enManager;
	}
	
	public E add(E entity) {
		enManager.persist(entity);
		return entity;
	}
	
	public E update(E entity) {
		return enManager.merge(entity);
	}
	
	public abstract void delete(E entity);
	
}
