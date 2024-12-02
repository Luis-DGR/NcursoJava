package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Clase principal que ejecuta la calculadora
public class Calculadora_conLAyouts {
    // Metodo principal para iniciar la calculadora
    public static void main(String[] args) {
        // Crear una instancia del marco de la calculadora
        Marco_calculadora Mi_calculadora1 = new Marco_calculadora();
        // Establecer el comportamiento de cierre de la ventana
        Mi_calculadora1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Hacer visible la ventana de la calculadora
        Mi_calculadora1.setVisible(true);
    }
}

// Clase que define la ventana principal de la calculadora
class Marco_calculadora extends JFrame {
    // Constructor de la clase que inicializa el marco de la calculadora
    public Marco_calculadora() {
        // Establecer el título de la ventana
        setTitle("calculadora");
        // Establecer la posición y el tamaño de la ventana
        setBounds(500, 400, 400, 400);
        // Agregar el panel con los componentes de la calculadora
        add(new Lamina_calculadora1());
        // Adaptar el tamaño de la ventana al contenido (comentado)
        // pack();
    }
}

// Clase que define el panel con los botones de la calculadora
class Lamina_calculadora1 extends JPanel {
    // Constructor de la clase que inicializa los componentes de la calculadora
    public Lamina_calculadora1() {
        // Inicializar la variable 'principio' como true
        principio = true;
        // Establecer el layout del panel como BorderLayout
        setLayout(new BorderLayout(10, 10));
        // Crear un botón para mostrar la pantalla de la calculadora
        pantalla = new JButton("0");
        // Deshabilitar el botón de la pantalla para que no se pueda hacer clic
        pantalla.setEnabled(false);
        // Agregar el botón de la pantalla al norte del layout
        add(pantalla, BorderLayout.NORTH);

        // Crear un panel para contener los botones de la calculadora
        lamina_calculadora2 = new JPanel();
        // Establecer el layout del panel de los botones como GridLayout
        lamina_calculadora2.setLayout(new GridLayout(4, 4));
        // Crear los ActionListener para manejar las acciones de los botones
        ActionListener Insertar = new Insertanumer();
        ActionListener orden = new AccionOrden();

        // Crear y agregar los botones a la calculadora
        ponerboton("7", Insertar);
        ponerboton("8", Insertar);
        ponerboton("9", Insertar);
        ponerboton("/", orden);
        ponerboton("4", Insertar);
        ponerboton("5", Insertar);
        ponerboton("6", Insertar);
        ponerboton("*", orden);
        ponerboton("1", Insertar);
        ponerboton("2", Insertar);
        ponerboton("3", Insertar);
        ponerboton("-", orden);
        ponerboton("0", Insertar);
        ponerboton(".", Insertar);
        ponerboton("+", orden);
        ponerboton("=", orden);

        // Agregar el panel de los botones al centro del layout
        add(lamina_calculadora2, BorderLayout.CENTER);
        // Establecer la última operación como "="
        ultimaOperacion = "=";
    }

    // Metodo que agrega un botón con su acción correspondiente
    private void ponerboton(String rotulo, ActionListener oyente) {
        // Crear un nuevo botón con el texto especificado
        JButton boton = new JButton(rotulo);
        // Asociar un ActionListener al botón
        boton.addActionListener(oyente);
        // Agregar el botón al panel de botones
        lamina_calculadora2.add(boton);
    }

    // Clase interna que maneja la inserción de números en la pantalla
    private class Insertanumer implements ActionListener {
        // Metodo que maneja el evento de clic en un botón numérico
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del botón que se hizo clic
            String entrada = e.getActionCommand();
            // Si es la primera vez que se presiona un número, limpiar la pantalla
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            // Agregar el número presionado a la pantalla
            pantalla.setText(pantalla.getText() + entrada);
        }
    }

    // Clase interna que maneja las operaciones matemáticas
    private class AccionOrden implements ActionListener {
        // Metodo que maneja el evento de clic en un botón de operación
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del botón que se hizo clic (operación)
            String operacion = e.getActionCommand();
            // Realizar el cálculo con el valor de la pantalla
            calcular(Double.parseDouble(pantalla.getText()));
            // Guardar la operación para la siguiente
            ultimaOperacion = operacion;
            // Establecer que la próxima entrada será un número
            principio = true;
        }

        // Metodo que realiza el cálculo dependiendo de la operación seleccionada
        public void calcular(double x) {
            // Verificar cuál fue la última operación y realizar la operación correspondiente
            if (ultimaOperacion.equals("+")) {
                resultado += x;
            } else if (ultimaOperacion.equals("-")) {
                resultado -= x;
            } else if (ultimaOperacion.equals("*")) {
                resultado *= x;
            } else if (ultimaOperacion.equals("/")) {
                resultado /= x;
            } else if (ultimaOperacion.equals("=")) {
                resultado = x;
            }
            // Mostrar el resultado en la pantalla
            pantalla.setText("" + resultado);
        }
    }

    // Declaración de variables para el cálculo y la interfaz
    private double resultado; // Resultado acumulado de las operaciones
    private String ultimaOperacion; // Última operación realizada
    private JPanel lamina_calculadora2; // Panel donde se encuentran los botones
    private JButton pantalla; // Botón que actúa como pantalla de la calculadora
    private boolean principio; // Indica si se está comenzando una nueva operación
}
