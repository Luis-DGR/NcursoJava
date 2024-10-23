package primeros_pasos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Temporizador {

    public static void main(String[] args) {
        //para poder usar la clase timer se debe crear una instancia de una clase que incluya
        //interfaz ActionListener
        Damelahora oyente = new Damelahora();

        Timer mi_temporizador = new Timer(5000, oyente);
        //inicializamos
        mi_temporizador.start();

        JOptionPane.showMessageDialog(null,"gg");

        System.exit(0);

    }
}
    class Damelahora implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora=new Date();
            System.out.println("te pongo la hora cada 5seg "+ahora);
        //da un beep cada ciclo
            Toolkit.getDefaultToolkit().beep();
        }
    }

