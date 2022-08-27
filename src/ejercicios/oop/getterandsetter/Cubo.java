package ejercicios.oop.getterandsetter;

/**
 * Por ahora,
 * solo nos interesa saber la capacidad máxima y los litros que contiene el cubo en cada
 * momento, así que esos serán los atributos que tendremos en cuenta.
 *
 */
public class Cubo {
    // atributos ////////////////////////////
    int capacidad; // capacidad máxima en litros
    int contenido; // contenido actual en litros

// métodos //////////////////////////////
// constructor
   Cubo (int c) {
       this.capacidad =c;
   }

    public int getCapacidad() {
        return this.capacidad;
    }

    public int getContenido() {
        return this.contenido;
    }
    void setContenido(int litros){
       this.contenido =litros;

    }
// otros metodos/////////////////////////////////////////////////////

void vacia(){
       this.contenido=0;
}

// llena al cubo al maximo de su capacidad//////////////////////////

 void llena(){
       this.contenido = this.capacidad;
 }
// pinta el cubo en la pantalla, se muestra los bornes del cubo con el caracter # y el agua que contine
//con el caracter ~.

void pinta(){

}









}
