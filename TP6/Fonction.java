public abstract class Fonction{
	public abstract int fonction(int x);
	
	public int applique(int x){
		return fonction(x);
	}
	
	public int iteree(int n, int x){
		while(n > 0){
			x = applique(x);
			n--;
		}
		return x;
	}
}
