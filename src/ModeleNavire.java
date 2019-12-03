
public enum ModeleNavire {
	PORTE_AVION(5), CROISEUR(4), TORPILLEUR(3),CONTRE_TORPILLEUR(3),SOUS_MARIN(2);

	private final int taille;
	
	private ModeleNavire(int taille) {
		this.taille = taille;
	}
	public int getTaille() {
		return taille;
	}
	
	
	
}
