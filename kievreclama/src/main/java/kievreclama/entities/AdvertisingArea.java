package kievreclama.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author firsov
 *
 */
@Entity
@Table(name = "advertising_area")
public class AdvertisingArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private UUID id;
	
	@Basic
	@Column(nullable=false)
	private int board;
	
	@Basic
	@Column(nullable=false)
	private int layposter;
	
	@Basic
	@Column(nullable=false)
	private int metrolight;
	
	@OneToOne(mappedBy = "advertisingArea")
	private AdvertisingPlot plot;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getBoard() {
		return board;
	}

	public void setBoard(int board) {
		this.board = board;
	}

	public int getLayposter() {
		return layposter;
	}

	public void setLayposter(int layposter) {
		this.layposter = layposter;
	}

	public int getMetrolight() {
		return metrolight;
	}

	public void setMetrolight(int metrolight) {
		this.metrolight = metrolight;
	}
	
	

}
