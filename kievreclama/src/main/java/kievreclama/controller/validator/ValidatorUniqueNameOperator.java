/**
 * 
 */
package kievreclama.controller.validator;

import java.util.ResourceBundle;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

import kievreclama.repository.RepositoryOperator;


/**
 * @author firsachi
 *
 */
@Named
@RequestScoped
public class ValidatorUniqueNameOperator implements Validator<String>{
	
	@EJB
	private RepositoryOperator repository; 

	@Override
	public void validate(FacesContext context, UIComponent component, String nameOperator) throws ValidatorException {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n.locale");
		if(0 == nameOperator.length() ) {
			messageError(resourceBundle.getString("error.null"));
		}
		
		if (!repository.findName(nameOperator).isEmpty()) {
			messageError(resourceBundle.getString("error.unique"));
		}
	}
	
	private void messageError(String message) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message) ;
		throw new ValidatorException(facesMessage);
	}

}
