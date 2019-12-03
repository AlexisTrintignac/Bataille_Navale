
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
	
	
}
