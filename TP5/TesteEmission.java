import java.io.*;

class TesteEmission{
	public static void main(String[] args){
		Chanson LaJavanaise = new Chanson("La Javanaise", "J'avoue j'en ai bavé", 2, 50);
		Chanson JavaBombe = new Chanson("La java des bombes atomiques", "Mon oncle un fameux bricoleur...", 3, 32);
		Emission e = new Emission(15);
		e.setChanson(LaJavanaise);
		e.setChanson(JavaBombe);
		e.passeTout();
	}
}
