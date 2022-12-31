package lecture04.cw04;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Add some people to the phone book
        Person person1 = new Person("John", "123-456-7890");
        Person person2 = new Person("Jane", "234-567-8901");
        Person person3 = new Person("Bob", "345-678-9012");
        phoneBook.addPerson(person1);
        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);

        // Check if the phone book is empty
        System.out.println("Is the phone book empty? " + phoneBook.isEmpty());

        // Get the size of the phone book
        System.out.println("Size of the phone book: " + phoneBook.size());

        // Check if a person is in the phone book
        System.out.println("Is John in the phone book? " + phoneBook.contains(person1));

        // Get a person by their name
        Person person = phoneBook.getPersonByName("Jane");
        System.out.println("Jane's phone number: " + person.getPhoneNumber());

        // Get a person by their phone number
        person = phoneBook.getPersonByPhoneNumber("345-678-9012");
        System.out.println("Person with phone number 345-678-9012: " + person.getName());

        // Remove a person from the phone book
        phoneBook.removePerson(person2);
        System.out.println("Size of the phone book after removing a person: " + phoneBook.size());
    }
}