package primeros_pasos;

import java.util.Scanner;

public class JuegobucleWhile {
    public static void main(String[] args) {

        int numeroAleatorio=(int)(Math.random()*100);

        Scanner numIngresado= new Scanner(System.in);
        int numero=0;
        int intentos=0;
        int intentosRestantes=10;

        while (numero!=numeroAleatorio && intentosRestantes>0){
            System.out.println("te quedan "+intentosRestantes+" intentos");
            System.out.println("dame el numero");
          numero=numIngresado.nextInt();
          intentos++;
          intentosRestantes--;

            if (numero>numeroAleatorio){
                System.out.println("el numero es demasiado grande");

            } else if (numero<numeroAleatorio) {
                System.out.println("es demasiado chico");
            }

        }
       if (intentosRestantes>0){
           System.out.println("correcto!!!!");
       }else {
           System.out.println("eres una mierda perdiste");
       }
        System.out.println("tuviste "+intentos+" intentos");
    }
}
