package primeros_pasos;

public class ClaseString {
    public static void main(String[] args) {

        String nombre="Luis David Garcia Rivera";
        System.out.println(nombre);

        //contar letras
        int numeroletras=nombre.length() -3;
        System.out.println("mi nombre tiene " + numeroletras + " letras"  );

        //dar primera letra
        System.out.println("la primer letra es " + nombre.charAt(0));

        //ultima letra
        int posicionUltima= nombre.length() - 1;
        System.out.println("la ultima letra es "+ nombre.charAt(posicionUltima));

        //devuelve segundo nombre
        System.out.println("mi segundo nombre es "+ nombre.substring(5,10));











    }



}
