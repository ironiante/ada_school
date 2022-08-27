package plataforma.metodosFunciones_3;

/**
 * Para la clase String al ser sus variables realmente instancias de objeto, nos sirven de referencia para
 * dar una introducción a la ejecución de métodos de objeto, codificados dentro de una clase, para hacer uso
 * de estos métodos si no han sido codificados como static entonces primero debemos crear una variable de tipo
 * objeto de la clase que estemos revisando en este caso de tipo String y luego haremos uso de la nomenclatura
 * de punto para invocar los métodos a los que tiene acceso, vamos a ver algunos ejemplos:
 * Primero declaramos una variable objeto de la clase String:
 */


  public class MetodosString {
  /**    String name = "someone";
 * name.indexOf('o'); // Metodo para retornar la posición o indice del caracter pasado por argumento si lo encuentra
 * name.charAt(2); // Metodo para retornar el caracter indicado como indice
 * name.compareTo("another"); // Metodo para comparar la cadena de la variable con la cadena pasada por argumento y retorna true o false segun corresponda
 * name.trim(); // Metodo sin argumentos pero que retorna la misma cadena sin espacios ni al inicio ni al fin
 * name.toUpperCase(); // Metodo que retorna la misma cadena convertida toda a mayuscula
 * name.toLowerCase(); // Metodo que retorna la misma cadena convertida toda a minuscula
 * name.replace('e', 'i'); // Metodo que busca la o las coincidencias del primer caracter pasado por arugumento y los remplaza por el caracter pasado como segundo argumento
 */
  public static void main(String[] args) {
      String  name = "jirman";
      int pos = name.indexOf("r");
      char retornarposision = name.charAt(5);

      System.out.println("la posicion es"+ " " +  pos);
      System.out.println("Metodo para retornar el caracter indicado como indice" + " " + retornarposision );
  }



}
