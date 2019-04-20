/**
 * 
 */
package kievreclama.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author firsov
 *
 */
@Entity
@Table( name = "advertising_plot")
@SequenceGenerator(name="plot_sequence", sequenceName="id_plot", allocationSize=1)
public class AdvertisingPlot implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="plot_sequence")
	private int id;
	
	@Column(name = "number_doruchennya", nullable = false)
	private String numberDoruchennya;
	
	@Basic
	@Column(name = "name_doruchennya", nullable = false)
	private String nameDoruchennya;
	
	@Basic
	@Column(nullable = false)
	private String customer;
	
	@Basic
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	
	@Basic
	@Column(name = "end_date", nullable = false)
	private Date endDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "area_id")
	private AdvertisingArea advertisingArea;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumberDoruchennya() {
		return numberDoruchennya;
	}

	public void setNumberDoruchennya(String numberDoruchennya) {
		this.numberDoruchennya = numberDoruchennya;
	}

	public String getNameDoruchennya() {
		return nameDoruchennya;
	}

	public void setNameDoruchennya(String nameDoruchennya) {
		this.nameDoruchennya = nameDoruchennya;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public AdvertisingArea getAdvertisingArea() {
		return advertisingArea;
	}

	public void setAdvertisingArea(AdvertisingArea advertisingArea) {
		this.advertisingArea = advertisingArea;
	}
	
}
