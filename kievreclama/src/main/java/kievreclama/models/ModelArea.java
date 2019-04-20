/**
 * 
 */
package kievreclama.models;

import java.util.UUID;

/**
 * @author firsov
 *
 */
public class ModelArea{

	private UUID idArea;
	
	private String board;
	
	private String layposter;
	
	private String metrolight;

	public UUID getIdArea() {
		return idArea;
	}

	public void setIdArea(UUID idArea) {
		this.idArea = idArea;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getLayposter() {
		return layposter;
	}

	public void setLayposter(String layposter) {
		this.layposter = layposter;
	}

	public String getMetrolight() {
		return metrolight;
	}

	public void setMetrolight(String metrolight) {
		this.metrolight = metrolight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((board == null) ? 0 : board.hashCode());
		result = prime * result + ((idArea == null) ? 0 : idArea.hashCode());
		result = prime * result + ((layposter == null) ? 0 : layposter.hashCode());
		result = prime * result + ((metrolight == null) ? 0 : metrolight.hashCode());
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
		ModelArea other = (ModelArea) obj;
		if (board == null) {
			if (other.board != null)
				return false;
		} else if (!board.equals(other.board))
			return false;
		if (idArea == null) {
			if (other.idArea != null)
				return false;
		} else if (!idArea.equals(other.idArea))
			return false;
		if (layposter == null) {
			if (other.layposter != null)
				return false;
		} else if (!layposter.equals(other.layposter))
			return false;
		if (metrolight == null) {
			if (other.metrolight != null)
				return false;
		} else if (!metrolight.equals(other.metrolight))
			return false;
		return true;
	}
	
}
