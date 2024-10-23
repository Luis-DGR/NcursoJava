package poo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_empleado {
    public static void main(String[] args) {

        Empleado empleado1=new Empleado("Luis",1000.00, 2023,2,23);
        Empleado empleado2=new Empleado("Luisaaa",1050.00, 2024,5,27);
        Jefatura jefaso=new Jefatura("Pedro", 2000.00, 2022, 10, 15);

        jefaso.setIncentivo(1000.25);

        Empleado [] misempleados=new Empleado[4];
        misempleados[0]=empleado1;
        misempleados[1]=empleado2;
        misempleados[2]=jefaso;

        /*a este jefe no se le puede aplicar el bono porque esta almasenado en misempleados
        asi que lo lo toma como si fuera de la clase "Empleado"
        para poder aplicarlo debemos hacer un CASTING(refundicion)*/

        misempleados[3]=new Jefatura("Pablito", 2000.00, 2022, 10, 15);

        //sintaxis= clase nuevo_nombre=(clase)valor que deseas hacer casting;
        Jefatura jefaso2=(Jefatura) misempleados[3];

        //ahora si nos permite aplicar el bono






 for (Empleado e:misempleados){
     System.out.println("nombre: "+e.getNombre()+" sueldo: "+e.getSueldo());
 /*aqui se ejemplifica el polimorfismo porque las clases empleado y jefaso
    aplican el metodo get sueldo de diferente manera  */

 }



    }
}
class Empleado {
    public Empleado(String nom, double sue, int year, int month, int day) {

        nombre = nom;
        sueldo = sue;
        //clase que construye una fecha
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        altacontrato = calendar.getTime();


    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltacontrato() {
        return altacontrato;
    }

    public void set_subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;


    }

    private String nombre;
    private double sueldo;
    private Date altacontrato;
    private static int IdSiguiente;
    private int Id;
}

class Jefatura extends Empleado{

    public Jefatura(String nom,double sue,int year, int month, int day){
        super(nom, sue, year, month, day);


    }


    public void setIncentivo(double incen) {
        Incentivo = incen;
    }
    @Override
    public double getSueldo() {
        if (Incentivo==0){

           Incentivo= Double.parseDouble(JOptionPane.showInputDialog("cuanto insentivo"));
        }
        double sueldojefe=super.getSueldo();
        return sueldojefe+Incentivo;
    }
    private double Incentivo=0;


}



