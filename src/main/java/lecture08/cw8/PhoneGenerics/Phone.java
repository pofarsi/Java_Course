package lecture08.cw8.PhoneGenerics;


public class Phone {

    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Generics4Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}