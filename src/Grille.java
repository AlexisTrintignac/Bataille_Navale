import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grille {
	
	private static final int NB_LIGNES = 10;
	private static final int NB_COLONNES = 10;
	
	
	private List<Navire> bateaux;
	private HashMap<String,Case> grille;
	
	
	// X = abscisse
	// Y = colonne
	
	public Grille() {
		this.bateaux = new ArrayList<>();
		for (int i=0; i< NB_COLONNES; i++) {
			for (int j=0;j< NB_LIGNES; j++) {
				this.grille.put(i+""+j, new Case(new Coordonne(i,j)));
			}
		}
	}
	
	public String statusCase(Case c){
		if(c.isTouche()) {
			return("Touche");
		}else {
			return("Pas Touche");
		}
	}
	
	public void placerBateaux(Navire bateau, Case c) throws Exception{
		int getCaseX = c.getCoordonnee().getX();
		int getCaseY = c.getCoordonnee().getY();
		this.bateaux.add(bateau);
		switch (bateau.getDirection()) {
		case NORD :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+(-i)+""+getCaseY);
				if(getCaseX <= 0 || getCaseX > NB_LIGNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				if(getCaseY <= 0 || getCaseY > NB_COLONNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				bateau.getCaseList().add(value);
			}
		case SUD :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+i+""+getCaseY);
				if(getCaseX <= 0 || getCaseX > NB_LIGNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				if(getCaseY <= 0 || getCaseY > NB_COLONNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				bateau.getCaseList().add(value);
			}
		case OUEST :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+(-i));
				if(getCaseX <= 0 || getCaseX > NB_LIGNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				if(getCaseY <= 0 || getCaseY > NB_COLONNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				bateau.getCaseList().add(value);
			}
		case EST :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+i);
				if(getCaseX <= 0 || getCaseX > NB_LIGNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				if(getCaseY <= 0 || getCaseY > NB_COLONNES) {
					throw new IllegalArgumentException("Emplacement incorrect");
				}
				bateau.getCaseList().add(value);
			}
		default:
			break;
		}
	}
	
	public void tirer(Case c) throws Exception{
		if(c.isUtilisee()) {
			throw new IllegalArgumentException("La case à déjà été utilisée");
		}
		for(Navire currentNavire: this.bateaux) {
			if(currentNavire.estDansCase(c)) {
				currentNavire.tirer(c);
				if(currentNavire.getTaille() == 0) {
					System.out.println("bateau coule !");
		    	  }
		    	  break;
			}
		}
		System.out.println("Dans l'eau !");
	}
}
