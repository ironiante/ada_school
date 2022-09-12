package internet.aulaInformatica;

import java.util.Scanner;

/**
 * generar un array de enteros de dos dimensiones(pide las dimensiones al usuario) y posteriormente.
 * 2.1 -> genera un metodo que asigne a todas las posiciones de un array bidimensional que le llegara como parametro,un valor entero.
 * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo.
 * 2.2 --> genere un metodo que imprima por pantalla todos los valores de un array bidimensional que se le pase como parametro. imprime por
 * pantalla en forma de filas y columnas usando \t para separar valores.
 * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo.
 * 2.3 genera un metodo que asigne valores aleatorios ( entre 0 y 9) a todas las posiciones de una array bidimensional que le llegara como parametro.
 * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo. 2.2.
 * 2.4 genera un metodo al que le llegue como parametro una array bidimensional y que devuelva la suma de todos sus valores.
 * modifica el metodo main para que llame a este metodo pasadondo el array gnerado anteriormente e imprime por pantalla el valor de la suma de sus
 * valores.
 *
 */
public class Ejercicio2 {
    public static void main(String[] args) {
// declaramos variables y le pedimos al usuario ___________________________
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;
        System.out.println("ingrese el numero de filas: ");
        filas = sc.nextInt();
        System.out.println("ingrese el numero de columnas: ");
        columnas = sc.nextInt();
        // declramos el array________________________________________
        int [][] a = new int[filas][columnas];
        mostrarValores(a);
        asignarValor(a,5);
        asignarAleatorios(a);
        mostrarValores(a);
        System.out.println("------suma de valores_______");
        System.out.println("el valor de la suma es:" + sumaValores(a));
    }

    /**
     * 2.1 -> genera un metodo que asigne a todas las posiciones de un array bidimensional que le llegara como parametro,un valor entero.
     *  * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo.
     */
    public static void asignarValor(int [][]a ,int valor ) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            a[i][j]=valor;
            }

        }

    }
    /**
     * 2.2 --> genere un metodo que imprima por pantalla todos los valores de un array bidimensional que se le pase como parametro. imprime por
     *  * pantalla en forma de filas y columnas usando \t para separar valores.
     *  * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo.
     */
    public static void mostrarValores(int[][] array){
        System.out.println("_____________valores del array___");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
    }
    /**
     * 2.3 genera un metodo que asigne valores aleatorios ( entre 0 y 9) a todas las posiciones de una array bidimensional que le llegara como parametro.
     *  * modifica el metodo main para que el array generado anteriormente cargue con datos a traves de este metodo. 2.2.
     */
     public static void asignarAleatorios(int [][]a){
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {
                 a[i][j] = aleatorio(0,9);

             }

         }
     }
     public static int aleatorio(int min, int max){
         return (int) (Math.random()*(max+1-min)+ min);
     }
/**
 * 2.4 genera un metodo al que le llegue como parametro una array bidimensional y que devuelva la suma de todos sus valores.
 *  * modifica el metodo main para que llame a este metodo pasadondo el array gnerado anteriormente e imprime por pantalla el valor de la suma de sus
 *  * valores.
  */
    public static int sumaValores(int [][] a){
     int r=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                r += a[i][j];

            }
        }

     return r;
    }
    /**
     * genere un metodo al que le llegue como parametro una array bidimensional y que devuelva un array de eneteros
     */


}
