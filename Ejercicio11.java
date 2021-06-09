import java.util.Scanner;
public class Ejercicio11 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	double cm ;
	double yardas;
	double metros;
	double pies;
	double plg;
	
	System.out.println("ingrese un dato en cm") ;
	cm = read.nextDouble();

	pies = (cm*(1/30.48));
	plg = (cm*(1/2.54));
	metros = (cm*(1/100.0));
	yardas = (metros*(1/0.9144));	

		System.out.println( "el dato ingresado es "+cm);
		System.out.println("y su conversion a yardas es "+yardas);
		System.out.println("y su conversion a pies "+pies);
		System.out.println("y su conversion a metros "+metros);
		System.out.println("y su conversion a plg "+plg);
	
	}
}