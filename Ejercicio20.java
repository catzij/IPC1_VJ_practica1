import java.util.Scanner;
public class Ejercicio20 {	

    public static void main(String[] args) {
    			Scanner read = new Scanner(System.in);
        int numero ;

        System.out.println("ingrese numero");
        numero=read.nextInt();
        System.out.println("¿El número " + numero + " es capicúa?: " + esCapicua(numero));
    }
    
    public static boolean esCapicua(int numero){
        String palabra = String.valueOf(numero);
        
        for (int i = 0, j = palabra.length() - 1; i <= j; i++, --j) {
            if (palabra.charAt(i) != palabra.charAt(j)){
                return false;
            }
        }
        
        return true;
    }
}