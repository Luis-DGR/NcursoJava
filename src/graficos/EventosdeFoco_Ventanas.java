package graficos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class EventosdeFoco_Ventanas extends JFrame implements WindowFocusListener {
    public static void main(String[] args) {
    EventosdeFoco_Ventanas miv=new EventosdeFoco_Ventanas();
    miv.iniciar();
    }
    EventosdeFoco_Ventanas marco1;
    EventosdeFoco_Ventanas marco2;

    public void iniciar(){
    marco1=new EventosdeFoco_Ventanas();
    marco2= new EventosdeFoco_Ventanas();
    marco1.setVisible(true);
    marco2.setVisible(true);
    marco1.setBounds(300,100,600,350);
    marco2.setBounds(800,100,600,350);
    marco1.addWindowFocusListener(this);
    marco2.addWindowFocusListener(this);
    marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void windowGainedFocus(WindowEvent e) {
    if (e.getSource()==marco1){
        marco1.setTitle("tengo el foco");
    }else {
        marco2.setTitle("tengo l foco");
    }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if (e.getSource()==marco1){
            marco1.setTitle("");
        }else {
            marco2.setTitle("");
        }
    }

}
