/**
 * 
 */
package kievreclama.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author firsov
 *
 */
@Entity
@Table(name = "advertising_operator")
@SequenceGenerator(name="operator_sequence",sequenceName="id_operator",allocationSize=1)
public class AdvertisingOperator implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="operator_sequence")
	private int id;
	
	@Basic
	@Column(name = "advertising_operator_name", unique = true, nullable = false)
	private String advertisingOperatorName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdvertisingOperatorName() {
		return advertisingOperatorName;
	}

	public void setAdvertisingOperatorName(String advertisingOperatorName) {
		this.advertisingOperatorName = advertisingOperatorName;
	}
	
	
}
