package lecture04.section04.ObjectOrientedProgramming;

/* we use interface when we have more than one implementation, and we can implement more than one interface, Springboot
 Abstract when we have common code that should be used across all child classes, and extend only once. */
public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Max", "Bulldog");
        AnimalInterface cat = new Cat("rubi");
        System.out.println(dog);
        System.out.println(dog.getName() + " " + dog.getBreed());
        dog.makeSound();
        System.out.println("************");
        System.out.println(cat.name());
        cat.makeSound();

    }
}
