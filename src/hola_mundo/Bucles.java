package hola_mundo;
import javax.swing.JOptionPane;

public class Bucles {
    public static void main(String[] args) {
        boolean arroba = false;
        int arrobanumber = 0;
        String mail =JOptionPane.showInputDialog("introduce mail");
       for (int i = 0; i<mail.length(); i++) {
           if(mail.charAt(i) == '@'){
               arroba=true;
               arrobanumber ++;
           }
       }
       if (arroba == true && arrobanumber == 1){
           System.out.println("correcto");
       }
       else {
           System.out.println("no es correcto");

       }
    }
}
