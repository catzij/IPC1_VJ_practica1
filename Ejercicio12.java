import java.util.Scanner;
public class Ejercicio12 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	double celsius;
	double fahrenheit;

		System.out.println(" ingrese la temperatura en grados celsius");
		
	celsius = read.nextFloat();

	fahrenheit = ((1.8*celsius)+32.0);

	System.out.println(" la conversion a fahnernheit es "+fahrenheit);

	}
}
	