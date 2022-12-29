package lecture04.section04.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(5,4,"Animal");

        Dog dog = new Dog(2,4,"Jessi",4, "Silky");
        Fish fish = new Fish(1,1,"Fish",true);
        dog.move();
        dog.food();
        dog.water();
        fish.swallow();
        fish.move();
    }
}
