package hola_mundo;

public class Manipular_cadenas {
    public static void main(String[] args) {
        String nombre = "Mai";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
        int ultima_letra = nombre.length();
        System.out.println("La última letra es " + nombre.charAt(ultima_letra-1));

        String frase = "Hoy es un día estupendo para aprender Java";
        String frase_resumen = frase.substring(1,3);
        System.out.println(frase_resumen);

        String nombre1, nombre2;
        nombre1 = "Lola";
        nombre2 = "lola";
        System.out.println(nombre1.equals(nombre2));
        System.out.println(nombre1.equalsIgnoreCase(nombre2));


    }
}
