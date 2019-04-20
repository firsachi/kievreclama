/**
 * 
 */
package kievreclama.services.transformers;

import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingArea;
import kievreclama.models.ModelArea;

/**
 * @author firsov
 *
 */
@Stateless
public class TransformerArea implements BaseTransformer<AdvertisingArea, ModelArea>{

	@Override
	public AdvertisingArea modelEntity(ModelArea model) {
		AdvertisingArea entity = new AdvertisingArea();
		entity.setId(model.getIdArea());
		entity.setBoard(new Integer(model.getBoard()));
		entity.setLayposter(new Integer(model.getLayposter()));
		entity.setMetrolight(new Integer(model.getMetrolight()));
		return entity;
	}

	@Override
	public ModelArea entityModel(AdvertisingArea entity) {
		ModelArea model = new ModelArea();
		model.setIdArea(entity.getId());
		model.setBoard(Integer.toString(entity.getBoard()));
		model.setLayposter(Integer.toString(entity.getLayposter()));
		model.setMetrolight(Integer.toString(entity.getMetrolight()));
		return model;
	}

}
