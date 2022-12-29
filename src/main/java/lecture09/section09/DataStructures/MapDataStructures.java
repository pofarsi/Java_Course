package lecture09.section09.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class MapDataStructures {
    public static void main(String[] args) {
        /* {key: "keyName", value: value1, value2} every map could have one key but multiple values.
          if we have multiple key that have same name we get overriding */

        Map<Integer, String> map = new HashMap<>();
        map.put(1, " value1");
        map.put(2, " value2");
        map.put(3, " value3");
        map.put(4, " value4");
        map.put(4, " value5");

        System.out.println(map);
        System.out.println(map.get(4));
        System.out.println(map.keySet());
        System.out.println("********");

        for (int key : map.keySet()) {
            System.out.print(map.get(key) + ", ");
        }

        System.out.println("\n********");
        map.forEach((Integer, String) -> {
            System.out.println(Integer + " _ " + String);
        });

        System.out.println("********");
        // we can use lambda instead of the above, and also we can use (k, v) instead of type of class.
        map.forEach((k, v) -> System.out.println(k + " _ " + v));

        System.out.println("********");

        // getOrDefault method.
        String defaultMethod = map.getOrDefault(5, "default value");
        System.out.println(defaultMethod);

        String value1 = map.getOrDefault(2, "default value");
        System.out.println(value1);
    }
}
