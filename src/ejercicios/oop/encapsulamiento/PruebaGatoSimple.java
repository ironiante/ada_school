package ejercicios.oop.encapsulamiento;

public class PruebaGatoSimple {
    public static void main(String[] args) {
 // instanciar objetos de la clase GatoSimple
 GatoSimple garfiel = new GatoSimple("macho");
        System.out.println("hola gatito");
        garfiel.maulla();
        System.out.println("toma tarta");
        garfiel.come("pescado");
        garfiel.come("carne");

 GatoSimple tom = new GatoSimple("macho");
        System.out.println("tom , toma sopita de verduras");
        tom.come("sopa de verduras");
 GatoSimple lisa = new GatoSimple("hembra");
        System.out.println(" gatitos vamos a ha ver como maullan");
        garfiel.maulla();
        tom.maulla();
        lisa.maulla();
        lisa.peleaCon(tom);
        garfiel.peleaCon(lisa);
        tom.peleaCon(garfiel);


    }
}
