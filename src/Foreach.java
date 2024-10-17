public class Foreach {
    public static void main(String[] args) {
        //crea una matriz que se llena con numeros aleatorios e imprime esos nimeros y su possicion
        int[] numeros=new int[50];
        for (int i = 0; i <numeros.length; i++) {
            numeros[i]=(int) (Math.random()*100);

        }
        for (int l:numeros){
            System.out.print(" "+l);
        }




    }
}
