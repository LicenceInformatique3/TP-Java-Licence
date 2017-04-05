// PERROT GAËTAN , DUARTE Florian
import java.io.*;

class Enveloppe{
	private boolean isopen;
	private Feuille [] feuilles= new Feuille [10];
	private int nb_feuilles;
	
	public Enveloppe(){
		nb_feuilles = 0;
	}
	
	public void accueilleFeuille(Feuille f){			
		if(nb_feuilles==10)
			System.out.println("Maximum atteint");
		else{
			feuilles[nb_feuilles] = f;
			nb_feuilles++;
		}
	}
	
	public void read(){
		if(isopen){
			for(int i=0; i<nb_feuilles; i++){
				feuilles[i].read();
				feuilles[i].retourne();
				feuilles[i].read();
			}
		}
		else
			System.out.println("Enveloppe close, ouvrir pour lire");
	}
	
	public Enveloppe Dupliquer(){
		Enveloppe enveloppe = new Enveloppe();
		enveloppe.isopen=this.isopen;
		for(int i=0; i<this.nb_feuilles; i++){
			enveloppe.accueilleFeuille(this.feuilles[i]);
		}
		return enveloppe;
    }

	public boolean egal(Enveloppe e){
		if (this.isopen==e.isopen && this.nb_feuilles==e.nb_feuilles){
			for(int i=0; i<this.nb_feuilles; i++){
				if(!(this.feuilles[i].Egalite(e.feuilles[i]))){
					return false;
				}
			}	
			return true;
		}
		else{
			return false;
		}
    }
	
	public int getNbFeuilles(){
		return nb_feuilles;
	}
	
	public void open(){
		isopen=true;
        for(int i=0; i<nb_feuilles; i++){
            this.feuilles[i].setIsVisible(true);
        }
    }
    
    public void close(){
		isopen=false;
		for(int i=0; i<nb_feuilles; i++){
			this.feuilles[i].setIsVisible(false);
		}
    }	
}
