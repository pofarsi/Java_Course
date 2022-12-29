package lecture05.section05.PolymorphismCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(true, "Model");
        System.out.println(car.getName() + " *** " + car.getBrakes() + " *** " + car.startCar() +
                " *** " + car.autoPilot() + " *** " + car.Charging());
        Tesla tesla = new Tesla(true, "Model X");
        System.out.println(tesla.getName() + " *** " + tesla.startCar() + " *** " +
                tesla.autoPilot() + " *** " + tesla.Charging());


    }
}