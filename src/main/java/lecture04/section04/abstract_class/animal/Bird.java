package lecture04.section04.abstract_class.animal;

public abstract class Bird extends Animal implements CanFly
{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " Bird eating ");
    }

    @Override
    public void breathe() {
        System.out.println("Bird breathing ");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " Bird can fly");
    }
}
