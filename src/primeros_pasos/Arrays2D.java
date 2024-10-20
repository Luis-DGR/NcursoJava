package primeros_pasos;

public class Arrays2D {
    public static void main(String[] args) {
    //rellenar array de 3*3 e imprimir valores

        int [][] array=new int[3][4];
       for (int prim = 0; prim <array.length ; prim++) {

            for (int seg = 0; seg < 4; seg++) {
                array[prim][seg]=(int) (Math.random()*100);

                System.out.println(array[prim][seg]);

            }












        }



    }
}
