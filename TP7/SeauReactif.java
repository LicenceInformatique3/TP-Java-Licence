//Perrot Gaëtan Moragues Lucas
class Seau{
	protected int capacite;
	protected int quantitee;
	
	public Seau(int cap){
		capacite = cap;
		quantitee = 0;
	}
	
	public int getCapacite(){
		return capacite;
	}
	
	public int getQuantitee(){
		return quantitee;
	}
	
	public void setQuantitee(int quantitee){
		this.quantitee = quantitee;
	}
	
	public void transvase(Seau s){
		if((s.getCapacite() - s.getQuantitee()) <= quantitee){
			quantitee -= s.getCapacite() - s.getQuantitee();
			s.setQuantitee(s.getCapacite());
		}else{
			s.setQuantitee(s.getQuantitee()+quantitee);
			quantitee = 0;
		}
	}
	
	public void remplir(){
		quantitee = capacite;
	}
	
	public void vider(){
		quantitee = 0;
	}
}

public class SeauReactif extends Seau{
	public SeauReactif(int cap){
		super(cap);
	}
	
	public void transvase(Seau s){
		super.transvase(s);
		System.out.println("Quantite Seau qui verse : " + quantitee +" Quantite Seau qui reçoit : " + s.getQuantitee());
		if((quantitee == 4) || (s.getQuantitee() == 4))
			System.out.println("C'est bon !");
	}
	
	public static void main (String args[]){
		SeauReactif s3 = new SeauReactif(3);
		SeauReactif s5 = new SeauReactif(5);
		s3.remplir();
		s3.transvase(s5);
		s3.remplir();
		s3.transvase(s5);
		s5.vider();
		s3.transvase(s5);
		s3.remplir();
		s3.transvase(s5);
	}
}
