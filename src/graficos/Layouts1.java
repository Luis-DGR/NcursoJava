package graficos;



import javax.swing.*;
import java.awt.*;

public class Layouts1 {
    public static void main(String[] args) {
    Marco_layout Layout111=new Marco_layout();
    Layout111.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class Marco_layout extends JFrame{
    public Marco_layout(){
        setTitle("prueba acciones");
        setBounds(600, 300, 600, 300);
        Panel_layout Panel1=new Panel_layout();
        Panel_layout2 Panel2=new Panel_layout2();
        //modifica la disposicion para moverlo a la izquieda(INSTANSIANDO Y ASIGNANDO LAYOUT L OBJETO)

      /* FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
       Panel1.setLayout(disposicion);*/

        //modifica la disposicion para moverlo a la izquieda(EN UNA LINEA)
      // Panel1.setLayout(new FlowLayout(FlowLayout.LEFT));


        //hacemos que el panel solo utilice la parte norte para que panel 2 sea visible
        add(Panel1,BorderLayout.NORTH);
        add(Panel2);
        setVisible(true);
    }

}
class Panel_layout extends JPanel{
    public Panel_layout(){


        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("amarillo"));
        add(new JButton("rojo"));

    }
}
class Panel_layout2 extends JPanel{
   public Panel_layout2(){
       //posicion con borderlayout
       setLayout(new BorderLayout());
        add(new JButton("azul"),BorderLayout.WEST);
        add(new JButton("verde"),BorderLayout.SOUTH);
        add(new JButton("black"),BorderLayout.CENTER);
    }
}