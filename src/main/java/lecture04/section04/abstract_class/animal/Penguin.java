package lecture04.section04.abstract_class.animal;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin Can not fly !!!! ");
    }
}
