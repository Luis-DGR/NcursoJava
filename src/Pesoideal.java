import javax.swing.*;

public class Pesoideal {
    public static void main(String[] args) {

        String genero="";
        do {
            genero= JOptionPane.showInputDialog("introduce h/m");
        }while (genero.equalsIgnoreCase("h")==false && genero.equalsIgnoreCase("m")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog("altura en cm"));
        int pesoideal=0;
        if (genero.equalsIgnoreCase("h")){
            pesoideal=altura-110;
        } else if (genero.equalsIgnoreCase("m")) {
            pesoideal=altura-120;

        }
        System.out.println("tu peso ideal debe ser "+pesoideal+"Kg");

    }
}
