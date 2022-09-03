package internet.aulaInformatica;

import java.util.Scanner;

/**
 * realizar un programa que realice las siguientes acciones:
 * - pida al usuario un numero y lo guarde en una variable n. el usuario introducira un numero entero positivo
 * (no hace falta coprobarlo).
 * - genere un array bidimensional de char, de dimensiones nxn y que posteriormente rellene la diagonal principal
 * con el caracter A y el resto con el caracter *
 * - imprima por pantalla a traves de un metodo al que le llegara como parametro al array generado anteriormente
 * anteriormente, el contenido del array en filas y columnas.
 * - repite estas acciones mientras el usuario introduzca un numero mayor.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
  // declarar variables
  Scanner sc = new Scanner(System.in);
  int n;
  char [][]a;
  // realizamos el menu
  do {
      System.out.println("introduzca un numero: ");
      n = sc.nextInt();
      if (n>0){
  // inicializamos el array
     a = new char[n][n] ;
  // utlizamos los metodos
     rellenarArray(a);
     mostrarArray(a);
      }
  } while (n>0);
        System.out.println("adios!!!");
    }
  public static void rellenarArray(char [][] a) {
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              if (i==j){
                  a[i][j]='A';
              }else {
                  a[i][j]='*';
              }


          }

      }
  }
  public static void mostrarArray(char[][] a){
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              System.out.print(a[i] [j] + " "); // mostrar el contenido que tenga

          }
          System.out.println();

      }
  }

}
