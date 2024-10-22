package poo;

public class Furgoneta extends Coche{
    private int capacidad_carga;
    private int plazas_extra;

    //constructor
    public Furgoneta(int plazas_extra,int capacidad_carga){

        //llama al constructor de la clase padre
        super();
        //adicion de la subclase para el constructor
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;



    }

    public String dime_datos_furgo() {
        return "la cpacidad de caraga es: "+capacidad_carga+"\n"+" las plazas extra son: "+plazas_extra;

    }
}
