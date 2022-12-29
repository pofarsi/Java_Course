package lecture06.phone_book;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public Contact searchByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
}

