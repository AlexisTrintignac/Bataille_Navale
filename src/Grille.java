import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Grille {
	
	private static final int NB_LIGNES = 10;
	private static final int NB_COLONNES = 10;
	
	
	private List<Navire> bateaux;
	private HashMap<String,Case> grille;
	
	
	// X = abscisse
	// Y = colonne
	
	public Grille() {
		this.bateaux = new ArrayList<>();
		for (int i=0; i< this.NB_COLONNES; i++) {
			for (int j=0;j<this.NB_LIGNES; j++) {
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
	
	public void placerBateaux(Navire bateau, Case c) {
		int getCaseX = c.getCoordonnee().getX();
		int getCaseY = c.getCoordonnee().getY();
		this.bateaux.add(bateau);
		switch (bateau.getDirection()) {
		case NORD :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+(-i)+""+getCaseY);
				bateau.getCaseList().add(value);
			}
		case SUD :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+i+""+getCaseY);
				bateau.getCaseList().add(value);
			}
		case OUEST :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+(-i));
				bateau.getCaseList().add(value);
			}
		case EST :
			for(int i = 1; i<= bateau.getTaille(); i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+i);
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
		    		   this.bateaux.remove(currentNavire);
		    	   }
		    	   break;
			}
		}
		System.out.println("Dans l'eau !");

	}
}
