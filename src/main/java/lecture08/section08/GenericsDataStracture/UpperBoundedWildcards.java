package lecture08.section08.GenericsDataStracture;

import java.util.Arrays;
import java.util.List;

// ? extend type. Upper Bounded Wildcards.
public class UpperBoundedWildcards {
    public static void main(String[] args) {

        List<Double> list = Arrays.asList(1.0, 2.0);
        List<Number> list2 = Arrays.asList(3, 4, 5.0);
        List<Integer> list3 = Arrays.asList(6, 7);
        print(list);
        print(list2);
        print(list3);

    }

    // we restrict data type to Number by extend from NUmber class. print(List<? extends Number> list)
    static void print(List<? extends Number> list) {
//        list.forEach(System.out::print);
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
