package lecture04.cw04;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Person> people;

    public PhoneBook() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person getPerson(int index) {
        return people.get(index);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public void removePerson(int index) {
        people.remove(index);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public int size() {
        return people.size();
    }

    public boolean contains(Person person) {
        return people.contains(person);
    }

    public Person getPersonByPhoneNumber(String phoneNumber) {
        for (Person person : people) {
            if (person.getPhoneNumber().equals(phoneNumber)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}



