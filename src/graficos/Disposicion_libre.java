package graficos;

import javax.swing.*;
import java.awt.*;

public class Disposicion_libre {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Layout Example"); // Crea la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece el layout personalizado con un espacio de 10 píxeles entre componentes
        frame.setLayout(new VerticalLayout(10));

        // Añade botones al contenedor
        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Configura el tamaño de la ventana y la hace visible
        frame.setSize(200, 300);
        frame.setVisible(true);
    }
}

// Clase que implementa un layout personalizado que organiza los componentes en una columna vertical
class VerticalLayout implements LayoutManager {
    private int gap; // Espacio en píxeles entre los componentes

    // Constructor que inicializa el espacio entre componentes
    public VerticalLayout(int gap) {
        this.gap = gap;
    }

    // Metodo que se llama cuando se agrega un componente al layout (no se usa aquí)
    @Override
    public void addLayoutComponent(String name, Component comp) {}

    // Metodo que se llama cuando se elimina un componente del layout (no se usa aquí)
    @Override
    public void removeLayoutComponent(Component comp) {}

    // Calcula el tamaño preferido del contenedor basado en el tamaño de los componentes
    @Override
    public Dimension preferredLayoutSize(Container parent) {
        int width = 0;   // Ancho máximo encontrado entre los componentes
        int height = gap; // Altura total necesaria, incluyendo espacio entre componentes

        // Recorremos cada componente en el contenedor
        for (Component comp : parent.getComponents()) {
            Dimension d = comp.getPreferredSize(); // Obtiene el tamaño preferido de cada componente

            width = Math.max(width, d.width); // Actualiza el ancho al mayor ancho encontrado
            height += d.height + gap;         // Suma la altura del componente más el espacio entre ellos
        }

        // Devuelve el tamaño preferido total del contenedor
        return new Dimension(width, height);
    }

    // Calcula el tamaño mínimo del contenedor (aquí igual al tamaño preferido)
    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }

    // Organiza los componentes dentro del contenedor
    @Override
    public void layoutContainer(Container parent) {
        int y = gap; // Coordenada y inicial, comenzando con el primer espacio de separación

        // Recorremos cada componente en el contenedor
        for (Component comp : parent.getComponents()) {
            Dimension d = comp.getPreferredSize(); // Obtiene el tamaño preferido de cada componente

            // Coloca el componente en la posición calculada y con el ancho del contenedor
            comp.setBounds(gap, y, parent.getWidth() - 2 * gap, d.height);

            // Actualiza la posición y para el próximo componente, sumando la altura y el espacio entre componentes
            y += d.height + gap;
        }
    }
}


