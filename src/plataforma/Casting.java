package plataforma;

public class Casting {
    /**
     * casting es el proceso de convertir un tipo de dato a otro tipo de dato, existen 2 tipos:
     * casting implicito --> Este se da cuando de forma automática se hace la conversión de un tipo
     * de dato de menor rango a un tipo de dato de mayor rango, por ejemplo cuando en una variable de
     * tipo double queremos guardar un valor de una variable de tipo int
     *
     * casting explicito: no ocurre de forma automatica
     */
    public static void main(String[] args) {
        int entero=5;
        double doble = entero; // casting implicito ya que int es de menor capacidad o rango que double.
        double doble2 = 3.1416;
        int entero2 = (int) doble2;// casteo explicito donde se debe  escribir el tipo de dato de la variable que recibe
    }
}
