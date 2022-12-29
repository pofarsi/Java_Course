package lecture02.hw02;

import java.util.Arrays;

public class ConcatenatingArrays {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3};
        int[] intArray2 = {4, 5, 6};
        int[] result = new int[intArray1.length + intArray2.length];
        int index = 0;

        for (int item: intArray1) {
            result[index++] = item;
        }
        for (int item: intArray2) {
            result[index++] = item;
        }
        System.out.println(Arrays.toString(result));
    }
}