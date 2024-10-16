import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
         //decir si somos mayores de edad
        System.out.println("dime tu edad");

        Scanner edadIntro= new Scanner(System.in);

        int edad= edadIntro.nextInt();

        if (edad>17){
            System.out.println("mayor de edad");

        }else {
            System.out.println("menor de edad");
        }


    }
}
