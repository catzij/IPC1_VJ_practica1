import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
	
	public static void main(String args[] ){

		Random aleatorio = new Random();
		Scanner read = new Scanner(System.in);
		double numero=0;
		double disminucion=0;
					
		//numero = aleatorio.nextInt(50);

		numero = (Math.random()*(50-10)+10);

		disminucion = numero * 0.85;
	
		System.out.println("numero ingresado "+numero+
		"\n numero disminuido en 15% : "+disminucion); 
	}
}