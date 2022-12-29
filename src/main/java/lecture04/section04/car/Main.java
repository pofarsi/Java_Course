package lecture04.section04.car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car porsche = new Car();
        porsche.model = "Carrier";
        System.out.println(bmw.getColor());
        bmw.setColor("Red");
        System.out.println(bmw.getColor());
        bmw.setColor("black");
        System.out.println(bmw.getColor());
    }
}
