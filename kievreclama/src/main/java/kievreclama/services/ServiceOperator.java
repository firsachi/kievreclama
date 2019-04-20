/**
 * 
 */
package kievreclama.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;

import kievreclama.entities.AdvertisingOperator;
import kievreclama.models.ModelOpertor;
import kievreclama.repository.RepositoryOperator;
import kievreclama.services.transformers.BaseTransformer;

/**
 * @author firsov
 *
 */
@ApplicationScoped
public class ServiceOperator {

	@EJB
	private RepositoryOperator repository;
	
	@EJB(beanName = "TransformerOperator")
	private BaseTransformer<AdvertisingOperator, ModelOpertor> transformer;
	
	public List<ModelOpertor> all(){
		List<ModelOpertor> operators = new ArrayList<ModelOpertor>();
		operators = repository.all().stream().map(operator -> transformer.entityModel(operator)).collect(Collectors.toList());
		return operators;
	}

	public ModelOpertor add(ModelOpertor operator) {
		return transformer.entityModel(repository.add(transformer.modelEntity(operator)));
	}

	public ModelOpertor fing(int id) {
		return transformer.entityModel(repository.find(id));
	}

	public ModelOpertor update(ModelOpertor model) {
		return transformer.entityModel(repository.update(transformer.modelEntity(model)));
	}
}
