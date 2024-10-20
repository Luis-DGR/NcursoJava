package poo;

import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_empleado {
    public static void main(String[] args) {

        Empleado empleado1=new Empleado("Luis",1000.00, 2023,2,23);
        Empleado empleado2=new Empleado("Luisaaa",1050.00, 2024,5,27);

        empleado1.set_subeSueldo(5);
        empleado2.set_subeSueldo(2);
        System.out.println("nombre: "+empleado1.getNombre()+"  sueldo: "+empleado1.getSueldo()+"  se contrato en: "+empleado1.getAltacontrato());



    }
}
class Empleado{
    public Empleado(String nom, double sue, int year, int month, int day) {

        nombre=nom;
        sueldo=sue;
        //clase que construye una fecha
        GregorianCalendar calendar=new GregorianCalendar(year, month, day);
        altacontrato=calendar.getTime();


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
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;


    }

    private  String nombre;
    private double sueldo;
    private Date altacontrato;








}



















