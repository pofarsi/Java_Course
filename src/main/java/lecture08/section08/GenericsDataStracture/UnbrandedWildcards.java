package lecture08.section08.GenericsDataStracture;

import java.util.Arrays;
import java.util.List;

// ? unknown type. Unbranded Wildcards.
public class UnbrandedWildcards {
    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 2, 3, 4);
        List<String> list2 = Arrays.asList("5", "6");
        print(list);
        print(list2);
    }
    //if we didn't use ? in print(list2); we get an error.
//    static void print(List<Object> list)
    static void print(List<?> list) {
//        list.forEach(System.out::print);
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
