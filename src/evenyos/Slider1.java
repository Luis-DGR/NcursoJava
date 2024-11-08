package evenyos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider1 {
    public static void main(String[] args) {
        Marco6 lilo = new Marco6();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marco6 extends JFrame {
    public Marco6() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAmina_slider milami=new LAmina_slider();
        add(milami);



        setVisible(true);


    }
}
class LAmina_slider extends JPanel{
    public LAmina_slider(){
       setLayout(new BorderLayout());

        rotulo=new JLabel("asuputamadre");
        add( rotulo,BorderLayout.CENTER);
        control = new JSlider(10, 50, 12);
        control.setMajorTickSpacing(10);

        control.setMinorTickSpacing(5);

        control.setPaintTicks(true);



        //PONEMOS A LA ESCUCHA EL ELEMENTO JSLIDER
        EventoSlider eventoSlider=new EventoSlider();
        control.addChangeListener(eventoSlider);

        control.setPaintLabels(true);

        // Ajusta el control para que se mueva solo a los valores de las marcas (opcional, comentado)
        // control.setSnapToTicks(true);

        JPanel arriba=new JPanel();
        arriba. add(control);
        add(arriba,BorderLayout.NORTH);



    }
    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {

        rotulo.setFont(new Font("Serif", Font.ITALIC, control.getValue()));




        }

    }
    private JLabel rotulo;
    private  JSlider control;
}
