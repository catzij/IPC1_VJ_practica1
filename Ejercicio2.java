import java.util.Scanner;

public class Ejercicio2 {

	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	String pais;
	String capital;

	System.out.println("ingrese el nombre del pais");
 	pais = read.nextLine();

	System.out.println("ingrese el nombre de la capital");
 	capital = read.nextLine();

	System.out.println(capital+" es la capital de " + pais);


	}
}	