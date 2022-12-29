package lecture04.section04.Inheritance;

//Why And When To Use "Inheritance"?
//It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
public class Animal {
    private int size;

    private int weight;

    private String name;

    public Animal(int size, int weight, String name) {
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void move() {
        System.out.println("Animal moving ");
    }

    public void Nourish(String food) {
        System.out.println("Animal Nourish " + food);
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

