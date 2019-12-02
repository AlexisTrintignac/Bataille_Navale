import java.util.List;

public class Joueur {
	String numero;
	List<Navire> bateauxValide;
	
	public Joueur(String num, List<Navire> bateaux) {
		this.numero = num;
		this.bateauxValide = bateaux;
	}
	
	public void Jouer(int x, String y) {
		System.out.println("blabla");
	}
}
