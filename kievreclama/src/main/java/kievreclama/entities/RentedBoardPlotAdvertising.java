package kievreclama.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rentedBoard_plot_advertising")
public class RentedBoardPlotAdvertising implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	@ManyToOne
	@JoinColumn(name = "advertising_plot_id")
	private AdvertisingPlot advertisingPlot;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "area_id")
	private AdvertisingArea advertisingArea;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "operator_id")
	private AdvertisingOperator operator;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public AdvertisingPlot getAdvertisingPlot() {
		return advertisingPlot;
	}

	public void setAdvertisingPlot(AdvertisingPlot advertisingPlot) {
		this.advertisingPlot = advertisingPlot;
	}

	public AdvertisingArea getAdvertisingArea() {
		return advertisingArea;
	}

	public void setAdvertisingArea(AdvertisingArea advertisingArea) {
		this.advertisingArea = advertisingArea;
	}
	
}
