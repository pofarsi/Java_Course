package lecture04.section04.oop_basic;

import java.awt.*;

// Reference types are objects that passed by reference, and primitive data types are passed by values.
public class PassByValue {
    public static void main(String[] args) {
        int a = 1;
        int b = incrementValue(a);
        // When we pass "a" that is a copy, so we should use another variable to save a .
        System.out.println(a);
        System.out.println(b);
        System.out.println("*****************");
        // The original value of x and y are here but when we invoke the changingPoint method we mutated the values.
        Point point = new Point(10,20);
        changePoint(point);
        System.out.println(point);
    }

    /* Instead of writing void as return type we should use int and return integer.
    In here the primitive data type are passed by value or copy. */
    static int incrementValue(int value) {
        return value + 1;
    }

    // We mutate the original object.
    static void changePoint(Point point) {
        point.x = 3;
        point.y = 3;

    }
}
