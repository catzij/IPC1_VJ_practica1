import java.util.Scanner;
public class Ejercicio18 {
	
	public static void main(String args[] ){
		Scanner read = new Scanner(System.in);

	int numero=0;
	int uno=0;
	int dos=0;
	int tres=0;
	int cuatro=0;
	String cadena;

	System.out.println("ingrese un numero de cuatro digitos maximo");
 	numero = read.nextInt();
 	cadena =""+numero;
	
	if (numero > 1 && numero < 10000){
		
		if(numero >999){
				
                uno = Integer.parseInt(cadena.substring(0,1));
				dos = Integer.parseInt(cadena.substring(0,2))-(uno*10);
				tres = Integer.parseInt(cadena.substring(0,3))-((uno*100)+(dos*10));
				cuatro = Integer.parseInt(cadena.substring(0,4))-((uno*1000)+(dos*100)+(tres*10));

		}else if (numero<1000 && numero >99) {
				dos = Integer.parseInt(cadena.substring(0,2))-(uno*10);
				tres = Integer.parseInt(cadena.substring(0,3))-((uno*100)+(dos*10));
				cuatro = Integer.parseInt(cadena.substring(0,4))-((uno*1000)+(dos*100)+(tres*10));

		}else if (numero>9 && numero<100) {
				tres = Integer.parseInt(cadena.substring(0,3))-((uno*100)+(dos*10));
				cuatro = Integer.parseInt(cadena.substring(0,4))-((uno*1000)+(dos*100)+(tres*10));
		
		}else{
				cuatro = numero;

		}			
	}
	System.out.println("uno: "+uno);
	System.out.println("dos: "+dos);
	System.out.println("tres: "+tres);
	System.out.println("cuatro: "+cuatro);			
	System.out.println("suma de los digitos es "+(uno + dos + tres + cuatro));
	
	}
}