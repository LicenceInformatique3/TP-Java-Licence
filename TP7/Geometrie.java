//Perrot Gaëtan Moragues Lucas
import java.io.*;
import java.util.*;

class Point{
	private double x;
	private double y;
	private double z;
	
	public Point(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getx(){
		return x;
	}
	
	public double gety(){
		return y;
	}
	
	public double getz(){
		return z;
	}
	
	public void deplacex(double dx){
		x+=dx;
	}
	
	public void deplacey(double dy){
		y+=dy;
	}
	
	public void deplacez(double dz){
		z+=dz;
	}
	
	public boolean isEqualTo(Point p){
		return (getx() == p.getx() && gety() == p.getx() && getz() == p.getz());
	}
	
	public Point copie (){
		return new Point(x,y,z);
	}
	
	public String toString(){
		return ("x=" + x + "y=" + y + "z=" + z);
	}
}

abstract class Forme{
	protected Point centreGravite;
	protected double densite;
	
	public Forme(double x, double y,double z, double densite){
		centreGravite = new Point(x,y,z);
		this.densite = densite;
	}
	
	public Point getCentreGravite(){
		return centreGravite;
	}
	
	public double getDensite(){
		return densite;
	}
	
	public void translation(double dx,double dy,double dz){
		centreGravite.deplacex(dx);
		centreGravite.deplacey(dy);
		centreGravite.deplacez(dz);
	}
	
	public abstract double volume();
	
	public double poids(){
		return densite*volume();
	}
}

class Sphere extends Forme{
	protected double rayon;
	
	public Sphere(double x,double y, double z,double densite,double rayon){
		super(x,y,z,densite);
		this.rayon=rayon;
	}
	
	public double volume(){
		return ((4/3)*Math.PI*(rayon*rayon*rayon));
	}
	
}

class Brique extends Forme{
	protected double longueur;
	protected double largeur;
	protected double hauteur;
	
	public Brique(double x,double y, double z,double densite,double longueur, double largeur, double hauteur){
		super(x,y,z,densite);
		this.longueur=longueur;
		this.largeur=largeur;
		this.hauteur=hauteur;
	}
	
	public double volume(){
		return longueur*largeur*hauteur;
	}
	
}

final class Cube extends Brique{
	
	public Cube(double x,double y, double z,double densite,double segment){
		super(x,y,z,densite,segment,segment,segment);
	}
}

public class Geometrie{
	private ArrayList<Forme> collections;
	
	public Geometrie(){
		collections = new ArrayList<Forme>();
	}
	
	public void addForme(Forme forme){
		collections.add(forme);
	}
	
	public void poidsParallelepipede(){
		for(int i = 0; i < collections.size();i++){
			if((collections.get(i) instanceof Brique)){
				System.out.println("collections : " + i +" Poids : " + collections.get(i).poids());
			}
		}
	}
	
	public double volumes(){
		double tmp = 0.0;
		for(int i = 0; i < collections.size();i++){
			tmp += collections.get(i).volume();
			System.out.println("collections : " + i +" Volume : " + collections.get(i).volume());
		}
		return tmp;
	}
	
	public static void main (String args[]){
		Geometrie geo = new Geometrie();
		Brique b = new Brique(1,1,1,2,2,3,4);
		Cube c = new Cube(0,0,0,3,2);
		Sphere s = new Sphere(2,2,2,4,1);
		geo.addForme(b);
		geo.addForme(c);
		geo.addForme(s);
		geo.poidsParallelepipede();
		System.out.println("Volumes : " + geo.volumes());
	}
}
