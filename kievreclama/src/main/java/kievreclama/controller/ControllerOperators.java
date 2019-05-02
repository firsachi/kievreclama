/**
 * 
 */
package kievreclama.manages;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import kievreclama.models.ModelOpertor;
import kievreclama.services.ServiceOperator;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ManagesOperators implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1893558502338272465L;
	
	private List<ModelOpertor> operators;
	
	private ModelOpertor createOperator;
	
	private ModelOpertor selectedOperator;
	
	private Integer index;
	
	@Inject
	private ServiceOperator service;

	@PostConstruct
	private void init() {
		operators = service.all();
		createOperator = new ModelOpertor();
	}
	
	public String updateOprators() {
		operators.set(index, service.update(selectedOperator));
		selectedOperator = new ModelOpertor();
		return cansel();
	}
	
	public void actionSelectedOperator(ActionEvent event) {
		String id = (String) event.getComponent().getAttributes().get("opertorId");
		selectedOperator = service.fing(new Integer(id));
		index = operators.indexOf(selectedOperator);
	}
	
	public String addOperator() {
		createOperator.setId("0");
		createOperator = service.add(createOperator);
		operators.add(createOperator);
		createOperator = new ModelOpertor();
		return cansel();
	}
	
	public String cansel() {
		return "operators?faces-redirect=true";
	}

	public List<ModelOpertor> getOperators() {
		return operators;
	}

	public void setOperators(List<ModelOpertor> operators) {
		this.operators = operators;
	}

	public ModelOpertor getCreateOperator() {
		return createOperator;
	}

	public void setCreateOperator(ModelOpertor createOperator) {
		this.createOperator = createOperator;
	}

	public ModelOpertor getSelectedOperator() {
		return selectedOperator;
	}

	public void setSelectedOperator(ModelOpertor selectedOperator) {
		this.selectedOperator = selectedOperator;
	}
}
