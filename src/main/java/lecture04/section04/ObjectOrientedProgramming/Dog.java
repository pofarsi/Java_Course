package lecture04.section04.ObjectOrientedProgramming;

public class  Dog extends Animal{
    private String breed;

    // super means name will be passed in side of parent class;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Because we define method in abstract class of Animal.
    @Override
    public void makeSound() {
        System.out.println("woof woof");

    }
}
