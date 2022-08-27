package cimino.vehiculo.constructor;

public class CuentaBancaria {
    // atributos
    private String Cbu;
    private String alias;
    private Double saldo;
    private  String moneda;
    private  String tipo;
    // constructor

    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.Cbu= generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    public CuentaBancaria( String moneda, String tipo) {
        this("Alias.por.Defecto",moneda,tipo); // una de la funciones del this
    }
    /**
     * sobre carga de constructores, se hace de uno otro, para que
     * no pase por paramatros los atributos
     *
     */
    public CuentaBancaria(){ // constructor vacio

    }

    // metodos

    private String generarCBU(){
        return "123456";
    }
    public void mostrarDatos(){
        System.out.println(Cbu + " "+ alias + " " + saldo + " " + moneda + " " + tipo);
    }

    public void setAlias(String alias) {
        if (alias !=null){
            this.alias = alias;
        }
    }
    public void setMoneda(String moneda) {
        if (moneda !=null){
            this.moneda = moneda;
        }

    }

    public String getCbu() {
        return Cbu;
    }

    public void setCbu(String cbu) {
        Cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }



    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo !=null){
            this.saldo = saldo;
        }

    }

    public String getMoneda() {
        return moneda;
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo !=null){
            this.tipo = tipo;
        }

    }
}
