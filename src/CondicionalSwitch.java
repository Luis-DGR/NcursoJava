import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        //usando switch calcular area de figura
        System.out.println("elige una opcion: \n: cuadrado \n: circulo ");

        Scanner select= new Scanner(System.in);
         String figuraseleccion= select.nextLine();

         switch (figuraseleccion){
             case "cuadrado":

                 System.out.println("dame la longitud de un lado");

                 Scanner Lado= new Scanner(System.in);
                  int Lado1=Lado.nextInt();
                  int areacuadro=Lado1*Lado1;
                 System.out.println("el area es "+ areacuadro);
                 break;
             case "circulo":
                 System.out.println("dame diametro");
                 Scanner diametro= new Scanner(System.in);
                 int radio=radio.nextInt();
                 double areacirc=Math.pow(radio,2)*Math.PI;
                 System.out.println("el area es "+ areacirc);
                 break;






         }




    }
}
