package graficos;

import javax.swing.*;

public class MenuEmergnte {
    public static void main(String[] args) {
        Marcoxx lilo = new Marcoxx();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marcoxx extends JFrame {
    public Marcoxx() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAminaxx milami=new LAminaxx();
        add(milami);






    }
}
class LAminaxx extends JPanel{
    public LAminaxx(){
    JPopupMenu emergente=new JPopupMenu();
    JMenuItem opcion1=new JMenuItem("op1");
    JMenuItem opcion2=new JMenuItem("op2");
    JMenuItem opcion3=new JMenuItem("op3");

    emergente.add(opcion1);
    emergente.add(opcion2);
    emergente.add(opcion3);

    setComponentPopupMenu(emergente);



    }
}
