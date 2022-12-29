package lecture04.section04.Inheritance;

public class Fish extends Animal {
    private boolean gills;

    public Fish(int size, int weight, String name, boolean gills) {

        super(size, weight, name);
        this.gills = gills;
    }

    public void swallow(){
        System.out.println("Fish.food() Plankton");
        Nourish("Grass");
    }

    private void swallow(String food) {
        swallow();
        super.Nourish(food);
    }
    private void swim() {
        System.out.println("Fish swim!!! ");
    }

    @Override
    public void move() {
        System.out.println("@Override Fish.move() called ");
        swim();
        super.move();
    }
}
