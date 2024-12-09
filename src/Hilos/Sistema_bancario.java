package Hilos;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;


import java.util.concurrent.locks.ReentrantLock;

public class Sistema_bancario {
    public static void main(String[] args) {
    Banco banquito=new Banco();
        for (int i = 0; i <100 ; i++) {
            EjecucionTransfer r=new EjecucionTransfer(banquito,i,2000);
            Thread t=new Thread(r);
            t.start();
        }


    }
}
class Banco{

    public Banco(){
        cuentas=new double[100];
        for (int i = 0; i < cuentas.length ; i++) {

            cuentas[i]=2000;



        }
        saldoSufi=cierreBanco.newCondition();
    }
    //añadimos synchronixed*********************!!!!!!!!
public synchronized void transferencia(int cuentaOrigen, int cuentaDestino,double cantidad) throws InterruptedException {

      //  cierreBanco.lock();

   // try {


       while (cuentas[cuentaOrigen] < cantidad) {

        //   saldoSufi.await();
           wait();
        }
        System.out.println(Thread.currentThread());
        cuentas[cuentaOrigen] -= cantidad;
        System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
        cuentas[cuentaDestino] += cantidad;
        System.out.printf(" saldo total: %10.2f%n", getSaldoTotal());

       // saldoSufi.signalAll();
    notifyAll();

   // }finally {
     //   cierreBanco.unlock();
   // }
}
public double getSaldoTotal(){
        double suma_cuentas=0;
        for (double a: cuentas){
            suma_cuentas+=a;

        }
        return suma_cuentas;
}



    private final double[] cuentas;
   private Lock cierreBanco=new ReentrantLock();
   private Condition saldoSufi;
}
class EjecucionTransfer implements Runnable{

    public EjecucionTransfer(Banco b,int de, double max){
        banco=b;
        deLaCuenta=de;
        cantidadMax=max;

    }
    @Override
    public void run() {
        while (true){
            int paraLaCuenta=(int)(100*Math.random());
            double cantidad=cantidadMax*Math.random();
            try {
                banco.transferencia(deLaCuenta,paraLaCuenta,cantidad);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try{
              Thread.sleep((int)(Math.random()*10));
          }
          catch (InterruptedException e){

          }

        }


    }
    private Banco banco;
    private int deLaCuenta;
    private double cantidadMax;
}