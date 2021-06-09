import java.util.Scanner;
public class Ejercicio16 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);
	
	int numero1;
	int numero2;
	int numero3;

	System.out.println("ingrese numero1") ;
	numero1 = read.nextInt();

	System.out.println("ingrese numero2") ;
	numero2 = read.nextInt();

	System.out.println("ingrese numero3") ;
	numero3 = read.nextInt();

	if (numero1 > numero2 && numero1 > numero3){
		System.out.println("numero1 es el mayor");

	}else if(numero2 > numero1 && numero2 > numero3){
		System.out.println("numero2 es el mayor");
	}else if(numero3 > numero1 && numero3 > numero2){
		System.out.println("numero3 es el mayor");
	}
	
	}
}