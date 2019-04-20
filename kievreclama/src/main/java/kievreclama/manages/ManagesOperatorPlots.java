/**
 * 
 */
package kievreclama.manages;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import kievreclama.models.ModelOperatorPlot;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ManagesOperatorPlots implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ModelOperatorPlot> operatorPlots;

	public List<ModelOperatorPlot> getOperatorPlots() {
		return operatorPlots;
	}

	public void setOperatorPlots(List<ModelOperatorPlot> operatorPlots) {
		this.operatorPlots = operatorPlots;
	}
	
	

}
