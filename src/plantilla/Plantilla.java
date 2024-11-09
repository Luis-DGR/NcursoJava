package plantilla;

import javax.swing.*;
import java.awt.*;

public class Plantilla {
    public static void main(String[] args) {
      Marcox lilo = new Marcox();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marcox extends JFrame {
    public Marcox() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAminax milami=new LAminax();
        add(milami);



        setVisible(true);


    }
}
class LAminax extends JPanel{
    public LAminax(){
    JSpinner control=new JSpinner(new SpinnerNumberModel(1,0,10,1));
    control.setPreferredSize(new Dimension(20,10));


    add(control);

    }
}

