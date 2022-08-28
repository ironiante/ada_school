package plataforma.javaoperators.arithmeticOperators;

public class Operators {
    public static void main(String[] args) {
    Operators op=new Operators();
        System.out.println(op.addition(1,2));
        System.out.println(op.subtraction(1,2));
        System.out.println(op.multiplication(1,2));
        System.out.println(op.division(1,2));
        System.out.println(op.modulus(1,2));
        System.out.println(op.increment(1));
        System.out.println(op.decrement(1));


    }
    //Adds together two values
     int addition (int x , int y){
        int add = x+y;
        return add;
     }
     //Subtracts one value from another
     int subtraction (int x, int y){
        int sub = x-y;
        return sub;
     }
     //Multiplies two values
    int multiplication (int x, int y){
        int mult= x*y;
        return mult;
    }
    //Divides one value by another
    int division (int x , int y){
        int div= x/y;
        return div;
    }
    //Returns the division remainder , retorna el resto
    int modulus(int x, int y){
        int mod=x%y;
        return mod;
    }
    //Increases the value of a variable by 1
    int increment (int x){
        int inc = ++x;
        return inc;

    }
    //Decreases the value of a variable by 1
    int decrement (int x){
        int decr = --x;
        return decr;
    }
}
