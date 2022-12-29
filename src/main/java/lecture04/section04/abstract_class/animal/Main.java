package lecture04.section04.abstract_class.animal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.fly();
        String stringData = "*************";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s

        }
    }
}

