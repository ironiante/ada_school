package plataforma.arrays.ejemploMatrices;

import java.util.Scanner;

public class EjemploMatrices {
 // la palabra static para poderla utlilizar dentro del main o dentro de otros metodos, se declara null porque
 // necesitamos que el tamaño no lo de el usuario
    // objeto de tipo scanner
    static int [][] matriz1 = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }
    // creamos un metodo para definir el tamaño de la matriz
    public static int [] [] definirtamano( int [][] x){ // por parametro recibe y le colocamos x
        System.out.println(" ingrese el tamaño de la matriz filas&columnas");
        String datosIngresados=sc.next();
        String [] datos = datosIngresados.split("%"); //para separar los datos, para que en el vector se almacenes las filas y las columnas
    // creamos las variables de tipo entero
        int filas = Integer.parseInt(datos [0]);// lo castiamos
        int columnas = Integer.parseInt(datos [1]);
    // inicializamos la matriz
        x=new int[filas][columnas];
        return x;

    }
}
