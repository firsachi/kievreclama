/**
 * 
 */
package kievreclama.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingOperator;
import kievreclama.models.ModelOperator;
import kievreclama.repository.RepositoryOperator;
import kievreclama.services.transformers.BaseTransformer;

/**
 * @author firsov
 *
 */
@Stateless
public class ServiceOperator {

	@EJB
	private RepositoryOperator repository;
	
	@EJB(beanName = "TransformerOperator")
	private BaseTransformer<AdvertisingOperator, ModelOperator> transformer;
	
	public List<ModelOperator> all(){
		List<ModelOperator> operators = new ArrayList<ModelOperator>();
		operators = repository.all().stream().map(operator -> transformer.entityModel(operator)).collect(Collectors.toList());
		return operators;
	}

	public ModelOperator add(ModelOperator operator) {
		return transformer.entityModel(repository.add(transformer.modelEntity(operator)));
	}

	public ModelOperator fing(int id) {
		return transformer.entityModel(repository.find(id));
	}

	public ModelOperator update(ModelOperator model) {
		return transformer.entityModel(repository.update(transformer.modelEntity(model)));
	}

}
