package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_conLAyouts {
    public static void main(String[] args) {
     Marco_calculadora Mi_calculadora1=new Marco_calculadora();
     Mi_calculadora1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Mi_calculadora1.setVisible(true);


    }
}
class Marco_calculadora extends JFrame{
    public Marco_calculadora(){
        setTitle("calculadora");
        setBounds(500,400,400,400);

        add(new Lamina_calculadora1());
         //adaptar el tamaño al contenedor
       // pack();


        setVisible(true);
    }
}
class Lamina_calculadora1 extends JPanel{
    public Lamina_calculadora1(){
        principio=true;
        setLayout(new BorderLayout(10,10));
       pantalla=new JButton("0");
        pantalla.setEnabled(false);

        add(pantalla,BorderLayout.NORTH);

        lamina_calculadora2=new JPanel();
        lamina_calculadora2.setLayout(new GridLayout(4,4));
        ActionListener Insertar=new Insertanumer();
        ActionListener orden=new AccionOrden();


        ponerboton("7",Insertar);
        ponerboton("8",Insertar);
        ponerboton("9",Insertar);
        ponerboton("/",orden);
        ponerboton("4",Insertar);
        ponerboton("5",Insertar);
        ponerboton("6",Insertar);
        ponerboton("*",orden);
        ponerboton("1",Insertar);
        ponerboton("2",Insertar);
        ponerboton("3",Insertar);
        ponerboton("-",orden);
        ponerboton("0",Insertar);
        ponerboton(".",Insertar);
        ponerboton("+",orden);
        ponerboton("=",orden);


        add(lamina_calculadora2,BorderLayout.CENTER);
        ultimaOperacion="=";
    }
    private void ponerboton(String rotulo,ActionListener oyente){
        JButton boton=new JButton(rotulo);

        boton.addActionListener(oyente);
        lamina_calculadora2.add(boton);


    }
    private class Insertanumer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //devuelve el String asociado
            String entrada=e.getActionCommand();
            if (principio){
                pantalla.setText("");
                principio=false;
            }
            pantalla.setText(pantalla.getText()+entrada);


        }

    }
    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String operacion=e.getActionCommand();

            ultimaOperacion=operacion;

            calcular(Double.parseDouble(pantalla.getText()));

            principio=true;



        }
        public void calcular(double x){
            if (ultimaOperacion.equals("+")){
                 resultado+= x;

            }else if (ultimaOperacion.equals("-")){
                resultado-=x;
            }else if (ultimaOperacion.equals("*")){
                resultado*=x;
            }else if (ultimaOperacion.equals("/")){
                resultado/=x;
            }else if (ultimaOperacion.equals("=")){
                resultado=x;
            }
            pantalla.setText(""+resultado);




        }
    }
    private double resultado;
    private String ultimaOperacion;
    private JPanel lamina_calculadora2;
    private JButton pantalla;
private boolean principio;
}
