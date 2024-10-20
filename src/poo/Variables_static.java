package poo;

public class Variables_static {
    public static void main(String[] args) {

        ejemplostatic numer1=new ejemplostatic();
        ejemplostatic numer2=new ejemplostatic();
        ejemplostatic numer3=new ejemplostatic();
        ejemplostatic numer4=new ejemplostatic();
        ejemplostatic numer5=new ejemplostatic();
        ejemplostatic numer6=new ejemplostatic();



        System.out.println(numer1.getId1());
        System.out.println(numer2.getId1());
        System.out.println(numer3.getId1());
        System.out.println(numer4.getId1());
        System.out.println(numer5.getId1());
        System.out.println(numer6.getId1());


    }

}
class ejemplostatic{
    //variables
     private int id1;
     private static int idsig=1;



    //metodo constructor
    public ejemplostatic(){
        id1=idsig;
        idsig++;


    }
    //GET


    public int getId1() {
        return id1;
    }
}