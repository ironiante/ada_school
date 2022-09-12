package plataforma.clase2;

public class Bicycle {
    private final String serial;
    private final String brand;
    private final int size;

    public Bicycle(String serial, String brand, int size) {
        this.serial = serial;
        this.brand = brand;
        this.size = size;
    }

    public String getSerial() {
        return serial;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}
