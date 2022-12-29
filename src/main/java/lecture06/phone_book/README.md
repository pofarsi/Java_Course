# Phone Book
This code includes two Java classes: Contact and PhoneBook.

## Contact
The Contact class represents a single contact with a name, phone number, and email. It has three fields: name, phoneNumber, and email, each of which has corresponding getter and setter methods. The Contact class also has a constructor that allows you to create a new Contact object with the specified name, phone number, and email.

## PhoneBook
The PhoneBook class represents a phone book, which is a collection of Contact objects. It has a single field, contacts, which is a list of Contact objects. The PhoneBook class has three methods:

addContact(Contact contact): adds the specified Contact object to the phone book.
deleteContact(Contact contact): removes the specified Contact object from the phone book.
searchByName(String name): searches the phone book for a Contact object with the specified name and returns it if found, or null if not found.
You can use these methods to add, delete, and search for contacts in the phone book