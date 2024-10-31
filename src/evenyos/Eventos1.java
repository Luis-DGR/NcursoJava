package evenyos;
// Define el paquete en el que se encuentra esta clase

import javax.swing.*;
// Importa la biblioteca para crear interfaces gráficas en Java

import java.awt.*;
// Importa las clases necesarias para trabajar con gráficos

import java.awt.event.ActionEvent;
// Importa la clase ActionEvent para manejar eventos de acción

import java.awt.event.ActionListener;
// Importa la interfaz ActionListener para definir acciones en respuesta a eventos

public class Eventos1 {
    // Declara la clase principal

    public static void main(String[] args) {
        // Metodo principal de la aplicación

        Marcoevento evento1 = new Marcoevento();
        // Crea una instancia de la clase Marcoevento

        evento1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configura el cierre de la ventana al salir de la aplicación
    }
}

class Marcoevento extends JFrame {
    // Declara la clase Marcoevento que extiende JFrame

    public Marcoevento() {
        // Constructor de la clase Marcoevento

        setVisible(true);
        // Hace visible la ventana

        setSize(600, 450);
        // Establece el tamaño de la ventana

        setLocation(400, 200);
        // Establece la posición de la ventana en la pantalla

        setTitle("primer texto");
        // Establece el título de la ventana

        Lamin milamin = new Lamin();
        // Crea una instancia de la clase Lamin

        add(milamin);
        // Añade la instancia de Lamin al marco principal
    }
}

// Crear una lámina y añadir botones de colores
class Lamin extends JPanel implements ActionListener {
    // Declara la clase Lamin que extiende JPanel e implementa ActionListener

    JButton boton_azul = new JButton("Azul");
    // Crea un botón llamado "Azul"

    JButton boton_red = new JButton("Rojo");
    // Crea un botón llamado "Rojo"

    JButton boton_yellow = new JButton("Amarillo");
    // Crea un botón llamado "Amarillo"

    public Lamin() {
        // Constructor de la clase Lamin

        add(boton_azul);
        // Añade el botón azul al panel

        add(boton_red);
        // Añade el botón rojo al panel

        add(boton_yellow);
        // Añade el botón amarillo al panel

        boton_azul.addActionListener(this);
        // Asigna un ActionListener al botón azul

        boton_red.addActionListener(this);
        // Asigna un ActionListener al botón rojo

        boton_yellow.addActionListener(this);
        // Asigna un ActionListener al botón amarillo
    }

    public void actionPerformed(ActionEvent e) {
        // Define el metodo actionPerformed para manejar los eventos de los botones

        Object boton_pulsado = e.getSource();
        // Obtiene la fuente del evento (el botón presionado)

        if (boton_pulsado == boton_azul) {
            // Comprueba si se ha presionado el botón azul

            setBackground(Color.blue);
            // Cambia el color de fondo a azul
        } else if (boton_pulsado == boton_red) {
            // Comprueba si se ha presionado el botón rojo

            setBackground(Color.red);
            // Cambia el color de fondo a rojo
        } else if (boton_pulsado == boton_yellow) {
            // Comprueba si se ha presionado el botón amarillo

            setBackground(Color.yellow);
            // Cambia el color de fondo a amarillo
        }
    }
}
