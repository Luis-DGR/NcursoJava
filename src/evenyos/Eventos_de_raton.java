package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Eventos_de_raton {
    public static void main(String[] args) {
    Maerco_pruebas_mouse marquitomose1 = new Maerco_pruebas_mouse();
    marquitomose1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class Maerco_pruebas_mouse extends JFrame{
    public Maerco_pruebas_mouse(){
        setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Ancho y alto de la pantalla
        int ancho = screenSize.width;
        int alto = screenSize.height;
        setBounds(ancho/4,alto/4,ancho/2,alto/2);
        Eventos_raton eventoraton1= new Eventos_raton();
        addMouseListener(eventoraton1);
        addMouseMotionListener(eventoraton1);

    }
}
class Eventos_raton implements MouseListener, MouseMotionListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("hiciste click tus coordenadas son: "+e.getX()+" "+e.getY());
        System.out.println("llevas "+e.getClickCount()+" clicks");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("boton izquierdo");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("ruedita");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("boton derecho");

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("estas moviendo");

    }
}
