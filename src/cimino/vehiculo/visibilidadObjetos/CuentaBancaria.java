package cimino.vehiculo.visibilidadObjetos;

public class CuentaBancaria {
    // atributos

    private String CBU;
    private String alias;
    private double saldo;

    // metodos

    public void mostrarDatos(){
        System.out.println(CBU + " "+ alias + " " + saldo);
    }
    public double obtenerSaldo(){
        return saldo;
    }
    public void establecerAlias(String nuevoAlias){
        if (nuevoAlias !=null);
        alias = nuevoAlias;
    }
    public void establecerCBU(String nuevoCBU){
        if (nuevoCBU !=null){
            CBU= nuevoCBU;
        }
    }
    public void depositar (double monto){
        if (monto >0){
            saldo +=monto;
        }else {
            System.out.println(" ingreso invalido");
        }
    }
   private boolean saldoDisponible (double monto){
        return saldo >= monto;

    }
    void extraer(double monto){
        if (saldoDisponible(monto)){
            saldo -= monto;
        } else
            System.out.println(" saldo insuficiente");

    }
    String obtenerAlias(){
        return alias;
    }
}
