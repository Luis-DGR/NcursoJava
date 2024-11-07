package evenyos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Eventos_CuadrosTexto {
    public static void main(String[] args) {
    Marco_Prueba lolo=new Marco_Prueba();
    lolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lolo.setVisible(true);
    }
}
class Marco_Prueba extends JFrame{
    public Marco_Prueba(){
        setBounds(200,300,400,500);
        setTitle("pruebas");

        Lamina_Prueba milamina=new Lamina_Prueba();
        add(milamina);





        setVisible(true);


    }
}
class Lamina_Prueba extends JPanel{
   public Lamina_Prueba(){
       JTextField micampo=new JTextField(20);

       Escuchatext el_evento=new Escuchatext();
       Document midoc=micampo.getDocument();

       midoc.addDocumentListener(el_evento);


       add(micampo);

   }
   private class Escuchatext implements DocumentListener{

       @Override
       public void insertUpdate(DocumentEvent e) {
           System.out.println("has insertado texto");
       }

       @Override
       public void removeUpdate(DocumentEvent e) {
           System.out.println("has removido texto");
       }

       @Override
       public void changedUpdate(DocumentEvent e) {
           System.out.println("cambiaste formato");
       }
   }
}