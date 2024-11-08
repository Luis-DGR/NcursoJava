package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        Marco5 lilo = new Marco5();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marco5 extends JFrame {
    public Marco5() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAmina5 milami=new LAmina5();
        add(milami);



        setVisible(true);


    }
}
class LAmina5 extends JPanel{
    public LAmina5(){
    setLayout(new BorderLayout());
    texto=new JLabel("alaverga");
    texto.setFont(new Font("Serof",Font.PLAIN,20));
    add(texto,BorderLayout.CENTER);
    JPanel lamina_norte=new JPanel();
    micombo=new JComboBox();
    micombo.addItem("Serif");
    micombo.addItem("Dialog");
    micombo.addItem("Monospaced");

    Eventovomo envento=new Eventovomo();
    micombo.addActionListener(envento);

        lamina_norte.add(micombo);
    add(lamina_norte,BorderLayout.NORTH);



    }
    private class Eventovomo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) micombo.getSelectedItem(),Font.PLAIN,20));





        }
    }
private JLabel texto;
    private JComboBox micombo;
}
