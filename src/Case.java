
public class Case {
	private Coordonne coordonnee;
	private boolean touche;
	private boolean utilisee;
	
	public Case(Coordonne coordonnee) {
		this.coordonnee = coordonnee;
		this.touche = false; 
		this.utilisee = false;
	}

	public boolean isUtilisee() {
		return utilisee;
	}

	public void setUtilisee(boolean utilisee) {
		this.utilisee = utilisee;
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
