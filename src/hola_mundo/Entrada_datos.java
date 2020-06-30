package hola_mundo;
import java.util.*;
public class Entrada_datos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("introduce tu edad");
        int edad = entrada.nextInt();
        System.out.println("hola " + nombre + ". El año que viene tendrás " + (edad+1) + " años");

    }
}
