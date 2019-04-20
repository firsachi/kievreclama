/**
 * 
 */
package kievreclama.services.transformers;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import kievreclama.entities.AdvertisingArea;
import kievreclama.entities.AdvertisingPlot;
import kievreclama.models.ModelArea;
import kievreclama.models.ModelPlot;

/**
 * @author firsov
 *
 */
@Stateless
public class TracnsformerPlot implements BaseTransformer<AdvertisingPlot, ModelPlot>{
	
	@EJB(beanName = "TransformerArea")
	private BaseTransformer<AdvertisingArea, ModelArea> transformer;

	@Override
	public AdvertisingPlot modelEntity(ModelPlot model) {
		AdvertisingPlot entity = new AdvertisingPlot();
		entity.setId(new Integer(model.getId()));
		entity.setNumberDoruchennya(model.getNumberDoruchennya());
		entity.setNameDoruchennya(model.getNameDoruchennya());
		entity.setCustomer(model.getCustomer());
		entity.setStartDate(model.getStartDate());
		entity.setEndDate(model.getEndDate());
		entity.setAdvertisingArea(transformer.modelEntity(model.getArea()));
		return entity;
	}

	@Override
	public ModelPlot entityModel(AdvertisingPlot entity) {
		ModelPlot model = new ModelPlot();
		model.setId(Integer.toString(entity.getId()));
		model.setNumberDoruchennya(entity.getNumberDoruchennya());
		model.setNameDoruchennya(entity.getNameDoruchennya());
		model.setCustomer(entity.getCustomer());
		model.setStartDate(entity.getStartDate());
		model.setEndDate(entity.getEndDate());
		model.setArea(transformer.entityModel(entity.getAdvertisingArea()));
		return model;
	}

}
