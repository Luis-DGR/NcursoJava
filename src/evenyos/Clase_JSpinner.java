package evenyos;

import javax.swing.*;
import java.awt.*;

public class Clase_JSpinner {
    public static void main(String[] args) {
        Marco7 lilo = new Marco7();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marco7 extends JFrame {
    public Marco7() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAmina6 milami=new LAmina6();
        add(milami);



        setVisible(true);


    }
}
class LAmina6 extends JPanel{
    public LAmina6(){
        JSpinner control=new JSpinner(new SpinnerNumberModel(1,0,10,1));
        control.setPreferredSize(new Dimension(20,10));


        add(control);

    }
}
