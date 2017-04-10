public class FonctionComposee extends Fonction{
	private Fonction fonc1;
	private Fonction fonc2;
	
	public FonctionComposee(Fonction x, Fonction y){
		fonc1 = x;
		fonc2 = y;
	}
	
	public int fonction(int x){
		return fonc1.applique(fonc2.applique(x));
	}
}
