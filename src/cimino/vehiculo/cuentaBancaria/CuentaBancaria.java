package cimino.vehiculo.cuentaBancaria;
/**
 * Al colocarles visibilidad privada a los atributos de una clase, aparece la necesidad de
 * poder (o no) consultar o establecer nuevos valores desde otra clase. Veamos que son y cómo
 * definir GETTERS y SETTERS.
 * get = obtener
 * set =
 */
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

