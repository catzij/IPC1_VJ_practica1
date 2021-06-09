import java.util.*;
import java.math.*;
public class Ejercicio19{
	public static void main(String[] args) {

		double num;

		num = 1+Math.floor(Math.random()*1000);

		System.out.println("El numero generado aleatoriamente es: "+num);
		if (num%5==0 && num<=25) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}

	}
}