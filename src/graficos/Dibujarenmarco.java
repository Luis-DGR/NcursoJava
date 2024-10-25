package graficos;

import javax.swing.*;
import java.awt.*;

public class Dibujarenmarco {
    public static void main(String[] args) {
    Marcoparadibujar marquito2=new Marcoparadibujar();
    marquito2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
class Marcoparadibujar extends JFrame {
    public Marcoparadibujar() {
        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("primer texto");
        lamina_con_figuras milami=new lamina_con_figuras();

        add(milami);

    }
}
class lamina_con_figuras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50,50,200,200);

    }
}
