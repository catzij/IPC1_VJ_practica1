import java.util.Scanner;
public class Ejercicio14 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	double numero1;
	double numero2;
	double division;

	System.out.println("Ingrese numero1");
	numero1=read.nextDouble();

	System.out.println("Ingrese numero2");
	numero2=read.nextDouble();
	
		if (numero1== 0 || numero2 == 0){

		
		System.out.println("no se puede dividir entre 0");

		} 
	
		else if(numero1 !=0){

			division = numero2 / numero1;
			System.out.println("es divisible "+division);

		}
		else if(numero2 !=0){
			division = numero1 / numero2;
	
			System.out.println("es divisible "+division);			

		}	

	}
}