package lecture09.section09.DataStructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        // we use Wrapper Classes
        HashSet<String> cars = new HashSet<String>();
        cars.add("Benz");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        System.out.println();
        // we have other methods like clear, remove etc. we can loop in hash set
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
        System.out.println();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

    /* In Java, Set is an interface that extends the Collection interface.
     It is an unordered collection of elements that do not allow duplicate values.
     HashSet is a class that implements the Set interface.
     It is a collection that uses a hash table for storage and provides
     fast performance for adding, removing, and checking the presence of elements.
     Here is an example of how you can use a Set and a HashSet in Java: */

        Set<String> set = new HashSet<>();

        // Add elements to the Set
        set.add("apple");
        set.add("banana");
        set.add("cherry");

        // Iterate over the elements in the Set
        for (String s : set) {
            System.out.println(s);
        }
        /* The output of this code would be the elements of the Set in some order,
         but not necessarily the order in which they were added.
         It's also worth noting that HashSet is just one implementation of the Set interface.
         There are other implementations of Set in the Java Collection API,
         such as LinkedHashSet and TreeSet, that have different characteristics and performance trade-offs. */
    }
}


