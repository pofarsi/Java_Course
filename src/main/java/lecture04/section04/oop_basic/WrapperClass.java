package lecture04.section04.oop_basic;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        int intNumber = 1;
        /* we can not use num with dot "." if we want to work with integer in OOP we use Wrapper Classes.
        num. does not work
        another example
        int x = null; does not work
        Integer x = null; it works. */

//        Integer number = new Integer(1);
        // We can write it like below.
        Integer number1 = 10;

        /* In list if we want to specify just integer we use generics put wrapper class of integer on it,
         then we can not use any other type like String. */
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(number1);
//        number.add("3");
        System.out.println("List of numbers " + number);

    }
}
