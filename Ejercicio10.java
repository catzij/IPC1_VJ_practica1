import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main(String args[] ){

		Scanner read = new Scanner(System.in);

	int altura;
	int base;
	int area;
	int perimetro;

	System.out.println( "ingrese la base del rectangulo");
	base = read.nextInt();

	System.out.println("ingrese la altura del rectangulo") ;
	altura  = read.nextInt();

	area = base * altura;
	perimetro =((2 * base) + ( 2 * altura));

	System.out.println( "el area es " +area+ " el perimetro es: "+perimetro);

	}
}
	