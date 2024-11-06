package evenyos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Varios_oyentes {
    public static void main(String[] args) {

        Marco_principal111 marco=new Marco_principal111();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
class Marco_principal111 extends JFrame{
    public Marco_principal111(){
        setTitle("prueba varios");
        setBounds(600, 300, 600, 300);
        Lamina_principal111 lamina=new Lamina_principal111();
        add(lamina);
        setVisible(true);
    }
}
class Lamina_principal111 extends JPanel{
public Lamina_principal111(){
    JButton boton_nuevo=new JButton("nuevo");

    add(boton_nuevo);

    boton_cerrar=new JButton("cerrar todo");

    add(boton_cerrar);

    Oyente_nuevo111 miOyente=new Oyente_nuevo111();
    boton_nuevo.addActionListener(miOyente);

}
private class Oyente_nuevo111 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Marco_emergente1111 marco=new Marco_emergente1111(boton_cerrar);
         marco.setVisible(true);

    }
}
JButton boton_cerrar;
}
class Marco_emergente1111 extends JFrame{
    public Marco_emergente1111(JButton boton_principal){
        contador++;
        setTitle("ventala "+contador);
        setBounds(300,50*contador,300,200);
        Cierraalv oyentecerrer=new Cierraalv();
        boton_principal.addActionListener(oyentecerrer);


    }
    private class Cierraalv implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
     static int contador=0;
}