package cimino.vehiculo.constructor;

public class Principal {
    // vamos a instacias 3 objetos de la clase cuentaBancaria
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("jirman","dolares","cuenta corriente");

        cb.setSaldo(1200.0);
        cb.setAlias("jirman");
        cb.setMoneda("pesos");
        cb.setTipo("cuenta de ahorros");



        cb.mostrarDatos();


    }
}
