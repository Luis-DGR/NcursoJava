package graficos;

import javax.swing.*;

public class Creando_marcos {
    public static void main(String[] args) {

        miMarco marco1=new miMarco();
        //setVisible para hacerlo visible
        marco1.setVisible(true);
        //esta instruccion hace que al cerrar la ventana finalice el programa
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//hacemos que la clase miMarco herede de la clase JFrame(ESTA CLASE NOS AYUDA CON VENTANAS E INTERFACES GRAFICAS)
class miMarco extends JFrame{
    public miMarco(){
        /*
        //crea una ventana con esas dimensiones
        setSize(500,300);
        //ESTABLECEMOS LALOCALIZACION
        setLocation(500,300);*/

        //lo mismo pero en una linea
        setBounds(500,300,500,300);

        //evita que se pueda redimensionar
        setResizable(false);

        //le da tamaño pantalla completa
        // setExtendedState(JFrame.MAXIMIZED_BOTH);

        //le damos titulo
        setTitle("ararara");



    }
}