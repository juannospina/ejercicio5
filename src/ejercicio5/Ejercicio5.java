
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un booleano: ");
        boolean var = leer.nextBoolean();
        
        System.out.println("Ingresa un número decimal: ");
        double num = leer.nextDouble();
        
        System.out.println("Ingresa un caracter: ");
        String letra = leer.next();        
    }    
}
