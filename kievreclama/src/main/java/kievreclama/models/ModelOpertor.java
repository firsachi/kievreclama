/**
 * 
 */
package kievreclama.models;

/**
 * @author firsov
 *
 */
public class ModelOpertor{

	private String id;
	
	private String nameOperator;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameOperator() {
		return nameOperator;
	}

	public void setNameOperator(String nameOperator) {
		this.nameOperator = nameOperator;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nameOperator == null) ? 0 : nameOperator.hashCode());
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
		ModelOpertor other = (ModelOpertor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nameOperator == null) {
			if (other.nameOperator != null)
				return false;
		} else if (!nameOperator.equals(other.nameOperator))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ModelOpertor [id=" + id + ", nameOperator=" + nameOperator + "]";
	}
	
}
