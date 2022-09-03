package plataforma.arrays.Recorrer1;

import java.util.Scanner;

public class Arreglo_String {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("posiciones del arreglo?");
        int cant = entry.nextInt();
        // instanciamos el arreglo de tipo cadena
        String [] arreglo = new String[cant];
        // creamos el ciclo for para  iterar cada una de las posiciones del arreglo y solicitar un dato para
        // cada una de ellas
        for (int i = 0; i < arreglo.length ; i++) { // nos permite iterar desde cero hasta el tamaño de nuestro arreglo
            System.out.println(" ingrese un valor ");
            String nuevo = entry.next();
            // lo agregamos al arreglo para llenarlo
            arreglo [i] = nuevo;
        }
        System.out.println("___________________________________________________________________________________");
        // utilizamos otro para ver si estamos guardando de verdad.
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("posicion " + i +": " + arreglo[i]);
            
        }
    }
}
