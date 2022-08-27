package cimino.vehiculo.constructor;

public class Principal {
    // vamos a instacias 3 objetos de la clase cuentaBancaria
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("jirman","dolares","cuenta corriente");
    // ya teniendo el constructor vacio , podemos crear nuevos objetos, sobrecargando el constructor.
        CuentaBancaria cb2= new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria("dolares ","cuenta de ahorros");
        cb.setSaldo(0.0);
        cb.setAlias("jirman");
        cb.setMoneda("pesos");
        cb.setTipo("cuenta de ahorros");


        cb2.mostrarDatos();
        cb.mostrarDatos();
        cb3.mostrarDatos();


    }
}
