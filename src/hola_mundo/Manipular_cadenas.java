package hola_mundo;

public class Manipular_cadenas {
    public static void main(String[] args) {
        String nombre = "Mai";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        int ultima_letra = nombre.length();
        System.out.print("La última letra es " + nombre.charAt(ultima_letra-1));

    }
}
