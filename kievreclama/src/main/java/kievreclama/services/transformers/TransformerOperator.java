/**
 * 
 */
package kievreclama.services.transformers;

import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingOperator;
import kievreclama.models.ModelOperator;

/**
 * @author firsov
 *
 */
@Stateless
public class TransformerOperator implements BaseTransformer<AdvertisingOperator, ModelOperator>{
	
	private AdvertisingOperator entity;
	private ModelOperator model;

	@Override
	public AdvertisingOperator modelEntity(ModelOperator model) {
		entity = new AdvertisingOperator();
		entity.setId(new Integer(model.getId()));
		entity.setAdvertisingOperatorName(model.getNameOperator());
		return entity;
	}

	@Override
	public ModelOperator entityModel(AdvertisingOperator entity) {
		model = new ModelOperator();
		model.setId(Integer.toString(entity.getId()));
		model.setNameOperator(entity.getAdvertisingOperatorName());
		return model;
	}

}
