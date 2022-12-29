package lecture08.section08.GenericsDataStracture;


import java.util.Arrays;
import java.util.List;

// ? super type. Unbranded Wildcards.
public class LoweBoundedWildcards {
    public static void main(String[] args) {

//        List<Double> list = Arrays.asList(1.0, 2.0);
        List<Number> list2 = Arrays.asList(3, 4, 5.0);
        List<Integer> list3 = Arrays.asList(6, 7);
        print(list2);
        print(list3);

    }

    /* we restrict data type to Number super class. print(List<? super Number> list) if we go to
     Integer class we see --> public final class Integer extends Number implements Comparable<Integer>
     so Integer class extend Number class thus Number is a super class of Integer */
    static void print(List<? super Integer> list) {
//        list.forEach(System.out::print);
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
