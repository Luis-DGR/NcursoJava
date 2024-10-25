package graficos;

import javax.swing.*;
import java.awt.*;

public class Creando__marco_centrado {
    public static void main(String[] args) {
    Marco_centrado mimarcoxd=new Marco_centrado();
    mimarcoxd.setVisible(true);
    mimarcoxd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
class Marco_centrado extends JFrame{
    //contructor
    public Marco_centrado(){
        //creamos objeto de la clase toolkit
        Toolkit mi_pantalla=Toolkit.getDefaultToolkit();
        //obtenemos dimensiones de pantalla en pixeles
        Dimension Tamano_pantalla=mi_pantalla.getScreenSize();
        //ancho
        int ancho_pantalla=Tamano_pantalla.width;
        //alto
        int altura_pantalla=Tamano_pantalla.height;

        //centramos el marco
        setBounds((ancho_pantalla/4),(altura_pantalla/4),(ancho_pantalla/2),(altura_pantalla/2));

        //damos titulo
        setTitle("marco centrado");

        //creamos un icono
        Image miIcono=mi_pantalla.getImage("C:\\Users\\David\\IdeaProjects\\NuevoCurso\\src\\graficos\\mimi.png");
        setIconImage(miIcono);



    }


}