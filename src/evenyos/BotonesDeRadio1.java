package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesDeRadio1 {
    public static void main(String[] args) {
        Marcox3 lilo = new Marcox3();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marcox3 extends JFrame {
    public Marcox3() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAminax3 milami=new LAminax3();
        add(milami);



        setVisible(true);


    }
}
class LAminax3 extends JPanel{
    public LAminax3(){
        setLayout(new BorderLayout());
        texto=new JLabel("tangamandapioxDDDD");


        add(texto,BorderLayout.CENTER);

        //CREAMOS GRUPO Y BOTONES RADIALES
        ButtonGroup migrupo=new ButtonGroup();
        boton1=new JRadioButton("peque",false);
        boton2=new JRadioButton("med",false);
        boton3=new JRadioButton("grande",false);
        boton4=new JRadioButton("mandingo",false);

        //CREAR PANEL
        JPanel laminaradio=new JPanel();

        //CREAMOS INSTANCIA PARA PONER A LOS BOTONES A LA ESCUCHA
        EventoRadio mievento=new EventoRadio();
         boton1.addActionListener(mievento);
        boton2.addActionListener(mievento);
        boton3.addActionListener(mievento);
        boton4.addActionListener(mievento);

        //AÑADIENDO BOTONES AL GRUPO
        migrupo.add(boton1);
        migrupo.add(boton2);
        migrupo.add(boton3);
        migrupo.add(boton4);

        //AÑADIENDO BOTONES A LA LAMINA
        laminaradio.add(boton1);
        laminaradio.add(boton2);
        laminaradio.add(boton3);
        laminaradio.add(boton4);

        //AÑADIR Y POSICIONAR LA LAMINA
        add(laminaradio,BorderLayout.SOUTH);



    }
    //DEFINIMOS LA ACCION DE LOS BOTONES
    private class EventoRadio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boton1){
                texto.setFont(new Font("Serif",Font.PLAIN,10));
            } else if (e.getSource()==boton2){
                texto.setFont(new Font("Serif",Font.PLAIN,25));

            }else if(e.getSource()==boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 50));
            }else if(e.getSource()==boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 100));
            }


        }


    }
    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;
}


