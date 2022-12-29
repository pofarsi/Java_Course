package lecture04.section04.ObjectOrientedProgramming;

// instead of extend we implement interface.
public class Cat implements AnimalInterface{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("miaow");
    }

    @Override
    public String name() {
        return "rubi";
    }


}
