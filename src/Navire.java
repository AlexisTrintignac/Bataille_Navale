import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Navire {
	int taille;
	String nom;
	Coordonne coordonne;
	Direction direction;
	List<Case> cases;
	
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
		ListIterator<Case> it = this.cases.listIterator();
	      while(it.hasNext()){
	         if(it.next().touche == false) {
	        	 return false;
	         }
	      }
	      return true;
	}
}
