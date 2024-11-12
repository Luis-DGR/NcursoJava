package graficos;

import javax.swing.*;
import java.awt.*;

public class Disposiciones_avanzadas_con_Box {
    public static void main(String[] args) {
        MarcoxBox lilo = new MarcoxBox();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class MarcoxBox extends JFrame {
    public MarcoxBox() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");

        JLabel rotulo1=new JLabel("nombre");
        JTextField texto1=new JTextField(10);
        texto1.setMaximumSize(texto1.getPreferredSize());

        //creamos contenedor horizontal
        Box cajaH1=Box.createHorizontalBox();
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(texto1);

        JLabel rotulo2=new JLabel("contraseña");
        JTextField texto2=new JTextField(10);
        texto2.setMaximumSize(texto1.getPreferredSize());
        Box cajaH2=Box.createHorizontalBox();
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);

        JButton botn1=new JButton("aceptar");
        JButton botn2=new JButton("cancelar");
         Box cajaH3=Box.createHorizontalBox();
         cajaH3.add(botn1);
         cajaH3.add(Box.createHorizontalStrut(15));
         cajaH3.add(botn2);
         cajaH3.add(Box.createGlue());

         Box cajaver=Box.createVerticalBox();
         cajaver.add(cajaH1);
        cajaver.add(cajaH2);
        cajaver.add(cajaH3);

        add(cajaver, BorderLayout.CENTER);






    }
}
