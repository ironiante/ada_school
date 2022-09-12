package plataforma.clase2;

public interface Animal {
    public void animalSound(); // interface method ( does not have a body)
    public void sleep(); // interface method ( does not have a body)
}
// pig " implements" the animal interface
class pig implements Animal{
    public void animalSound(){
        // the body of animalSound () is provided here
        System.out.println(" the pig says: wee weee");
    }
    public  void sleep (){
        // the body of sleep () is provided here
        System.out.println("zzzz");
     }
}
