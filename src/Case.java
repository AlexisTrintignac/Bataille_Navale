
public class Case {
	private Coordonne coordonnee;
	private boolean touche;
	
	public Case(Coordonne coordonnee) {
		this.coordonnee = coordonnee;
		this.touche = false; 
	}

	public Coordonne getCoordonnee() {
		return coordonnee;
	}

	public boolean isTouche() {
		return touche;
	}
	
	public void setTouche(boolean touche) {
		this.touche = touche;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordonnee == null) ? 0 : coordonnee.hashCode());
		result = prime * result + (touche ? 1231 : 1237);
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
		Case other = (Case) obj;
		if (coordonnee == null) {
			if (other.coordonnee != null)
				return false;
		} else if (!coordonnee.equals(other.coordonnee))
			return false;
		if (touche != other.touche)
			return false;
		return true;
	}
	
	
}
