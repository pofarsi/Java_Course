package lecture08.section08.GenericsDataStracture;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {
        // List class without specifying the type of variable it can get everything.
//        List numbers = new ArrayList();
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
//        numbers.add("2");

        for (Object number : numbers) {
            System.out.println(number);

            /* In print method below we cast number to String and Integer but when we run it we get
             ClassCastException.
             When we try cast 1 to String we get exception and when we want to cast "2" to Integer we get
             Exception, so we need generics to enforce the type of the list. because we do not know it works
             or not until run time. So we want to catch these errors at compile time. */

//            System.out.println((String) number);
//            System.out.println((Integer) number);
        }
    }
}
