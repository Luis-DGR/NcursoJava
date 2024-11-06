package evenyos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Clase principal que maneja los eventos de teclado
public class Eventos_teclado {
    public static void main(String[] args) {
        // Crea una instancia de la clase Marcoparaeventosteclado1
        Marcoparaeventosteclado1 marquitoteclas = new Marcoparaeventosteclado1();

        // Configura la operación de cierre de la ventana al cerrar el programa
        marquitoteclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Clase que define el marco (ventana) donde se capturarán los eventos de teclado
class Marcoparaeventosteclado1 extends JFrame {
    public Marcoparaeventosteclado1() {
        // Hace visible la ventana
        setVisible(true);

        // Establece el tamaño de la ventana
        setSize(600, 450);

        // Establece la posición de la ventana en la pantalla (400 píxeles desde la izquierda y 200 desde arriba)
        setLocation(400, 200);

        // Establece el título de la ventana
        setTitle("primer texto");

        // Crea una instancia de la clase EventoTeclado, que maneja los eventos de teclado
        EventoTeclado nuevoeventoteclado = new EventoTeclado();

        // Agrega el listener (escuchador) de eventos de teclado a la ventana
        addKeyListener(nuevoeventoteclado);
    }
}

// Clase que implementa la interfaz KeyListener para manejar los eventos de teclado
class EventoTeclado implements KeyListener {
    // Metodo que se ejecuta cuando una tecla se presiona
    @Override
    public void keyPressed(KeyEvent e) {
        // Obtiene el código de la tecla presionada
        int codigo = e.getKeyCode();

        // Obtiene el carácter de la tecla presionada
        char letra = e.getKeyChar();

        // Imprime en consola el código y el carácter de la tecla presionada
        System.out.println(codigo + " " + letra);
    }

    // Metodo que se ejecuta cuando una tecla se suelta (sin implementación en este caso)
    @Override
    public void keyReleased(KeyEvent e) {}

    // Metodo que se ejecuta cuando una tecla se tipea (sin implementación en este caso)
    @Override
    public void keyTyped(KeyEvent e) {}
}
