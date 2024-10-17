public class Arrays {
    public static void main(String[] args) {
        //declarar array e imprimir los elementos

       /* int [] numero1a5= new int[5];
        numero1a5 [0]=1;
        numero1a5 [1]=22;
        numero1a5 [2]=78;
        numero1a5 [3]=46;
        numero1a5 [4]=58;*/


        int[] numero1a5={7,54,98,45,22,33,22,43,21};
        int elements= numero1a5.length;

        for (int i = 0; i < elements; i++) {
            System.out.println(numero1a5[i]+" esta en la posicion "+i);

        }




    }
}
