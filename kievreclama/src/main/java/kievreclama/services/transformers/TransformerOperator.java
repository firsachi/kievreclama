/**
 * 
 */
package kievreclama.services.transformers;

import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingOperator;
import kievreclama.models.ModelOpertor;

/**
 * @author firsov
 *
 */
@Stateless
public class TransformerOperator implements BaseTransformer<AdvertisingOperator, ModelOpertor>{
	
	private AdvertisingOperator entity;
	private ModelOpertor model;

	@Override
	public AdvertisingOperator modelEntity(ModelOpertor model) {
		entity = new AdvertisingOperator();
		entity.setId(new Integer(model.getId()));
		entity.setAdvertisingOperatorName(model.getNameOperator());
		return entity;
	}

	@Override
	public ModelOpertor entityModel(AdvertisingOperator entity) {
		model = new ModelOpertor();
		model.setId(Integer.toString(entity.getId()));
		model.setNameOperator(entity.getAdvertisingOperatorName());
		return model;
	}

}
