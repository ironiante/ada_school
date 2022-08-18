package variables;

/**
 * Existen 8 tipos de datos para variables primitivas en Java:
 * boolean size --> 1 byte
 * byte    size --> 1 byte
 * char    size --> 1 byte
 * short   size --> 2 byte
 * int     size --> 4 byte
 * long    size --> 8 byte
 *
 * float   size --> 4 byte
 * double  size --> 8 byte
 * char    size --> 2 byte
 *
 * string size --> varies -->reference
 * A la hora de guardar cadenas de caracteres ya no usamos un tipo primitivo sino usamos un
 * objeto de la clase String
 */
//_________________________________________________________________________________________________________
public class types {
    public static void main(String[] args) {
       // declaration();
       // initialization();
        others();

    }
//__________________________________________________________________________________________________________
  /**
  * podemos declarar la variable y despues asignarle el valor
  */
  static void declaration(){
     int x; // declaration
     x= 123; // assignment
      System.out.println("my number is :"+x);
  }
  static void initialization (){
      int x = 123;
      System.out.println("my number is :" + x);
  }
  static void others(){
      double y = 3.14F;
      boolean z = true;
      byte a= 1;
      char b= 'c';
      String name = "jirman";
      short c= 123;
      long d=98888888;
      float e= 3.1416f;
      System.out.println(" estos numeros y datos son:" + y + " " + z + " " + name);
  }


}
