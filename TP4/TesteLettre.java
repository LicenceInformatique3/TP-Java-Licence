import java.io.*;

public class TesteLettre{    
	public static void main(String args []){
		Enveloppe e = new Enveloppe();
		Feuille f1 = new Feuille("Initiation","Progammation");
		Feuille f2 = new Feuille("Orientée", "Objet");
		//e
		e.accueilleFeuille(f1);
		e.accueilleFeuille(f2);
		e.close();
		e.read();
		f1.read();
		e.open();
		e.read();
		//e2
		Enveloppe e2 = new Enveloppe();
		Feuille f3 = new Feuille("cOUCOU", "VGG");
		Feuille f4 = new Feuille("CC", "DD");
		Feuille f5 = new Feuille("VV", "CC");
		e2.accueilleFeuille(f3);
		e2.accueilleFeuille(f4);
		e2.accueilleFeuille(f5);
		e2.close();
		e2.open();
		e2.read();
		Courrier courrier = new Courrier(e);
		System.out.println("Tarif : "+courrier.tarifAffranchissement());
		courrier.addEnveloppe(e2);
		System.out.println("Tarif : "+courrier.tarifAffranchissement());
		courrier.close();
		courrier.close();
	}
}
