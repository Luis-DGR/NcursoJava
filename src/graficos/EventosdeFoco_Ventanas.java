package graficos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

// Definimos la clase principal que extiende de JFrame para crear una ventana
public class EventosdeFoco_Ventanas extends JFrame implements WindowFocusListener {

    // Metodo principal de la clase donde se inicia la ejecución
    public static void main(String[] args) {
        // Creamos una instancia de la clase 'EventosdeFoco_Ventanas' y la asignamos a la variable 'miv'
        EventosdeFoco_Ventanas miv = new EventosdeFoco_Ventanas();

        // Llamamos al metodo 'iniciar()' para configurar las ventanas
        miv.iniciar();
    }

    // Declaramos dos variables que representarán dos ventanas
    EventosdeFoco_Ventanas marco1;
    EventosdeFoco_Ventanas marco2;

    // Metodo que configura las dos ventanas
    public void iniciar(){
        // Creamos las dos instancias de la clase 'EventosdeFoco_Ventanas'
        marco1 = new EventosdeFoco_Ventanas();
        marco2 = new EventosdeFoco_Ventanas();

        // Hacemos visibles las dos ventanas
        marco1.setVisible(true);
        marco2.setVisible(true);

        // Establecemos las posiciones y tamaños de las dos ventanas (usando coordenadas y dimensiones)
        marco1.setBounds(300, 100, 600, 350);
        marco2.setBounds(800, 100, 600, 350);

        // Agregamos un 'WindowFocusListener' a ambas ventanas para detectar cuándo ganan o pierden el foco
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);

        // Definimos las operaciones que deben realizarse al cerrar las ventanas (en este caso, salir de la aplicación)
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Metodo que se ejecuta cuando una de las ventanas gana el foco
    @Override
    public void windowGainedFocus(WindowEvent e) {
        // Verificamos cuál de las dos ventanas ha ganado el foco y cambiamos el título en consecuencia
        if (e.getSource() == marco1) {
            // Si la ventana que ha ganado el foco es 'marco1', cambiamos su título
            marco1.setTitle("tengo el foco");
        } else {
            // Si es 'marco2', cambiamos su título
            marco2.setTitle("tengo el foco");
        }
    }

    // Metodo que se ejecuta cuando una de las ventanas pierde el foco
    @Override
    public void windowLostFocus(WindowEvent e) {
        // Verificamos cuál de las dos ventanas ha perdido el foco y restablecemos su título
        if (e.getSource() == marco1) {
            // Si la ventana que ha perdido el foco es 'marco1', restablecemos su título
            marco1.setTitle("");
        } else {
            // Si es 'marco2', restablecemos su título
            marco2.setTitle("");
        }
    }
}
