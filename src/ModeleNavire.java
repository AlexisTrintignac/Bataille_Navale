
public enum ModeleNavire {
	PORTE_AVION(5), SOUS_MARIN(2);

	private ModeleNavire(int taille) {
		this.taille = taille;
	}

	private int taille;

	public int getTaille() {
		return taille;
	}
	
	
	
}
