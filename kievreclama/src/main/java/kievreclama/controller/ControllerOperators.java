/**
 * 
 */
package kievreclama.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import kievreclama.models.ModelOperator;
import kievreclama.services.ServiceOperator;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ControllerOperators implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1893558502338272465L;
	
	private List<ModelOperator> operators;
	
	private ModelOperator operator;
	
	private Integer index;
	
	@Inject
	private ServiceOperator service;

	@PostConstruct
	private void init() {
		operators = service.all();
		operator = new ModelOperator();
	}
	
	public String updateOprators() {
		operators.set(index, service.update(operator));
		return cansel();
	}
	
	public void actionSelectedOperator(ActionEvent event) {
		String id = (String) event.getComponent().getAttributes().get("opertorId");
		operator = service.fing(new Integer(id));
		index = operators.indexOf(operator);
	}
	
	public void actionAddOperator(ActionEvent event) {
		operator = new ModelOperator();
	}
	
	@Transactional
	public String addOperator() {
		operator.setId("0");
		operator = service.add(operator);
		operators.add(operator);
		return cansel();
	}
	
	public String counter(ModelOperator operator) {
		int result = operators.indexOf(operator) + 1;
		return Integer.toString(result);
	}
	
	public String cansel() {
		operator = new ModelOperator();
		return "operators?faces-redirect=true";
	}

	public List<ModelOperator> getOperators() {
		return operators;
	}

	public void setOperators(List<ModelOperator> operators) {
		this.operators = operators;
	}

	public ModelOperator getOperator() {
		return operator;
	}

	public void setOperator(ModelOperator operator) {
		this.operator = operator;
	}

}
