package plataforma.arrays.clase1sep;

public class ClassFor {
    public static void main(String[] args) {
        // declarar el array
        String[][] numbers=new String[2][3];
        System.out.println(numbers[0].length);
        int count=0;

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = String.valueOf(count);
                System.out.println(numbers[i][j]+ " ");

            }
            System.out.println();

        }
    }
}
