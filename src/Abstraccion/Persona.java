package Abstraccion;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
    public static void main(String[] args) {


    }



}
//clase abstracta abstracto
 abstract class Clases_abstractas {
private String nombre;
    public Clases_abstractas(String nom){
      nombre=nom;
    }

    public String getnombre(){
        return nombre;
    }
    //metodo abstracto
    public abstract String damedescripcion();



}



class Empleado2 extends Clases_abstractas {
    public Empleado2( String nom,double sue, int year, int month, int day) {
     super(nom);

        sueldo = sue;
        //clase que construye una fecha
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);
        altacontrato = calendar.getTime();


    }

    public String damedescripcion(){
        return "jgoirehljgño";
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


    private double sueldo;
    private Date altacontrato;
    private static int IdSiguientes;
    private int Id;
}