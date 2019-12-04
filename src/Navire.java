import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;

public class Navire {
	
	private int taille;
	private String nom;
	private Coordonne coordonne;
	private Direction direction;
	private List<Case> caseList;
	
	public Navire(int taille, String nom, Coordonne coordonne, Direction direction) {
		this.taille = taille;
		this.nom = nom;
		this.coordonne = coordonne;
		this.direction = direction;
	}
	
	public void tirer(Case c) {
		for(Case currentCase: this.caseList) {
			if(currentCase.equals(c)) {
				currentCase.setTouche(true);
				currentCase.setUtilisee(true);
			}
		}
		if(this.estCoule()) {
			System.out.println("bateau coulé !");
			this.taille = 0;
		}
	}
	
	public Boolean estDansCase(Case c) {
		if (this.direction == this.direction.SUD) {
			return estCaseDansNavireSud(c);
		} else {
			if (this.direction == this.direction.NORD) {
				return estCaseDansNavireNord(c);
		} else {
			if (this.direction == this.direction.OUEST) {
				return estCaseDansNavireOuest(c);
		} else {
			if (this.direction == this.direction.EST) {
				return estCaseDansNavireEst(c);
			}
			return false;
	
		}
		}
	}
}

	private Boolean estCaseDansNavireEst(Case c) {
		if (this.coordonne.getX() == c.getCoordonnee().getX() && (this.coordonne.getY() <= c.getCoordonnee().getY() && this.coordonne.getY() >= c.getCoordonnee().getY() + this.taille-1)) {
			return true;
		} else {
			return false;
		}
	}

	private Boolean estCaseDansNavireOuest(Case c) {
		if (this.coordonne.getX() == c.getCoordonnee().getX() && (this.coordonne.getY() >= c.getCoordonnee().getY() && this.coordonne.getY() <= c.getCoordonnee().getY() - this.taille-1)) {
			return true;
		} else {
			return false;
		}
	}

	private Boolean estCaseDansNavireSud(Case c) {
		if (this.coordonne.getY() == c.getCoordonnee().getY() && (this.coordonne.getX() >= c.getCoordonnee().getX() && this.coordonne.getX() <= c.getCoordonnee().getX() + this.taille-1)) {
			return true;
		} else {
			return false;
		}
	}

	private final Boolean estCaseDansNavireNord(Case c) {
		if (this.coordonne.getY() == c.getCoordonnee().getY() && (this.coordonne.getX() <= c.getCoordonnee().getX() && this.coordonne.getX() >= c.getCoordonnee().getX() - this.taille-1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean estCoule() {
		for(Case currentCase: this.caseList) {
		       Case c = currentCase;
		       if(! c.isTouche() ) {
		    	   return false;
		       }
		}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Navire other = (Navire) obj;
		if (this.caseList == null) {
			if (other.caseList != null)
				return false;
		} else if (! caseList.equals(other.caseList))
			return false;
		if (coordonne == null) {
			if (other.coordonne != null)
				return false;
		} else if (!coordonne.equals(other.coordonne))
			return false;
		if (direction != other.direction)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (taille != other.taille)
			return false;
		return true;
	}
	
	public int getTaille() {
		return taille;
	}

	public String getNom() {
		return nom;
	}

	public Coordonne getCoordonne() {
		return coordonne;
	}

	public Direction getDirection() {
		return direction;
	}

	public List<Case> getCaseList() {
		return caseList;
	}
	
}
