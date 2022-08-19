package cimino.vehiculo.cuentaBancaria;

public class CuentaBancaria {
    // atributos
    String CBU;
    String alias;
    double saldo;
    // metodos
    void mostrarDatos(){
        System.out.println(CBU + " "+ alias + " " + saldo);
    }
    double obtenerSaldo(){
        return saldo;
    }
    void depositar (double monto){
        if (monto >0){
            saldo +=monto;
        }else {
            System.out.println(" ingreso invalido");
        }
    }
    boolean saldoDisponible (double monto){
        return saldo >= monto;

    }
    void extraer(double monto){
        if (saldoDisponible(monto)){
            saldo -= monto;
        } else
            System.out.println(" saldo insuficiente");

    }

}

