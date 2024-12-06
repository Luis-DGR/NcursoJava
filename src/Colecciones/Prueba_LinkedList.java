package Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> paises=new LinkedList<>();
        paises.add("mexico");
        paises.add("españa");
        paises.add("eua");


        LinkedList<String> capital=new LinkedList<>();
        capital.add("cdmx");
        capital.add("madrid");
        capital.add("washintong");



        ListIterator<String> iterA= paises.listIterator();
        ListIterator<String> iterB= capital.listIterator();

        while (iterB.hasNext()){
            if (iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);


    }
}
