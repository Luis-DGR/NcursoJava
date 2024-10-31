package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos1 {
    public static void main(String[] args) {
        Marcoevento evento1=new Marcoevento();
        evento1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class Marcoevento extends JFrame {
    public Marcoevento(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("primer texto");
       Lamin milamin=new Lamin();
        add(milamin);


    }
}
//crear lamina y añadir boton
class Lamin extends JPanel implements ActionListener {
    JButton boton_azul=new JButton("Azul");
    JButton boton_red=new JButton("Rojo");
    JButton boton_yellow=new JButton("Amarillo");

    public Lamin(){
        add(boton_azul);
        add(boton_red);
        add(boton_yellow);

    boton_azul.addActionListener(this);
    boton_red.addActionListener(this);
    boton_yellow.addActionListener(this);


    }
public void actionPerformed(ActionEvent e){
       Object boton_pulsado=e.getSource();
       if (boton_pulsado==boton_azul){
           setBackground(Color.blue);
       }
       else if (boton_pulsado==boton_red){
           setBackground(Color.red);
       } else if (boton_pulsado==boton_yellow) {
           setBackground(Color.yellow);

       }
}
}