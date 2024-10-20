package primeros_pasos;

public class ClaseMath {
    public static void main(String[] args) {
        //operaciones con Math
        double x= 5.27;
        int y=5;
       double Raiz;
       float Potencia;
       int redondeo;
       float seno;
       float coseno;
       float tan;



     Raiz= Math.sqrt(x);
        System.out.println(Raiz);

      Potencia= (float)Math.pow(x,y);
        System.out.println(Potencia);

        //refindicion
        redondeo= (int)Math.round(x);
        System.out.println(redondeo);

        seno= (float)Math.sin(y);
        System.out.println(seno);

        coseno= (float) Math.cos(x);
        System.out.println(coseno);

        tan= (float) Math.tan(y);
        System.out.println(tan);
        
                    

    }

}
