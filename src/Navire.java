import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

public class Navire {
	int taille;
	String nom;
	Coordonne coordonne;
	Direction direction;
	HashMap<String,Case> cases;
	
	public Navire(int taille, String nom, Coordonne coordonne, Direction direction) {
		this.taille = taille;
		this.nom = nom;
		this.coordonne = coordonne;
		this.direction = direction;
	}
	
	public void tirer(Case c) {
		
	}
	
	public Boolean estDansCase(Case c) {
		if (this.direction == this.direction.SUD) {
			if (this.coordonne.x == c.coordonnee.x && (this.coordonne.y >= c.coordonnee.y && this.coordonne.y <= c.coordonnee.y + this.taille-1)) {
				return true;
			} else {
				return false;
			}
			} else {
				if (this.direction == this.direction.NORD) {
					if (this.coordonne.x == c.coordonnee.x && (this.coordonne.y <= c.coordonnee.y && this.coordonne.y >= c.coordonnee.y - this.taille-1)) {
						return true;
					} else {
						return false;
					}
			} else {
				if (this.direction == this.direction.OUEST) {
					if (this.coordonne.y == c.coordonnee.y && (this.coordonne.x >= c.coordonnee.x && this.coordonne.x <= c.coordonnee.x - this.taille-1)) {
						return true;
					} else {
						return false;
					}
			} else {
				if (this.direction == this.direction.EST) {
					if (this.coordonne.y == c.coordonnee.y && (this.coordonne.x <= c.coordonnee.x && this.coordonne.x >= c.coordonnee.x + this.taille-1)) {
						return true;
					} else {
						return false;
					}
				}
				return false;
		
			}
		}
	}
}
	
	public Boolean estCoule() {
		for(Entry<String, Case> entry : this.cases.entrySet()) {
		    String cle = entry.getKey();
		    Case valeur = entry.getValue();
		    if(valeur.touche == false) {
		    	return false;
		    }
		}
		return true;
	}
}
