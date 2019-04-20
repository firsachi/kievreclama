/**
 * 
 */
package kievreclama.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author firsov
 *
 */
@Entity
@Table
public class AdvertisingAssignment {
	
	@Id
	private int numberDoruchennya;
	
	@Basic
	@Column(nullable = false)
	private String nameDoruchennya;
	
	@Basic
	@Column(nullable = false)
	private String customer;
	
	public int getNumberDoruchennya() {
		return numberDoruchennya;
	}

	public void setNumberDoruchennya(int numberDoruchennya) {
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

}
