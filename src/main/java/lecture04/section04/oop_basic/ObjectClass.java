package lecture04.section04.oop_basic;

import java.awt.*;
import java.util.Arrays;

// Object class is the root of every other class.
public class ObjectClass {
    public static void main(String[] args) {
        Object name = "Alex";
        Object[] arrayNumber = {1,2,3,4};
        Object point = new Point();
        System.out.println("Name: " + name +" _ array: " + Arrays.toString(arrayNumber));
    }
}
