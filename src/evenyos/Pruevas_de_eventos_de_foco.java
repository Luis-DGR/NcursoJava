package evenyos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

// Clase principal que ejecuta el programa
public class Pruevas_de_eventos_de_foco {

    // Metodo main donde se ejecuta la lógica principal
    public static void main(String[] args) {
        // Creamos una instancia de 'Marco_para_foco' (ventana principal)
        Marco_para_foco mimarco_foco = new Marco_para_foco();

        // Establecemos que la aplicación se cierre al cerrar la ventana
        mimarco_foco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Clase que representa la ventana principal (hereda de JFrame)
class Marco_para_foco extends JFrame {

    // Constructor de la clase 'Marco_para_foco'
    public Marco_para_foco(){
        // Hacemos la ventana visible
        setVisible(true);

        // Establecemos las dimensiones y la posición de la ventana
        setBounds(300, 300, 600, 450);

        // Añadimos un panel (LaminaFoco) que contiene los campos de texto
        add(new LaminaFoco());
    }

    // Definimos la clase LanzaFocos, que implementa FocusListener para manejar eventos de foco
    private class LanzaFocos implements FocusListener {

        // Metodo que se ejecuta cuando un componente gana el foco
        @Override
        public void focusGained(FocusEvent e) {
            // Se imprime en consola un mensaje indicando que el componente ha ganado el foco
            System.out.println("ganaste foco");
        }

        // Metodo que se ejecuta cuando un componente pierde el foco
        @Override
        public void focusLost(FocusEvent e) {
            // Obtenemos el texto del primer campo de texto (cuadro1)
            String email = cuadro1.getText();

            // Variable para verificar si el texto contiene el símbolo '@'
            boolean comprobacion = false;

            // Recorremos el texto del campo 'email' y verificamos si contiene el '@'
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    comprobacion = true;
                }
            }
        }
    }

    // Clase que representa un panel con los campos de texto
    class LaminaFoco extends JPanel {

        // Metodo que se llama para dibujar los componentes en el panel
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Desactivamos el layout del panel para tener control total sobre la posición
            setLayout(null);

            // Creamos dos campos de texto (JTextField)
            cuadro1 = new JTextField();
            cuadro2 = new JTextField();

            // Establecemos las posiciones y tamaños de los campos de texto
            cuadro1.setBounds(120, 10, 150, 20);
            cuadro2.setBounds(120, 50, 150, 20);

            // Añadimos los campos de texto al panel
            add(cuadro1);
            add(cuadro2);

            // Creamos una instancia de la clase LanzaFocos para manejar los eventos de foco
            LanzaFocos elfoco = new LanzaFocos();

            // Añadimos el 'FocusListener' al primer campo de texto (cuadro1)
            cuadro1.addFocusListener(elfoco);

            // El 'FocusListener' no se ha añadido al segundo campo de texto (cuadro2) en este momento
            // cuadro2.addFocusListener(elfoco); // Esta línea está comentada
        }
    }

    // Declaramos los dos campos de texto como variables globales
    JTextField cuadro1;
    JTextField cuadro2;
}
