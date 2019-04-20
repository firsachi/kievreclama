/**
 * 
 */
package kievreclama.models;

import java.util.Date;

/**
 * @author firsov
 *
 */
public class ModelPlot{
	
	private String id;
	
	private String numberDoruchennya;
	
	private String nameDoruchennya;
	
	private String customer;

	private ModelArea area;
	
	private Date startDate;
	
	private Date endDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public ModelArea getArea() {
		return area;
	}

	public void setArea(ModelArea area) {
		this.area = area;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nameDoruchennya == null) ? 0 : nameDoruchennya.hashCode());
		result = prime * result + ((numberDoruchennya == null) ? 0 : numberDoruchennya.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelPlot other = (ModelPlot) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameDoruchennya == null) {
			if (other.nameDoruchennya != null)
				return false;
		} else if (!nameDoruchennya.equals(other.nameDoruchennya))
			return false;
		if (numberDoruchennya == null) {
			if (other.numberDoruchennya != null)
				return false;
		} else if (!numberDoruchennya.equals(other.numberDoruchennya))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

}
