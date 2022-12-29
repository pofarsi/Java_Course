package lecture02.hw02;

import java.util.Arrays;
import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows in the matrix : ");
        int row = sc.nextInt();
        System.out.print("Please enter the number of columns in the matrix : ");
        int column = sc.nextInt();
        System.out.println("Enter the each elements of matrix : ");
        int[][] matrix = new int[row][column];
        int[][] transposed = new int[column][row];
        for (int i= 0 ; i < row ; i++ )
            for (int j= 0 ; j < column ;j++ )
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < column; i++)
            for (int j = 0; j< row; j++)
                transposed[i][j] = matrix[j][i];
        System.out.print("matrix: " + Arrays.deepToString(matrix) + "\ntransposed: " + Arrays.deepToString(transposed));
    }
}