package ejercicios.oop.encapsulamiento;

public class GatoSimple {
    // atributos
    String color,raza,sexo;
    int edad;
    double peso;

    // metodos//////////////////////////////////////////////////////////////////
    // constructor
    GatoSimple (String s){
        this.sexo = s;
    }
    // getter = obtener
    String getSexo(){
        return this.sexo;
    }
    void maulla(){
        System.out.println("miauu");
    }
    void ronronea() {
        System.out.println("mrrrr");
    }
    void come (String comida){
        if (comida.equals("pescado")){
            System.out.println(" gracias");

        }else {
            System.out.println(" lo siento yo solo como pescado");
        }

    }
   void peleaCon(GatoSimple contrincante){            // pasar por parametro un objeto
   }
}


