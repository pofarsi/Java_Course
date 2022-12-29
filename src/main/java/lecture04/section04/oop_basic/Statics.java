package lecture04.section04.oop_basic;

import java.util.ArrayList;
import java.util.List;

public class Statics {
    /* The method below should be static if it's not we can not run the program.
    Static could be method or variable it's mean it is belonged to the class it's self,
    it used when we have sheared data across all the objects. */

    public static final String BRAND = "People"; // usually write constant variable in capital characters.

    // For initialising any static fields that we have we use static block.
    static List list;

    static {
        list = new ArrayList();
        list.add("1");
    }

    public static void main(String[] args) {
        Person david = new Person("David");
        Person alex = new Person("Alex");
        Person ali = new Person("Ali");

        /* Because we use static in creatPerson it is shared in all the objects so instead of
         System.out.println(david.createdPerson); we can use: */
        System.out.println("Number of persons are:" + Person.createPerson +
                " name of persons are: " + david.name + ", " + alex.name + ", " + ali.name);
        System.out.println("constant 'People' length is: " + Statics.BRAND.length());
    }

    static class Person {
        static int createPerson = 0;
        //        var name;
        String name;

        Person(String name) {
            this.name = name;
            createPerson++;
        }
    }
}
