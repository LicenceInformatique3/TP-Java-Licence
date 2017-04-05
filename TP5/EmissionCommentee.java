import java.io.*;
import java.util.ArrayList;
import java.util.List;

class EmissionCommentee extends Emission{	
	public void passe(int i){
		System.out.println(playlist.get(i).getTitre());
		super().passe(i);
	}
	
	public void passeTout(){
		System.out.println("Bonjour: ");
		super().passeTout();
		System.out.println("Au Revoir");
	}
}
