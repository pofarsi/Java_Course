package lecture09.section09.DataStructures;

import java.util.ArrayList;
import java.util.List;

// List is the interface. "parent class".
public class ListDataStructure {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Original list --> " + numbers);

        // Remove method
        numbers.remove(0);
        System.out.println("remove item from list --> " +numbers);

        // add method
        numbers.add(1, 9);
        System.out.println("add item to list --> " + numbers);

        // contain method
        System.out.println(numbers.contains(1));
        System.out.println(numbers.contains(9));

        // is empty method
        System.out.println(numbers.isEmpty());

        // size method
        System.out.println(numbers.size());

        // we have lots of methods. use "." --> dot.


        for (Object number : numbers) {
            System.out.println(number + ", ");
        }
        System.out.println();
        // with for each.
        numbers.forEach(System.out::print);

    }
}
