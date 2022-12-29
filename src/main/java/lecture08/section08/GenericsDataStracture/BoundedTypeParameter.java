package lecture08.section08.GenericsDataStracture;

public class BoundedTypeParameter {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4};
        // When we use double we get error because we didn't use generics.
        Double[] numbers1 = {1.3, 3.0, 8.0, 0.4};
        System.out.println(countGreaterThan(numbers1, 1.0));
    }

    // Multiple Bounds
    interface A {}

    interface B {}

//    static int countGreaterThan(int[] numbers, int number)
        // Multiple Bounds,

//    static <T extends Number & Comparable<T> & A & B> int countGreaterThan(T[] numbers, T number)
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {

        int count = 0;
        for (T n : numbers) {
            /* Operator '>' cannot be applied to 'T', 'T'
             when we get this error we should use  BoundedTypeParameter */
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}

/*
Bounded Type Parameter VS Wildcards
we can have & in Bounded Type Parameter but in Wild cards we do not allowed.
Bounded Type Parameter doesn't have the flexibility of Wild cards (?, ? extend, ? super).
Bounded Type Parameter can reference the type <T>, with wiled cards we can not do that.
 */
