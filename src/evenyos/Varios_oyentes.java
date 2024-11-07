package evenyos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase principal que ejecuta el programa
public class Varios_oyentes {
    public static void main(String[] args) {

        // Crea una instancia del marco principal
        Marco_principal111 marco = new Marco_principal111();

        // Define la acción al cerrar la ventana principal
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hace visible el marco principal
        marco.setVisible(true);
    }
}

// Clase que representa el marco principal de la aplicación
class Marco_principal111 extends JFrame {

    // Constructor del marco principal
    public Marco_principal111() {

        // Establece el título de la ventana
        setTitle("Prueba Varios");

        // Define la posición y tamaño del marco (x, y, ancho, alto)
        setBounds(600, 300, 600, 300);

        // Crea una lámina (panel) principal y la añade al marco
        Lamina_principal111 lamina = new Lamina_principal111();
        add(lamina);

        // Hace visible el marco
        setVisible(true);
    }
}

// Clase que representa la lámina principal donde se agregan los botones
class Lamina_principal111 extends JPanel {

    // Declaración de un botón que cierra todas las ventanas emergentes
    JButton boton_cerrar;

    // Constructor de la lámina principal
    public Lamina_principal111() {

        // Crea un botón para abrir nuevas ventanas emergentes
        JButton boton_nuevo = new JButton("Nuevo");

        // Añade el botón de "Nuevo" a la lámina
        add(boton_nuevo);

        // Crea el botón de Cerrar tod y lo añade a la lámina
        boton_cerrar = new JButton("Cerrar todo");
        add(boton_cerrar);

        // Crea un oyente que maneja el evento de abrir una nueva ventana emergente
        Oyente_nuevo111 miOyente = new Oyente_nuevo111();

        // Asigna el oyente al botón "Nuevo" para que ejecute la acción
        boton_nuevo.addActionListener(miOyente);
    }

    // Clase interna que define el oyente para el botón "Nuevo"
    private class Oyente_nuevo111 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Al presionar el botón "Nuevo", crea una nueva ventana emergente
            Marco_emergente1111 marco = new Marco_emergente1111(boton_cerrar);

            // Hace visible la ventana emergente
            marco.setVisible(true);
        }
    }
}

// Clase que representa la ventana emergente que se abre al presionar el botón "Nuevo"
class Marco_emergente1111 extends JFrame {

    // Contador estático para llevar la cuenta de las ventanas abiertas
    static int contador = 0;

    // Constructor de la ventana emergente
    public Marco_emergente1111(JButton boton_principal) {

        // Incrementa el contador de ventanas
        contador++;

        // Establece el título de la ventana usando el número de ventana
        setTitle("Ventana " + contador);

        // Define la posición y tamaño de la ventana emergente
        setBounds(300, 50 * contador, 300, 200);

        // Crea un oyente que se encargará de cerrar la ventana emergente
        Cierraalv oyentecerrar = new Cierraalv();

        // Asocia el oyente al botón "Cerrar tod" para que cierre esta ventana
        boton_principal.addActionListener(oyentecerrar);
    }

    // Clase interna que define el oyente para cerrar la ventana emergente
    private class Cierraalv implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Cierra esta ventana emergente cuando se ejecuta el evento
            dispose();
        }
    }
}
