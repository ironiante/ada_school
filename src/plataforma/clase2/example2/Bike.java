package plataforma.clase2.example2;

public class Bike implements BikeInterface {
    private final String brand;
    private final String size;
    private final String type;
    private String color;

    public Bike(String brand, String size, String type, String color) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void move() {
        System.out.println(" it is moving  ");
    }

    @Override
    public void brake() {
        System.out.println("it is breaking ");
    }

    @Override
    public void start() {
        System.out.println("it is starting ");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void jump() {
        System.out.println(" it is jumping ");
    }
}
