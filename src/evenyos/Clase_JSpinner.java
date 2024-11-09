package evenyos;

import javax.swing.*;

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


    }
}
