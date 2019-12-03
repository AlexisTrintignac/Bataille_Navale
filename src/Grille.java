import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grille {
	
	List<Navire> bateaux;
	HashMap<String,Case> grille;
	int nb_lignes = 10;
	int nb_colonnes = 10;
	
	// X = abscisse
	// Y = colonne
	
	public Grille() {
		for (int i=0; i< this.nb_colonnes; i++) {
			for (int j=0;j<this.nb_lignes; j++) {
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
		switch (bateau.direction) {
		case NORD :
			for(int i = 1; i<= bateau.taille; i++) {
				Case value = this.grille.get(getCaseX+(-i)+""+getCaseY);
				bateau.caseList.add(value);
			}
		case SUD :
			for(int i = 1; i<= bateau.taille; i++) {
				Case value = this.grille.get(getCaseX+i+""+getCaseY);
				bateau.caseList.add(value);
			}
		case OUEST :
			for(int i = 1; i<= bateau.taille; i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+(-i));
				bateau.caseList.add(value);
			}
		case EST :
			for(int i = 1; i<= bateau.taille; i++) {
				Case value = this.grille.get(getCaseX+""+getCaseY+i);
				bateau.caseList.add(value);
			}
		default:
			break;
		}
	}
	
	public void tirer() {
		
	}
}
