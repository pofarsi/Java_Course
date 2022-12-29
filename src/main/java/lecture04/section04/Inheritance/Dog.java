package lecture04.section04.Inheritance;

public class Dog extends Animal{
    private int legs;
    private String coat;
    public Dog(int size, int weight, String name, int legs, String coat) {
        super(size, weight, name);
        this.legs = legs;
        this.coat = coat;
    }

    private void run() {
        System.out.println("Dog runs!!! ");
    }

    @Override
    public void move() {
        System.out.println("@Override Dog.move() called ");
        run();
        super.move();
    }

    public void food() {
        System.out.println("Dog.food() meat");
        Nourish("Grass");
    }

    public void water() {
        System.out.println("Dog.water() Fiji water");
        Nourish("Pipe Water");
    }

    private void chew(String food){
        System.out.println("private void chew ");
    }
    @Override
    public void Nourish(String food) {
        System.out.println("@Override Nourish with super key word");
        chew(food);
        super.Nourish(food);
    }
}
