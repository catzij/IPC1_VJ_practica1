import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
	
	public static void main(String args[] ){
		Random aleatorio = new Random();
		Scanner read = new Scanner(System.in);
		int numero=0;
		double aumento=0;
			
		numero = aleatorio.nextInt(200);

		aumento = numero * 1.3;
	
		System.out.println("numero ingresado "+numero+
		"\n aumento en 30% del numero es igual a "+aumento); 
	}
}
	