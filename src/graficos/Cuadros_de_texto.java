package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuadros_de_texto {
    public static void main(String[] args) {
        Marco_texto mimarco=new Marco_texto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
class Marco_texto extends JFrame{
    public Marco_texto(){
        setBounds(500,300,500,300);
        setTitle("Cuadros de texto");


        Laminatexto milamina=new Laminatexto();
        add(milamina);


        setVisible(true);
    }
}
class Laminatexto extends JPanel{
    public Laminatexto(){
        setLayout(new BorderLayout());

        JPanel milamina2=new JPanel();
        milamina2.setLayout(new FlowLayout());

        resultado=new JLabel("",JLabel.CENTER);

        JLabel texto1=new JLabel("email");
        milamina2.add(texto1);

        campo1=new JTextField(20);
        milamina2.add(campo1);
        add(resultado);
        JButton miboton=new JButton("comprobar");



        Dametexto mievento=new Dametexto();
        miboton.addActionListener(mievento);

        milamina2.add(miboton);
        add(milamina2,BorderLayout.NORTH);

    }
    private class Dametexto implements ActionListener{
        //.trim QUITA ESPACIOS ADICIONALES EN EL String
        @Override
        public void actionPerformed(ActionEvent e) {
            int correcto=0;
            String email=campo1.getText().trim();
            for (int i = 0; i <email.length() ; i++) {
                if(email.charAt(i)=='@'){
                    correcto++;
                }

            }
            if (correcto==1){
                resultado.setText("bien");
            }else {
                resultado.setText("estas pendejo");
            }

            System.out.println(campo1.getText().trim());


        }
    }
    private JLabel resultado;
    private JTextField campo1;
}