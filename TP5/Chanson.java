import java.io.*;

class Chanson{

	private String titre;
	private String paroles;
	private int minutes;
	private int secondes;
	
	Chanson(String t, String p, int m, int s){
		titre = t;
		paroles = p;
		minutes = m;
		secondes = s;
	}

	public void passe(){
		System.out.println(paroles);
	}
	
	public int getDuree(){
		return ((minutes*60)+secondes);
	}
	
	public String getTitre(){
		return titre;
	}
}
