package cimino.vehiculo.cuentaBancaria;

public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();

        cb.CBU="25899999999";
        cb.alias= "miCuenta";
       cb.mostrarDatos();
       System.out.println(cb.obtenerSaldo());
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo());
        cb.depositar(-150);
        System.out.println(cb.obtenerSaldo());
        System.out.println(cb.saldoDisponible(100));
        System.out.println(cb.saldoDisponible(300));
        cb.depositar(1000);
        System.out.println(cb.obtenerSaldo());
       cb.extraer(1500);
        System.out.println(cb.obtenerSaldo());




    }
}
