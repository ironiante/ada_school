package plataforma.Bucles.Ciclo_for;

import java.util.Scanner;

public class _cicloFor {
    /**
     * for(inicializacion;condicion; aumento o decremento{
     *     instrucciones
     * }
     */
    // primer ejemplo --> imprime los numeros del 1 hasta el 10
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

        }
        for (int j = 10; j >1 ; j--) { // ejemplo 2
            System.out.println(j);

        }
        //ejemplo 3 pedir por consola
        Scanner entry = new Scanner(System.in);
        int counter = 0;
        System.out.println("enter a number ");
        counter= entry.nextInt();
        for (int k = 1; k <=counter; k++) {
            System.out.println(k);

        }
        //ejemplo 4 ---> numeros pares; en incremento se coloca i+=2

    }

}
