package Sockets;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Cliente {

    public static void main(String[] args) {

        MarcoCliente mimarco=new MarcoCliente();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class MarcoCliente extends JFrame{

    public MarcoCliente(){

        setBounds(600,300,280,350);

        LaminaMarcoCliente milamina=new LaminaMarcoCliente();

        add(milamina);

        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel{

    public LaminaMarcoCliente(){

        JLabel texto=new JLabel("CLIENTE");

        add(texto);

        campo1=new JTextField(20);

        add(campo1);

        miboton=new JButton("Enviar");
        EnviaTexto evento=new EnviaTexto();
        miboton.addActionListener(evento);
        add(miboton);

    }
    private class EnviaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Socket canal = new Socket("ipxxxx", 9999);
                //construir puente de salida
                DataOutputStream flujoSalida = new DataOutputStream(canal.getOutputStream());

                flujoSalida.writeUTF(campo1.getText());
                flujoSalida.close();

            }catch (UnknownHostException e1){
                e1.printStackTrace();}
            catch (IOException e1) {
                System.out.println((e1.getMessage()));

            }


        }
    }






    private JTextField campo1;

    private JButton miboton;

}