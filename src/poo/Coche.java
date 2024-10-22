package poo;

public class Coche {
    //encapsulamos datos con private
   private int ruedas, largo, ancho,motor,peso;

     private String color;
     private boolean AsientosCuero;


    //propiedades pre definidas METODO CONSTRUCTOR

    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso=500;
        color="negro";


    }
    //METODOS GETTER



   public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;

    }
    public String getdatosgenerales(){
        return "el color es: "+color+"el peso es: "+peso+"el largo es: "+largo+"el ancho es: "+ancho+
                "el numero de ruedas es: "+ruedas;
    }

    public void setAsientosCuero(String AsientosCuero){
        if (AsientosCuero.equals("si")) {
            this.AsientosCuero = true;
        } else {
            this.AsientosCuero = false;
        }
    }

    public String getAsientos() {
        if ( AsientosCuero == true){
            return "con asientos de cuero";

        }else{
            return "sin asientos de cuero";
        }
    }


    public int getprecio() {
        int precio=10000;

        if (AsientosCuero==true){
            precio=precio+200;
        }
        if (color.equals("negro")==false){
            precio=precio+200;
        }

        return precio;
    }



    public void setColor (String color){
            this.color = color;
        }






}
