package primeros_pasos;

public class Array2dconforeach {
    public static void main(String[] args) {

        int [][] array=new int[3][4];


        for (int[] z:array) {
            for (int x : z) {
                System.out.println(x = (int) (Math.random() * 100));
            }
        }


    }
}
