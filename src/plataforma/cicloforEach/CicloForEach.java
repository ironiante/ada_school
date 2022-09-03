package plataforma.cicloforEach;

public class CicloForEach {
/**
 * Es un ciclo for mejorado donde nos despreocupamos por la condicion de iteración y la variable de control y lo que hacemos es
 * declarar una variable del tipo de array luego : array a recorrer para luego usar esa variable, es muy util para recorrer un
 * array y operara con sus valores, no para modificar los valores del arreglo.
  */
public static void main(String[] args) {
    int[][] numbers = new int[2][3];
    numbers[0][0] = 2;
    numbers[0][1] = 4;
    numbers[0][2] = 7;
    numbers[1][0] = 1;
    numbers[1][1] = 9;
    numbers[1][2] = 12;

    for (int[] is : numbers) {
        for (int is2 : is) {
            System.out.print(is2 + " ");
        }
        System.out.println();
    }

// No cambia ningun elemento del array bidimensional, por eso for each es util pero para reccorrer el array y operar con sus resultados

    for (int[] is : numbers) {
        for (int is2 : is) {
            is2 = 3;
        }
    }

    System.out.println();

// Imprime el mismo array

    for (int[] is : numbers) {
        for (int is2 : is) {
            System.out.print(is2 + " ");
        }
        System.out.println();
    }

}
}
