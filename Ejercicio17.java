import java.util.Scanner;
public class Ejercicio17{
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	int lado1;
	int lado2;
	int lado3;
	
	System.out.println("ingrese lado del triangulo");
	lado1 = read.nextInt();

	System.out.println("ingrese lado del triangulo");
	lado2 = read.nextInt();

	System.out.println("ingrese lado del triangulo");
	lado3 = read.nextInt();

	if (lado1 == lado2 && lado1 == lado3){
		System.out.println("el trigulo es equilatero");

	}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
		System.out.println("el tringulo es escaleno");

	}else{
		System.out.println("el triangulo es isoceles");

	}

	}
}