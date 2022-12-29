package lecture05.section05.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Tina");
        person.setLastName("Tehran");
        person.setAge(15);
        System.out.println("First name= " + person.getFirstName());
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

    }
}
