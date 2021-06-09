import java.util.Scanner;
public class Ejercicio13 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);
	double radio;
	double altura;
	double volumen;
	double pi = 3.1415;
	
	System.out.println("ingrese la altura del cilindro");
	altura = read.nextDouble();

	System.out.println( "ingrese el radio del cilindro");
	radio = read.nextFloat();

	volumen = pi*radio*altura;

	System.out.println( "el volumen del cilindro es "+volumen);

	}
}
	