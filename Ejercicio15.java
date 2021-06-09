import java.util.Scanner;
public class Ejercicio15 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	int numero;

	System.out.println("ingrese un numero") ;
	numero= read.nextInt();

	if (numero > 0){
		System.out.println("el numero ingresado es positivo");
	}else{
		System.out.println("el numero ingresado es negativo");
	}	

	}
}