package lecture04.section04.ObjectOrientedProgramming;

// Because Animal class has Abstract definitions we use Abstract class.
abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // abstract methods does not have body and let the child class write their own.
    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
