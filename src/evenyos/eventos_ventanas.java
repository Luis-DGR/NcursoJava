package evenyos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
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
}//con la interfaz(OBLIGA A DECLARAR TODOS LOS METODOS)
/*class M_ventana implements WindowListener{

    public void windowOpened(WindowEvent e) {  }
    public void windowClosing(WindowEvent e) {  }
    public void windowClosed(WindowEvent e) {  }
    public void windowIconified(WindowEvent e) {  }
    public void windowDeiconified(WindowEvent e) { }
    public void windowActivated(WindowEvent e) { }
    public void windowDeactivated(WindowEvent e) {  }
}
*/
//con clase adaptadora(SOLO IMPLEMENTA LOS METODOS A UTILIZAR)
class M_venyana extends WindowAdapter{
    public void windowOpened(WindowEvent e){

    }
}
