package graficos; // Define el paquete donde se encuentra la clase

import javax.swing.*; // Importa las clases necesarias para la interfaz gráfica de Java
import java.awt.*;    // Importa las clases para el dibujo en pantalla

// Clase principal que ejecuta el programa
public class Dibujarenmarco {
    public static void main(String[] args) {

        // Crea una instancia de la ventana (marco) donde se dibujará
        Marcoparadibujar marquito2 = new Marcoparadibujar();

        // Configura la ventana para que el programa finalice al cerrarla
        marquito2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Clase que representa la ventana principal
class Marcoparadibujar extends JFrame {
    public Marcoparadibujar() {
        setVisible(true);         // Hace visible la ventana
        setSize(600, 450);        // Establece el tamaño de la ventana (600x450 píxeles)
        setLocation(400, 200);    // Posiciona la ventana en la pantalla
        setTitle("primer texto"); // Establece el título de la ventana

        // Crea una instancia del panel de dibujo y la añade a la ventana
        lamina_con_figuras milami = new lamina_con_figuras();
        add(milami);              // Añade el panel a la ventana
    }
}

// Clase que representa el panel de dibujo
class lamina_con_figuras extends JPanel {

    // Metodo que se llama automáticamente cuando el panel necesita ser redibujado
    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Llama al metodo de la superclase para limpiar el área de dibujo

        // Dibuja un rectángulo con la esquina superior izquierda en (50, 50) y tamaño 200x200 píxeles
        g.drawRect(50, 50, 200, 200);
    }
}
