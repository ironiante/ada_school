package internet;

public class Test03 {
    public static void main(String[] args) {
        // crear un array
        int [][] b1= new int[3][4];
        // vamos a recorrer el array se necesitan dos for
        for (int i = 0; i < b1.length; i++) {
            for (int j = 0; j < b1[i].length; j++) {
                System.out.println("voy por la fila " + i + " y la columna " + j);

            }

        }

    }


}
