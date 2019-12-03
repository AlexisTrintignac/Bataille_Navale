import java.util.ArrayList;
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
	ArrayList<Case> caseList;
	
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
			if (this.coordonne.getY() == c.getCoordonnee().getY() && (this.coordonne.getX() >= c.getCoordonnee().getX() && this.coordonne.getX() <= c.getCoordonnee().getX() + this.taille-1)) {
				return true;
			} else {
				return false;
			}
			} else {
				if (this.direction == this.direction.NORD) {
					if (this.coordonne.getY() == c.getCoordonnee().getY() && (this.coordonne.getX() <= c.getCoordonnee().getX() && this.coordonne.getX() >= c.getCoordonnee().getX() - this.taille-1)) {
						return true;
					} else {
						return false;
					}
			} else {
				if (this.direction == this.direction.OUEST) {
					if (this.coordonne.getX() == c.getCoordonnee().getX() && (this.coordonne.getY() >= c.getCoordonnee().getY() && this.coordonne.getY() <= c.getCoordonnee().getY() - this.taille-1)) {
						return true;
					} else {
						return false;
					}
			} else {
				if (this.direction == this.direction.EST) {
					if (this.coordonne.getX() == c.getCoordonnee().getX() && (this.coordonne.getY() <= c.getCoordonnee().getY() && this.coordonne.getY() >= c.getCoordonnee().getY() + this.taille-1)) {
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
		Iterator<Case> it = this.caseList.iterator();
		while (it.hasNext()) {
		       Case s = it.next();
		       if(s.isTouche()== false) {
		    	   return false;
		       }
		}
		return true;
	}
}
