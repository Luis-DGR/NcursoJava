package plantilla;

import javax.swing.*;

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


    }
}

