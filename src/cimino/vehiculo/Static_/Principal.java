package cimino.vehiculo.Static_;

public class Principal {
    public static void main(String[] args) {

  Auto a1 = new Auto("xyz123","Tiaf",31230,"Azul") ;
  Auto a2 = new Auto("xyz234","dorf",43145,"Azul") ;
  Auto a3 = new Auto("xyz345","geopot",63161,"Azul") ;
  Auto a4 = new Auto("xyz456","Tiaf",34136,"Azul") ;

        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());
        Auto.anularDescuentos();
        System.out.println(a1.precioPromocional());
        System.out.println(a2.precioPromocional());
        System.out.println(a3.precioPromocional());
        System.out.println(a4.precioPromocional());

    }
}
