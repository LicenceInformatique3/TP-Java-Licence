import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Emission{
	private int E_minutes;
	protected ArrayList<Chanson> playlist;
	
	public Emission(int min){
		E_minutes = min;
		playlist = new ArrayList<Chanson>();
	}
	
	public void passe(int i){
		playlist.get(i).passe();
	}
	
	public void passeTout(){
		int minutePassee = 0;
		for(Chanson song : playlist){
			minutePassee += (song.getDuree()/60);
			if(minutePassee <= E_minutes)
				song.passe();
		}
	}
	
	public void setChanson(Chanson c){
		playlist.add(c);
	}
	
	public Chanson getChanson(int i){
		return playlist.get(i);
	}
}
