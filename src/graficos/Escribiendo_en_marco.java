package graficos;

import com.sun.org.apache.xpath.internal.functions.FuncSubstringAfter;

import javax.swing.*;
import java.awt.*;
public class Escribiendo_en_marco {
    public static void main(String[] args) {

    Marcotexto mimarquito=new Marcotexto();

    mimarquito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
//crear marco y añadir lamina
class Marcotexto extends JFrame{
    public Marcotexto(){
    setVisible(true);
    setSize(600,450);
    setLocation(400,200);
    setTitle("primer texto");
    Lamina milamina=new Lamina();
    add(milamina);


    }
}
//crear lamina y escribir en lamina
class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("a la verga",100,100);

    }

}