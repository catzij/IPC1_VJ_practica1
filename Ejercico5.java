import java.util.Scanner;
public class Ejercico5 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);
		int numero;
		int siguiente;

		System.out.println("ingrese un numero entero positivo");
		numero = read.nextInt();

		siguiente = numero + 1;

		System.out.println(" el numero ingresado es "+numero);
		System.out.println(" y el numero siguiente es "+siguiente);

	}
}