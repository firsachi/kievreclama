/**
 * 
 */
package kievreclama.manages;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import kievreclama.models.ModelArea;
import kievreclama.models.ModelPlot;
import kievreclama.services.ServicePlot;

/**
 * @author firsov
 *
 */
@Named
@SessionScoped
public class ManagesPlots implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServicePlot service;
	
	private List<ModelPlot> plots;
	
	private ModelPlot createPlot;
	
	private ModelPlot selectedPlot;
	
	private Integer index;
	
	@PostConstruct
	private void init() {
		plots = service.all();
		createPlot = new ModelPlot();
		createPlot.setArea(new ModelArea());
	}
	
	public String edit() {
		plots.set(index, service.update(selectedPlot));
		selectedPlot = new ModelPlot();
		return cansel();
	}
	
	public void actionIsSelected(ActionEvent event) {
		String id = (String) event.getComponent().getAttributes().get("plotId");
		selectedPlot = service.fing(new Integer(id));
		index = plots.indexOf(selectedPlot);
		System.out.println(index);
	}
	
	public String add() {
		createPlot.setId("0");
		service.add(createPlot);
		plots.add(createPlot);
		createPlot = new ModelPlot();
		createPlot.setArea(new ModelArea());
		return cansel();
	}
	
	public String cansel() {
		return "plots?faces-redirect=true";
	}

	public List<ModelPlot> getPlots() {
		return plots;
	}

	public void setPlots(List<ModelPlot> plots) {
		this.plots = plots;
	}

	public ModelPlot getCreatePlot() {
		return createPlot;
	}

	public void setCreatePlot(ModelPlot createPlot) {
		this.createPlot = createPlot;
	}

	public ModelPlot getSelectedPlot() {
		return selectedPlot;
	}

	public void setSelectedPlot(ModelPlot selectedPlot) {
		this.selectedPlot = selectedPlot;
	}

	
}
