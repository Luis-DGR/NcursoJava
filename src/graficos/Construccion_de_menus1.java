package graficos;

import javax.swing.*;

public class Construccion_de_menus1 {
    public static void main(String[] args) {
        Marcox7 lilo = new Marcox7();
        lilo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lilo.setVisible(true);
    }
}
class Marcox7 extends JFrame {
    public Marcox7() {
        setBounds(200, 300, 400, 500);
        setTitle("pruebas");
        LAminax8 milami=new LAminax8();
        add(milami);



        setVisible(true);


    }
}
class LAminax8 extends JPanel{
    public LAminax8(){
    JMenuBar mibarra=new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");

        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar Como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Generales1");
        JMenuItem opcion2 = new JMenuItem("Generales2");


        archivo.add(guardar);
        archivo.add(guardar_como);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        herramientas.add(generales);
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);


        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);

        add(mibarra);

    }
}

