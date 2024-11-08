package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Areas_de_texto2 {
    public static void main(String[] args) {
       Marco1 lilo = new Marco1();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marco1 extends JFrame {
    public Marco1() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        setLayout(new BorderLayout());
        areatexto1=new JTextArea(20,30);
        laminaBotones=new JPanel();
        boton_insert=new JButton("insert");
        boton_salto=new JButton("salto");

        boton_insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                areatexto1.append("ALV");
            }
        });
        boton_salto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               if (areatexto1.getLineWrap()==false){
                   areatexto1.setLineWrap(true);
               }else {
                   areatexto1.setLineWrap(false);
               }
            }
        });


        laminaBotones.add(boton_insert);
        laminaBotones.add(boton_salto);
        add(laminaBotones,BorderLayout.SOUTH);
        laminabarra=new JScrollPane(areatexto1);
        add(laminabarra,BorderLayout.CENTER);
        setVisible(true);


    }
    private JPanel laminaBotones;
    private JButton boton_insert;
    private   JButton boton_salto;
    private JTextArea areatexto1;
    private JScrollPane laminabarra;
}


