package plataforma.Bucles;

import java.util.Scanner;

public class Definition {
    /**
     * Son bloques o sentencias de codigo que se repiten o iteran de forma definida o indefinida, las sentencias
     * de bucle deben tener una condición que controle la cantidad de repeticiones, tenemos en Java:
     * 1. while
     * 2. do while
     * 3. for
     * 4.for each
     */
    //_____________________________________________________________________________________________________
    /**
     *  1. while --> mientras --> es parecido a un if
     *  Evalua primero la condición y si es verdadera ingresa a ejecutar las instrucciones de codigo en su interior, mas
     *  si es falsa nunca ejecuta algo en su interior, es importante que en su interior exista una logica que modifique la
     *  condición para que se convierta en falsa en alguna iteración para evitar bloque infinito.
     *                      while ( condicion ) {
     *                          instrucciones;
     *                      }
     */
     // ejemplo: numeros del 1 al 10
    /**
     * creamos una variable i e inicializamos en 1 ;   i=1
     * mientras 1 sea menor igual a 10             ;  i<=10
     * imprimimos                                  ;  sout (i)
     * toca que la condicion deje de ser verdadera ; i= i+1 o i++
     */
    public static void main(String[] args) {

        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        // de forma descendente
        int j = 10;
        while (j>=1){
            System.out.println(j);
            j--;
        }
        // programa que le pide al usuario
        Scanner entry = new Scanner(System.in);
        int K=1 ,contador;
        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = entry.nextInt();
        while (K <=contador){
            System.out.println(K);
            K++; // aca se coloca el aumento que se quiera i+=2;
        }
        int number = 1;

        while (number < 5) {
            System.out.println("Hello");
            number++;
        }
//___________________________________________________________________________________________________________________
        //2. do while:
        /**
         * Permite la ejecución al menos una vez del bloque y luego si evalua la condición, si es verdadera continua la ejecución
         * de las instrucciones de codigo en su interior, mas si es falsa salse del bucle, es importante que en su interior exista
         * una logica que modifique la condición para que se convierta en falsa en alguna iteración para evitar bloque infinito.
         */
        int number2 = 1;

        do {
            System.out.println("Hello");
            number++;
        } while (number2 < 5); // condicion

    }


}
