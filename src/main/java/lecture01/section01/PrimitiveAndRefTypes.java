package lecture01.section01;

public class PrimitiveAndRefTypes {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("Alex");
        Person bob = alex;
        System.out.println("Before changing alex");
        System.out.println("alex.name -> " + alex.name +
                "\n" + "bob.name -> " + bob.name + "\n");

        alex.name = "Bob";

        System.out.println("After changing alex");
        System.out.println("alex.name -> " + alex.name +
                "\n" + "bob.name -> " + bob.name + "\n");

        bob.name = "Sasha";

        System.out.println("After changing Bob");
        System.out.println("alex.name -> " + alex.name +
                "\n" + "bob.name -> " + bob.name + "\n");
    }

    static class Person {
        String name;
        Person(String name) {
            this.name= name;
        }
    }
}
