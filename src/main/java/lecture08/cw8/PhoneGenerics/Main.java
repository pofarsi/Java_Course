package lecture08.cw8.PhoneGenerics;

public class Main {
    public static void main(String[] args) {

        Box<Phone> box = new Box<>();
        box.set(new Phone("Apple"));
        System.out.println(box.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Tim Cook"));
        System.out.println(box2.get());


    }
}



