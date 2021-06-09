import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);
		int numero;
		int cuadrado;
		int cubo;

		System.out.println("ingrese un numero entero positivo");
		numero = read.nextInt();

		cuadrado = numero * numero;
		cubo = numero * numero * numero ;

		System.out.println("el cuadrado del numero "+ numero+" es "+cuadrado
						  +"el cubo del numero     "+numero+"  es "+cubo) ;

	}
}
