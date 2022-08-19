package cimino.vehiculo.visibilidadObjetos;

public class principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        cb.mostrarDatos();
        cb.establecerAlias("jirman");
        cb.mostrarDatos();
        String a= cb.obtenerAlias();
        System.out.println(a);
    }
}
