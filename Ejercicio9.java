import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main(String args[] ){

		Scanner read = new Scanner(System.in);

		String palabra1;
		String palabra2;
		String cambio;

		System.out.println( "ingrese palabra1");
		palabra1 = read.nextLine();

		System.out.println( "ingrese palabra2");
		palabra2 = read.nextLine();
		

		cambio = palabra1;
		palabra1 = palabra2;
		palabra2 = cambio;

		System.out.println( "contenido palabra1 "+palabra1
							+"\ncontenido palabra2 "+palabra2);


	}
}
