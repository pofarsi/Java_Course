package lecture04.section04.oop_basic;

public class PrimitiveAndReferenceTypes {
    public static void main(String[] args) {
        int a = 10 , b = a;
        a = 100;
        System.out.println("a = " + a + " -  b = " + b);

        Person person1 = new Person("Ali");
        Person person2 = new Person("David");

        /* When we print the program in here we get a = 100 - b = 10 in this case the value of a that pass
        in to b is passed by copy. but in reference type if we change the value of variable we are going to
        get different result.*/

        System.out.println("before changing person1 name person1 name is --> " +person1.name +
                " person2 name is --> " + person2.name);

        person1.name = "Max";
        System.out.println("before changing person1 name person1 name is --> " +person1.name +
                " person2 name is --> " + person2.name);

        System.out.println("******************************");
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
