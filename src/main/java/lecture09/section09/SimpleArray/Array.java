package lecture09.section09.SimpleArray;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //    int[] intArray = new int[10]; // This is one way to write an array, and it is mean the intArray has 10 number.
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The 5th Array--> " + integerArray[5]);
        System.out.println("**************************");
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
            System.out.print(i + ", ");

        }
        System.out.println();
        System.out.println("**************************");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + "----> " + intArray[i] + ", ");
        }
        System.out.println();
        System.out.println("**************************");
        printArray(intArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number----> " + array[i] + ", ");
        }
        System.out.println();
        System.out.println("**************************");
    }
}

class Sum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integer = getInt(5);
        for (int i = 0; i < integer.length; i++) {
            System.out.println(i + "----> " + integer[i]);
        }
        System.out.println("Average= "+ getAverage(integer));
    }

    public static int[] getInt(int number) {
        System.out.println(number + "---> ");
        int[] value = new int[number];
        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();

        }
        return value;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return (double) sum / (double) array.length;
    }
}
