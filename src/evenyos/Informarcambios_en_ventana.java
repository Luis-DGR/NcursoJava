package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Informarcambios_en_ventana {
    public static void main(String[] args) {
    Marco_paracambios nuevomarcocambio=new Marco_paracambios();
       nuevomarcocambio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Marco_paracambios extends JFrame {
    public Marco_paracambios(){
        setVisible(true);

        setSize(600, 450);

        setLocation(400, 200);

        setTitle("primer texto");

        informecambio cambio1=new informecambio();

        addWindowStateListener(cambio1);



    }
}
    class informecambio implements WindowStateListener {
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("cambio de estado");
        System.out.println(e.getNewState());

    }


    }