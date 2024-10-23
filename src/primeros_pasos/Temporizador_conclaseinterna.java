package primeros_pasos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Temporizador_conclaseinterna {
    public static void main(String[] args) {
Reloj mireloj=new Reloj(3000,true);
mireloj.enMarcha();
JOptionPane.showMessageDialog(null,"pulsa aceptar");
System.exit(0);


    }

}
class Reloj{
    private int intervalo;
    private boolean sonido;
    public Reloj(int intervalo,boolean sonido){
        this.intervalo=intervalo;
        this.sonido=sonido;

    }
    //metodo
    public void enMarcha(){
        ActionListener oyente= new Dame_la_hora();
        Timer mitemporizador=new Timer(intervalo,oyente);
        mitemporizador.start();
    }

    //clase interna
    private class Dame_la_hora implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora=new Date();
            System.out.println("te pongo la hora cada 5"+ahora);
            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}