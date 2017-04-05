// PERROT GAËTAN , DUARTE Florian
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Courrier{
	List<Enveloppe> enveloppes;
	private boolean isopen;
	
	public Courrier(Enveloppe env){
		isopen = true;
		enveloppes = new ArrayList<Enveloppe>();
		enveloppes.add(env);
	}
	
	public int tarifAffranchissement(){
		int tarif =0; //En centimes
		for(Enveloppe env : enveloppes){
			int nbFeuilles = env.getNbFeuilles();
			if((nbFeuilles < 5) && (nbFeuilles >= 0))
				tarif += 85;
			else if ((nbFeuilles >= 0) && (nbFeuilles >= 5))
				tarif += 170;
		}
		return tarif;
	}
	
	public void addEnveloppe(Enveloppe env){
		enveloppes.add(env);
	}
	
	public void close(){
		if(isopen){
			isopen = false;
			for(Enveloppe env : enveloppes){
				env.close();
			}
		}
		else
			System.out.println("Courrier déjà fermé !");
	}
}
