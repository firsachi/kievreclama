/**
 * 
 */
package kievreclama.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingPlot;
import kievreclama.models.ModelPlot;
import kievreclama.repository.RepositoryPlot;
import kievreclama.services.transformers.BaseTransformer;


/**
 * @author firsov
 *
 */
@Stateless
public class ServicePlot {
	
	@EJB
	private RepositoryPlot repository;
	
	@EJB(beanName = "TracnsformerPlot")
	private BaseTransformer<AdvertisingPlot, ModelPlot> tracnsformer;

	public  void add(ModelPlot model) {
		repository.add(tracnsformer.modelEntity(model));
	}
	
	public List<ModelPlot> all() {
		List<ModelPlot> customers = new ArrayList<ModelPlot>();
		customers = repository.all().stream().map(entity -> tracnsformer.entityModel(entity)).collect(Collectors.toList());
		return customers;
	}

	public ModelPlot fing(int id) {
		return tracnsformer.entityModel(repository.find(id));
	}

	public ModelPlot update(ModelPlot plot) {
		return tracnsformer.entityModel(repository.update(tracnsformer.modelEntity(plot)));
	}

}
