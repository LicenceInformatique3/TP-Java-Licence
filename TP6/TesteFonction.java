import java.io.*;

public class TesteFonction{
	public static void main (String args[]){
		Increment f = new Increment();
		Carre g = new Carre();
		System.out.println("g(9) = " + g.applique(9));
		System.out.println("g(g(5)) = " + g.iteree(2,5));
		FonctionComposee h = new FonctionComposee(g,f);
		System.out.println("h(h(6)) = " + h.iteree(2,6));
		FonctionComposee i = new FonctionComposee(f,h);
		System.out.println("i(i(6)) = " + i.iteree(2,6));
	}
}
