package evenyos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class eventos_ventanas {
    public static void main(String[] args) {
    Marco_ventana mimarquito=new Marco_ventana();
    mimarquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
class Marco_ventana extends JFrame{
    public Marco_ventana(){
        setVisible(true);

        setSize(600, 450);

        setLocation(400, 200);

        setTitle("primer texto");

    }
}
class M_ventana implements WindowListener{

    public void windowOpened(WindowEvent e) { /* Acción */ }
    public void windowClosing(WindowEvent e) { /* Acción */ }
    public void windowClosed(WindowEvent e) { /* Acción */ }
    public void windowIconified(WindowEvent e) { /* Acción */ }
    public void windowDeiconified(WindowEvent e) { /* Acción */ }
    public void windowActivated(WindowEvent e) { /* Acción */ }
    public void windowDeactivated(WindowEvent e) { /* Acción */ }
}