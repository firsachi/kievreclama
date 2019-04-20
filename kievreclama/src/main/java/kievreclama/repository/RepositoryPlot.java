/**
 * 
 */
package kievreclama.repository;

import java.util.List;

import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingPlot;

/**
 * @author firsov
 *
 */
@Stateless
public class RepositoryPlot extends BaseRepository<AdvertisingPlot>{

	@Override
	public void delete(AdvertisingPlot entity) {
		// TODO Auto-generated method stub
	}

	public List<AdvertisingPlot> all() {
		String query = "FROM AdvertisingPlot plot";
		return getEntityManager().createQuery(query, AdvertisingPlot.class).getResultList();
	}

	public AdvertisingPlot find(int id) {
		return getEntityManager().find(AdvertisingPlot.class, id);
	}

}
