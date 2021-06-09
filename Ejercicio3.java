import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);
		int numero;
		int doble;
		int triple;
	
	System.out.println("ingrese un numero entero positivo");
	numero = read.nextInt();

	doble = numero * 2 ;
	triple = numero * 3;

	System.out.println("el doble del numero es" + doble+"\n"
		+"el triple del numero es "+ triple);

	}
}