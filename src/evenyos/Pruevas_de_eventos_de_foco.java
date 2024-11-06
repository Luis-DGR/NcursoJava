package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Pruevas_de_eventos_de_foco {
    public static void main(String[] args) {
        Marco_para_foco mimarco_foco= new Marco_para_foco();
        mimarco_foco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class Marco_para_foco extends JFrame{
    public Marco_para_foco(){
        setVisible(true);
        setBounds(300,300,600,450);
        add(new LaminaFoco());
    }
    //FOCO
   private class LanzaFocos implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("ganaste foco");
        }

        @Override
        public void focusLost(FocusEvent e) {
        String email=cuadro1.getText();
        boolean comprobacion=false;

            for (int i = 0; i <email.length() ; i++) {
                if (email.charAt(i) =='@'){
                    comprobacion=true;
                }
            }
        }
    }

class LaminaFoco extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos elfoco= new LanzaFocos();
        cuadro1.addFocusListener(elfoco);
        //cuadro2.addFocusListener(elfoco);

    }
}
    JTextField cuadro1;
    JTextField cuadro2;


}