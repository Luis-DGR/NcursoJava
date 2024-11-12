package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Eventos_multiplesFuentes {
    public static void main(String[] args) {
    Marco_action marquito5=new Marco_action();
    marquito5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marquito5.setVisible(true);
    }
}
class Marco_action extends JFrame{
    public Marco_action() {

        setTitle("prueba acciones");
        setBounds(600, 300, 600, 300);
        PanelAction lamina = new PanelAction();
        add(lamina);
        setVisible(true);
    }
}
class PanelAction extends JPanel{
    public PanelAction(){
        ActionColor accionAmarillo=new ActionColor("Amarillo",Color.yellow);
        ActionColor accionred=new ActionColor("rojo",Color.red);
        ActionColor accionblue=new ActionColor("azul",Color.blue);


        add(new JButton(accionAmarillo));
        add(new JButton(accionred));
        add(new JButton(accionblue));



    }

   private class ActionColor extends AbstractAction{
        public ActionColor(String nombre, Color color_boton){
            putValue(Action.NAME,nombre);
            putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+nombre);
            putValue("color fondo",color_boton);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c=(Color) getValue("color fondo");
            setBackground(c);
        }
    }
}
