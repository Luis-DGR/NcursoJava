package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox1 {
    public static void main(String[] args) {
       Marco2 lilo = new Marco2();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marco2 extends JFrame {
    public Marco2() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAmina2 milami=new LAmina2();
        add(milami);



        setVisible(true);


    }
}
class LAmina2 extends JPanel{
    public LAmina2(){
    setLayout(new BorderLayout());
    //Font es una clase que sirve para establecer tipos de letra(fuentes)
    Font miletra=new Font("Serif",Font.PLAIN,24);

    texto=new JLabel("tangamandapio");
    //establecemos la letrA
    texto.setFont(miletra);
    JPanel laminatexto=new JPanel();
    laminatexto.add(texto,BorderLayout.CENTER);
    add(laminatexto);
    check1=new JCheckBox("negrita");
    check2=new JCheckBox("cursiva");

    check1.addActionListener(new Manejachecks());
    check2.addActionListener(new Manejachecks());
    JPanel laminachecks=new JPanel();
    laminachecks.add(check1);
    laminachecks.add(check2);
    add(laminachecks,BorderLayout.SOUTH);

    setVisible(true);
    }
    private class Manejachecks implements ActionListener{

        // Metodo que se ejecuta cuando ocurre un evento de acción (como hacer clic en un checkbox)
        @Override
        public void actionPerformed(ActionEvent e) {
            // Inicializamos la variable tipo en 0; se usará para almacenar el estilo de fuente
            int tipo = 0;

            // Si el checkbox check1 está seleccionado, sumamos el estilo negrita (BOLD) a tipo
            if (check1.isSelected()) tipo += Font.BOLD;

            // Si el checkbox check2 está seleccionado, sumamos el estilo cursiva (ITALIC) a tipo
            if (check2.isSelected()) tipo += Font.ITALIC;

            // Establecemos el nuevo estilo de fuente en el componente 'texto'
            // La fuente será de tipo "Serif", con el estilo determinado en 'tipo' y tamaño 24
            texto.setFont(new Font("Serif", tipo, 24));
        }
    }
    private JLabel texto;
    private JCheckBox check1,check2;
}


