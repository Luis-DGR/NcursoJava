package evenyos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Areas_de_texto1 {
    public static void main(String[] args) {
        Marco_Prueba3 lolo = new Marco_Prueba3();
        lolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lolo.setVisible(true);
    }
}
class Marco_Prueba3 extends JFrame {
    public Marco_Prueba3() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAmina_area milamina=new LAmina_area();
        add(milamina);



        setVisible(true);


    }
}
class LAmina_area extends JPanel{
    public LAmina_area(){
         areatexto=new JTextArea(8,20);
        //crea una lamina que se desplaza con el cursor añadiendo la lamina con el cuadro de texto
        JScrollPane laminascroll=new JScrollPane(areatexto);




        areatexto.setLineWrap(true);
        add(laminascroll);
        JButton boton=new JButton("dale");
        boton.addActionListener(new AccionBoton());
        add(boton);


    }
    private class AccionBoton implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(areatexto.getText());
        }
    }
    JTextArea areatexto;
}



