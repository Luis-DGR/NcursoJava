package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Barra_de_herramientas {
    public static void main(String[] args) {
        Marco_action2 marquito5 = new Marco_action2();
        marquito5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marquito5.setVisible(true);
    }
}

class Marco_action2 extends JFrame {
    public Marco_action2() {
        setTitle("prueba acciones");
        setBounds(600, 300, 600, 300);

        // Crear el panel principal y agregarlo al marco
        PanelAction2 lamina = new PanelAction2();
        add(lamina);

        // Crear y configurar la barra de herramientas
        JToolBar barra = new JToolBar();
        barra.setFloatable(true); // Hacer que la barra sea movible

        // Crear las acciones de los botones
        PanelAction2.ActionColor2 accionAmarillo = lamina.new ActionColor2("Amarillo", Color.yellow);
        PanelAction2.ActionColor2 accionred = lamina.new ActionColor2("Rojo", Color.red);
        PanelAction2.ActionColor2 accionblue = lamina.new ActionColor2("Azul", Color.blue);

        // Agregar botones de acción a la barra de herramientas
        barra.add(new JButton(accionAmarillo));
        barra.add(new JButton(accionred));
        barra.add(new JButton(accionblue));

        // Agregar la barra de herramientas al marco en la posición superior
        add(barra, BorderLayout.NORTH);
    }
}

class PanelAction2 extends JPanel {
    public PanelAction2() {
        // Constructor vacío para inicializar el panel
    }

    // Clase de acción interna para cambiar el color de fondo
    public class ActionColor2 extends AbstractAction {
        public ActionColor2(String nombre, Color color_boton) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + nombre);
            putValue("color fondo", color_boton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color fondo");
            setBackground(c);
        }
    }
}