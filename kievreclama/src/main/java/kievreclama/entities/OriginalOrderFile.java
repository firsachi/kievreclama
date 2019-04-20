/**
 * 
 */
package kievreclama.entities;

import java.io.Serializable;

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
@Table(name = "original_order_file")
@SequenceGenerator(name="orderFile_sequence", sequenceName="id_orderFile", allocationSize=1)
public class OriginalOrderFile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="orderFile_sequence")
	private int id;
	
	@Column(name = "content_type", nullable = false)
	private String contentType;
	
	@Column(nullable = false)
	private String surname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
