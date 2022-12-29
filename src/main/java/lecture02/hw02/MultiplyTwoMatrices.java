package lecture02.hw02;

import java.util.Arrays;
import java.util.Scanner;
public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows in the matrix 1: ");
        int rowFirstMatrix = sc.nextInt();
        System.out.print("Please enter the number of columns in the matrix 1: ");
        int columnFirstMatrix = sc.nextInt();
        System.out.println("Enter the each elements of matrix 1: ");
        int[][] firstMatrix = new int[rowFirstMatrix][columnFirstMatrix];
        for (int i= 0 ; i < rowFirstMatrix ; i++ )
            for (int j= 0 ; j < columnFirstMatrix ;j++ )
                firstMatrix[i][j] = sc.nextInt();
        System.out.println("first matrix: " + Arrays.deepToString(firstMatrix));

        System.out.print("Please enter the number of rows in the matrix 2: ");
        int rowSecondMatrix = sc.nextInt();
        System.out.print("Please enter the number of columns in the matrix 2: ");
        int columnSecondMatrix = sc.nextInt();
        System.out.println("Enter the each elements of matrix 2: ");
        int[][] secondMatrix = new int[rowSecondMatrix][columnSecondMatrix];
        for (int i= 0 ; i < rowSecondMatrix ; i++ )
            for (int j= 0 ; j < columnSecondMatrix ;j++ )
                secondMatrix[i][j] = sc.nextInt();
        System.out.println("second matrix: " + Arrays.deepToString(secondMatrix));

        int[][] product = new int[rowFirstMatrix][columnSecondMatrix];
        for(int i = 0; i < rowFirstMatrix; i++) {
            for (int j = 0; j < columnSecondMatrix; j++) {
                for (int k = 0; k < columnFirstMatrix; k++)
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }
        System.out.println(Arrays.deepToString(product));
    }
}