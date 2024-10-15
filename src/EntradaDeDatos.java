import javax.swing.*;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
           //con clase Scanner

        Scanner entrada1 = new Scanner(System.in);
        String nombre= entrada1.nextLine();
        System.out.println("nombre " + nombre);

           //JOptionPane
        String edad= JOptionPane.showInputDialog("intruce edad ");

        int edadusuario= Integer.parseInt(edad);

        System.out.println(edad);













    }
}
