package lecture06.phone_book;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact contact1 = new Contact("John Smith", "555-555-5555", "john@example.com");
        Contact contact2 = new Contact("alex mendez", "555-555-5556", "jane@example.com");

        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);

    }
}
