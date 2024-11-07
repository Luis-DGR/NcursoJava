package evenyos;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class Eventos_cuadrosTexto2 {
    public static void main(String[] args) {
        Marco_Prueba2 lolo = new Marco_Prueba2();
        lolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lolo.setVisible(true);
    }
}
    class Marco_Prueba2 extends JFrame {
        public Marco_Prueba2() {
            setBounds(200, 300, 400, 500);
            setTitle("pruebas");

            LaminaPasword milamina = new LaminaPasword();
            add(milamina);


            setVisible(true);


        }
    }
class LaminaPasword extends JPanel{
    public LaminaPasword(){

        setLayout(new BorderLayout());
        JPanel Laminasuperior=new JPanel();

        Laminasuperior.setLayout(new GridLayout(2,2));
        add(Laminasuperior,BorderLayout.NORTH);

        JLabel etiqueta1=new JLabel("usuario");
        JLabel etiqueta2=new JLabel("contraseña");

        JTextField c_usuario=new JTextField(15);
        Comprueba_pass mievento=new Comprueba_pass();
        //para que no se vea la contraseña
         c_contra=new JPasswordField(15);
         c_contra.getDocument().addDocumentListener(mievento);

        Laminasuperior.add(etiqueta1);
        Laminasuperior.add(c_usuario);
        Laminasuperior.add(etiqueta2);
        Laminasuperior.add(c_contra);

        JButton enviar=new JButton("enviar");
         add(enviar,BorderLayout.SOUTH);


    }
    private class Comprueba_pass implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

        char [] contrasena;
        contrasena=c_contra.getPassword();
        if (contrasena.length<8 || contrasena.length>12){
            c_contra.setBackground(Color.red);
        }else {
            c_contra.setBackground(Color.GREEN);
        }


        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char [] contrasena;
            contrasena=c_contra.getPassword();
            if (contrasena.length<8 || contrasena.length>12){
                c_contra.setBackground(Color.red);
            }else {
                c_contra.setBackground(Color.GREEN);
            }


        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
    private JPasswordField c_contra;
}

