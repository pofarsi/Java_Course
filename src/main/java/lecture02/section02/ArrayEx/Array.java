package lecture02.section02.ArrayEx;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // Array
        int[] array = new int[10];
        array [5] = 12;
        System.out.println(array);
        int[] array1 = {1,2,-4,0,11}; // this is a better way to write array.
        System.out.println("largest number in the array is --> " + ArrayAnswer.max(array1));

        /* in array, we should specify the length of array and all the element in array
         are the same also we can use index to access the element */
        Scanner sc = new Scanner(System.in);
        System.out.println("input the length of your array");
        int n = sc.nextInt();
        double number[] = new double[n];
        for(int i = 0; i<n;i++) {
            System.out.println("input the element of your array");
            number[i] = sc.nextDouble();
        }

        for(int i=0;i<number.length;i++){
            double d = number[i];
            System.out.println(d);
        }
        System.out.println(number);

        // multidimensional array
        int[][] matrix = new int [3][4]; // 3 is the number of rows and 4 is numbers of columns.
        matrix[2][3] = 2; // for input the number we should indicate row and colum.
        System.out.println(matrix[2][3]);

        // loop through array
        for (int i = 0; i<array.length;i++)
            System.out.print(array[i] +", ");
        System.out.println("--> with for loop");

        // for each
        for(int s : array)
            System.out.print(s +", ");
        System.out.println("--> with for each loop");

    }
}