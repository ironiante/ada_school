package code;

/**
 * los constructores son funciones especiales que contienen las clases para permitir la creacion de objetos.
 * pueden recibir datos/ parametros como no ( constructor vacio)
 * se llaman siempre igual que la clase
 * no retornan ningun valor
 * generalmente se utilizan dos tipos vacios y con todos los parametros
 */
public class Alumno {
    // atributos
    int id;
    String nombre;
    String apellido;

// constructor

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    // metodos

    public void mostrarNombre() {
        System.out.println("hola, soy un alumno y se decir mi nombre");
    }


}
