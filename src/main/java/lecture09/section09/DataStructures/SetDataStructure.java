package lecture09.section09.DataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set does not have duplicate, and it is not in order. usually.
public class SetDataStructure {
    public static void main(String[] args) {
        // push Ctrl and click on Set we see we have so many implementation.
        // LinkHashset is for sort.
        Set<Character> character = new HashSet<>();
        character.add('A');
        character.add('z');
        character.add('D');
        character.add('C');
        character.add('B');
        character.add('B');

        Iterator<Character> iterator = character.iterator();

        while (iterator.hasNext()) {
            Character character2 = iterator.next();
            System.out.println(character2);
        }
        System.out.println("**************");

        for (char character1 : character) {
            System.out.println(character1);
        }
    }
}
