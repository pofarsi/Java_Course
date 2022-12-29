package lecture08.section08.GenericsDataStracture;

/* Naming Convention, E, T, K, V, N.
If we use List, map, Set or any data structures we have List<E>, E is a type parameter, and String
in List <String> is a type argument. we can press Ctrl + N to go to list class we see List<E>.
E stands for Element _ K, V stands for Key and Value _ N stands for Number _ T stands for Type.
Also, we could have generics with multiple type parameter like Generics3 <T, K, V> and use them. */

public class GenericsAndMethods {
    public static void main(String[] args) {
        String[] names = {"Lana", "Mike"};
        // If we want to use same method for another data type, example: use print method below for letters.
        Character[] letters = {'A', 'B', 'x'};
        Integer[] integers = {1, 2, 3, 4};
        print(names);
        print(letters);
        print(integers);

    }

    // Method below takes array of strings. because we want to use print for another data type we use generics.
//    static void print(String[] array)
    // we can return generics
//    static <T> T print(String[] array)
    static <T> T print(T[] array) {
//        for (String e : array)
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
        return null;
    }
}
