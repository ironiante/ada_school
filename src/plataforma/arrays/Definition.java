package plataforma.arrays;

public class Definition {
    /**
     * data structures -- > estructura de datos
     *También conocido como arreglo o matriz, es una colección de valores de un mismo tipo, guardados en un
     * objeto que hace las veces de contenedor:
     * El array una estructura de datos que identifica sus elementos con índices comenzando desde cero hasta su longitud -1.
     * Pueden ser de tipo primitivo, de objetos predefinidos en la API de Java u objetos definidos por el desarrollador.
     */
    /**
     * estructura --> 3 partes:
     * 1.tipo de dato y dimensiones
     * 2. nombre de la variable.
     * 3. tamaño del array
     * es como crear un objeto
     */
    public static void main(String[] args) {
        //________________________________________________________________
        // declarar e inicializar en dos pasos.
        int [] array = new int[3];
        array[0]=3;
        array[1]=2;
        array[2]=1;
        //________________________________________________________________
        int [] array2= {3,2,1}; // declara e inicializa en 1 paso.
        //_______________________________________________________________
        // Array bidimensional
        /**
         * Es un array que almacena otro array.
         * Para agregar mas de una dimensión añadimos otro par de corchetes cuadrados [][].
         * Se puede comparar con una tabla con filas (Primer array) y columnas (Segundo array).
         */
        // Bidimensional en dos pasos

        int[][] numbers = new int[2][3];
        numbers[0][0] = 2;
        numbers[0][1] = 4;
        numbers[0][2] = 7;
        numbers[1][0] = 1;
        numbers[1][1] = 9;
        numbers[1][2] = 12;
        // Bidimensional en un paso

        int[][] numbers2 = {{2,4,7},{1,9,12}};


    }
}
