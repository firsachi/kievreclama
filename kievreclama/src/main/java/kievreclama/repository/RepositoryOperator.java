/**
 * 
 */
package kievreclama.repository;

import java.util.List;

import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingOperator;

/**
 * @author firsov
 *
 */
@Stateless
public class RepositoryOperator extends BaseRepository<AdvertisingOperator>{

	@Override
	public void delete(AdvertisingOperator entity) {
		getEntityManager().remove(find(entity.getId()));	
	}
	
	public AdvertisingOperator find(int id) {
		return getEntityManager().find(AdvertisingOperator.class, id);
	}
	
	public List<AdvertisingOperator> all(){
		String query = "FROM AdvertisingOperator operator ORDER BY operator.id";
		return getEntityManager().createQuery(query, AdvertisingOperator.class).getResultList();
	}
}
