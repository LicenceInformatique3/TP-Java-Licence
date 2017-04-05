// PERROT GAËTAN , DUARTE Florian
import java.io.*;

class Feuille{
	private String recto;
	private String verso;
	private int visible;
	private boolean isVisible;
	private static int nb_feuilles;
	
	public Feuille(String r,String v){
		recto=r;
		verso=v;
		nb_feuilles++;
		isVisible = true;
	}
	
	public String getRecto(){
		return recto;
	}

	public String getVerso(){
		return verso;
	}
	
	public void setIsVisible(boolean isVisible){
		this.isVisible = isVisible;
	}
	
	public static int getNbfeuille(){
		return nb_feuilles;
    }
    
	public void read(){
		if(isVisible){
			if(visible == 0)
				System.out.println(recto);
			else 
				System.out.println(verso);
		}
	}
	
	public void retourne(){
		if(isVisible){
			if(visible == 1)
				visible = 0;
			else 
				visible=1;
		}
	}

	public Feuille Dupliquer(){
		Feuille feuille= new Feuille (recto, verso);
		feuille.visible= visible;	
		return feuille;
	}

	public boolean Egalite(Feuille f){
		return ((recto.compareTo(f.recto)==0) && (verso.compareTo(f.verso)==0) && (visible==f.visible));
	}	
}
