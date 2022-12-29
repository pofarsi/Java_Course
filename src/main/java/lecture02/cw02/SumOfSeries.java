package lecture02.cw02;

import java.util.Scanner;

// This program shows sum of series of the 1 + 11 + 111 + 1111.
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of times that you want to series to be sum: ");
        int n = sc.nextInt(), sum = 0, num = 0;

        for (int i = 0; i < n; i++) {
            num = num * 10 + 1;
            System.out.print(num);
            if (i < n - 1) System.out.print(" + ");
            sum += num;
        }
        System.out.println(" = " + sum);
    }
}