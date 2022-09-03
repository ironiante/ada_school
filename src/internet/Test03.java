package internet;

public class Test03 {
    public static void main(String[] args) {
        // crear un array
        int [][] b1= new int[3][4];
        // crear array 2
        int [][] array2= {{1,2,3,4},{1,2,3,4}};
        // vamos a recorrer el array se necesitan dos for
        for (int i = 0; i < b1.length; i++) {
            for (int j = 0; j < b1[i].length; j++) {
                System.out.print("voy por la fila " + i + " y la columna " + j);
                System.out.println("-------> y el valor es: " + b1[i][j]);

            }

        }
        System.out.println("-----------");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");

            }
            System.out.println();

        }

    }


}
