package lecture09.section09.DataStructures;

import java.util.Arrays;

// Data Structure is a way that we can organize, maintain and manipulate data and one of the data Structure is Array.
public class ArrayDataStructure {
    public static void main(String[] args) {
        // In Arrays, we should specify size of array and the type.
        int[] numbers = {1, 2, 3, 4};
        // We can change the array
        numbers[0] = 5;
        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            // "i" is counter of loop for getting array value we should write like below.
            System.out.println("Index " + i + " --> " + numbers[i]);
        }
    }
}
