package poo;

import javax.swing.*;

public class Usovehiculo {
    public static void main(String[] args) {
        //crear objetos de la clase cohe(INSTANCIAR )
         Coche Toyota=new Coche();
         Furgoneta jeep=new Furgoneta(4,600);
       Toyota.setColor("azul");

       jeep.setColor("negro");
       jeep.setAsientosCuero("si");
        System.out.println(jeep.getdatosgenerales()+jeep.dime_datos_furgo());






    }
}
