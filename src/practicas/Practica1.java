package practicas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica1 {
    public static void main(String[] args) {
        Marcox7 lilo = new Marcox7();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marcox7 extends JFrame {
    public Marcox7() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAminax7 milami=new LAminax7();
        add(milami);



        setVisible(true);


    }
}
class LAminax7 extends JPanel{
    public LAminax7(){

        setLayout(new BorderLayout());
    JMenuBar barra_principal=new JMenuBar();
        barra_principal.setBackground(Color.gray);
        barra_principal.setLayout(new FlowLayout());


        areatexto=new JTextPane();
        areatexto.setFont(new Font("Arial",Font.PLAIN,12));
        areatexto.setBackground(Color.white);
    Accion xd=new Accion();

    JMenu fuente=new JMenu("Fuente");
    JMenu estilo=new JMenu("Estilo");
    JMenu Tamano=new JMenu("Tamano");

        //tipo furnte
     arial=new JMenuItem("Arial");
     verdana=new JMenuItem("Verdana");
     courier=new JMenuItem("Courier");





    //estilo
        negrita=new JMenuItem("negrita");
        cursiva=new JMenuItem("cursiva");




        //tamaño
     t12=new JMenuItem("12");
     t18=new JMenuItem("18");
    t20=new JMenuItem("20");



    barra_principal.add(fuente);
    barra_principal.add(estilo);
    barra_principal.add(Tamano);



    fuente.add(arial);
    fuente.add(verdana);
    fuente.add(courier);

    estilo.add(negrita);
    estilo.add(cursiva);

    Tamano.add(t12);
    Tamano.add(t18);
    Tamano.add(t20);




        arial.addActionListener(new Accion());
        verdana.addActionListener(new Accion());
        courier.addActionListener(new Accion());
        t12.addActionListener(new Accion());
        t18.addActionListener(new Accion());
        t20.addActionListener(new Accion());
        negrita.addActionListener(new Accion());
        cursiva.addActionListener(new Accion());



    add(areatexto,BorderLayout.CENTER);
    add(barra_principal,BorderLayout.NORTH);

    }

    private class Accion implements ActionListener{



        @Override
        public void actionPerformed(ActionEvent e) {
            Font textoactual= areatexto.getFont();
            String tipoletra=textoactual.getName();
            int estilo=textoactual.getStyle();
            int tamanoletra=textoactual.getSize();
            String fuente = e.getActionCommand();
        if (fuente.equals("Arial") || fuente.equals("Verdana") || fuente.equals("Courier")){
            areatexto.setFont(new Font(fuente,estilo,tamanoletra));

        } else if (fuente.equals("negrita") || fuente.equals("cursiva")) {
            if (fuente.equals("negrita")){
                areatexto.setFont(new Font(tipoletra,Font.BOLD,tamanoletra));

            }else {
                areatexto.setFont(new Font(tipoletra,Font.ITALIC,tamanoletra));
            }

        }else {
            areatexto.setFont(new Font(tipoletra,estilo,Integer.parseInt(fuente)));
        }

        }
    }

   private JMenuItem arial,verdana,courier;


    //estilo
   private JMenuItem negrita,cursiva;



    //tamaño
   private JMenuItem t12,t18,t20;


    private JTextPane areatexto;

}
