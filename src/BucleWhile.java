import javax.swing.*;

public class BucleWhile {
    public static void main(String[] args) {
        //verificar clave

        String clave= "Luis";
        String pass= "";


        while (clave.equals(pass)==false){

            pass=JOptionPane.showInputDialog("dame la clave");

            if (clave.equals(pass)==false){
                System.out.println("clave incorrecta");

            }


        }
        System.out.println("clave correcta");

    }
}
