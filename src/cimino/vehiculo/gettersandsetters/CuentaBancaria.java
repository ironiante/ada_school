package cimino.vehiculo.gettersandsetters;
/**
 * Al colocarles visibilidad privada a los atributos de una clase, aparece la necesidad de
 * poder (o no) consultar o establecer nuevos valores desde otra clase. Veamos que son y cómo
 * definir GETTERS y SETTERS.
 * get = obtener si retorna un valor
 * set = establecer , siempre tiene que tener una validacion
 */
public class CuentaBancaria {
    // atributos
    private String CBU;
    private String alias;
    private double saldo;

    // metodos

    public void mostrarDatos(){
        System.out.println(CBU + " "+ alias + " " + saldo);
    }
    public double getSaldo(){
        return saldo;
    }
    String getAliasAlias() {
        return alias;
    }

    public void setAlias(String nuevoAlias){
        if (nuevoAlias !=null);
       this.alias = nuevoAlias;
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

    }

