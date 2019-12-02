
public class Navire {
	int taille;
	String nom;
	Coordonne coordonne;
	Direction direction;
	
	public Navire(int taille, String nom, Coordonne coordonne, Direction direction) {
		this.taille = taille;
		this.nom = nom;
		this.coordonne = coordonne;
		this.direction = direction;
	}
	
	public void tirer() {
		
	}
	
	public Boolean estDansCase() {
		
	}
	
//	public Boolean estTouche(int x, int y) {
//		if (this.direction == this.direction.SUD) {
//			if (this.positionX == x && (this.positionY >= y && this.positionY <= y + this.taille-1)) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			if (this.direction == this.direction.NORD) {
//				if (this.positionX == x && (this.positionY <= y && this.positionY >= y - this.taille-1)) {
//					return true;
//				} else {
//					return false;
//				}
//		} else {
//			if (this.direction == this.direction.OUEST) {
//				if (this.positionY == y && (this.positionX >= x && this.positionX <= x - this.taille-1)) {
//					return true;
//				} else {
//					return false;
//				}
//		} else {
//			if (this.direction == this.direction.EST) {
//				if (this.positionY == y && (this.positionX <= x && this.positionX >= x + this.taille-1)) {
//					return true;
//				} else {
//					return false;
//				}
//			}
//			return false;
//		
//			}
//		}
//	}
//}
	
	public Boolean estCoule() {
		
	}
}
