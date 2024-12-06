package Colecciones;

import java.util.TreeSet;

public class TreeSet_prueba {
    public static void main(String[] args) {
        TreeSet<String> ordenPers=new TreeSet<>();
        ordenPers.add("bbbbb");
        ordenPers.add("aaaaaa");
        ordenPers.add("ddddd");
        ordenPers.add("ccccc");
        for (String m:ordenPers){
            System.out.println(m);
        }
    }
}


