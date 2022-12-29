package lecture09.section09.DataStructures;

import java.util.ArrayList;
import java.util.List;

// Generics used for specify the type of data in list, the tool for that is <>.
public class GenericsDataStructures {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
//        numbers.add("String");
//        numbers.add(new Point(10,20));

        // we can add every thing to Array list
        System.out.println(numbers);

        // Because we use generics and specify the type of data we can use int instead of Object.
        for (int number : numbers) {
            System.out.println(number + ", ");
        }
    }
}
