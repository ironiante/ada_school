package cimino.vehiculo.Static_;

public class Auto {
    // atributos
    private String patente;
    private String marca;
    private double precio;
    private String color;
    // creamos una variable de clase
    private static double dcto;

    // constructores --> es un metodo que se ejecuta inicialmente y de manera automatica, permite
    // inicializar a todos


    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dcto=10;
    }
    public double precioPromocional(){
        return this.precio- this.precio*Auto.dcto/100;

    }
    public static  void anularDescuentos(){
        Auto.dcto=0;
    }


// metodo toString = nos permite visualizar en la consola el estado del objeto cuando
    // lo mostremos
    @Override
    public String toString() {
        return "Auto{" + "patente='" + patente + '\'' + ", marca='" + marca + '\'' + ", precio=" + precio + ", color='" + color + '\'' +
                '}';
    }
}
