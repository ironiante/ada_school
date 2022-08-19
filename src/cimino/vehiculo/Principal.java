package cimino.vehiculo;

public class Principal {
    public static void main(String[] args) {
        // crear un objeto de la clase auto
        Auto a = new Auto();
        System.out.println(a.patente + " "+ a.color + " "+ a.conAire + " " + a.kms);
        a.patente = "ABC123";
        a.color = "amarillo";
        a.kms = 500;
        a.conAire= true;
        System.out.println(a.patente + " "+ a.color + " "+ a.conAire + " " + a.kms);

        Auto a2 = new Auto();
        a2.patente = "DEF345";
        a2.color = "Azul";
        a2.kms = 1000;
        a2.conAire= true;
        System.out.println(a2.patente + " "+ a2.color + " "+ a2.conAire + " " + a2.kms);

    }
}
