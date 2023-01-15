package lecture08.section08.GenericsDataStracture.phone;

import java.util.Date;
public class GenericsClasses {
    public static void main(String[] args) {
        Box<Phone> box1 = new Box<>();
//        box1.set("1");
//        box1.set(new Date());
        box1.set(new Phone("Apple"));
        System.out.println(box1.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Alex"));
        System.out.println(box2.get());
    }
}
