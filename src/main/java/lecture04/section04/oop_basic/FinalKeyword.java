package lecture04.section04.oop_basic;

import java.awt.*;

// The final key word doesn't let any one change the value of variable, It also works for classes and methods.
public class FinalKeyword {
    public static void main(String[] args) {
        final var percent = 100;
        // percent = 2090;

        /* If we use final for an object we can not reassign the object, but we can change it.
        (we can not create an object from it or in another word it can not be "new") */

        final Point point = new Point(1,2);
//        point =new Point(12,20);
        System.out.println(point.x + " " + point.y);
        System.out.println("******************");
        point.x = 200;
        point.y = 300;
        System.out.println(point.x + " " + point.y);
    }
//    transient	Attributes and methods are skipped when serializing the object containing them
//    synchronized	Methods can only be accessed by one thread at a time
//    volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"
}
