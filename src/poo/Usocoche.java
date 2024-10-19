package poo;

import javax.swing.*;

public class Usocoche {
    public static void main(String[] args) {
        //crear objetos de la clase cohe(INSTANCIAR )
         Coche Toyota=new Coche();

        Toyota.setColor(JOptionPane.showInputDialog("Que color quieres?"));
        Toyota.setAsientosCuero(JOptionPane.showInputDialog("asientos"));


         //leer parametros a traves de un metodo
        System.out.println(Toyota.getRuedas());
        System.out.println(Toyota.getColor());
        System.out.println(Toyota.getAsientos());
        System.out.println("el precio es: "+Toyota.getprecio());







    }
}
