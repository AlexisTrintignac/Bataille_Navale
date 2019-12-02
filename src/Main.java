
public class Main {

	public static void main(String[] args) {
		System.out.println(ModeleNavire.SOUS_MARIN + " de taille "+ModeleNavire.SOUS_MARIN.getTaille());
		
		
		for (ModeleNavire currentModel : ModeleNavire.values()) {
			System.out.println(currentModel + " de taille "+currentModel.getTaille());
		}
		
		
	}

}
