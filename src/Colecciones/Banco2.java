package Colecciones;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Banco2 {
    public static void main(String[] args) {

        Cliente c1=new Cliente("Antoni","0001",50000);
        Cliente c2=new Cliente("Antonieta","0002",1000);
        Cliente c3=new Cliente("Tony","0003",2750000);
        Cliente c4=new Cliente("Antoni","0001",50000);

        Set <Cliente> clientesBanco=new HashSet<>();
        clientesBanco.add(c1);
        clientesBanco.add(c2);
        clientesBanco.add(c3);
        clientesBanco.add(c4);

        for (Cliente cliente:clientesBanco){
            System.out.println(cliente.getNombre()+" "+cliente.getNum_cuenta()+" su saldo: "+cliente.getSaldoEnCuenta());
        }

    }
}
class Cliente{

    public Cliente(String nombre,String num_cuenta, double saldoEnCuenta){
        this.nombre=nombre;
        this.num_cuenta=num_cuenta;
        this.saldoEnCuenta=saldoEnCuenta;


    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setSaldoEnCuenta(double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(num_cuenta, cliente.num_cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num_cuenta);
    }

    private String nombre;
    private String num_cuenta;
    private double saldoEnCuenta;

}