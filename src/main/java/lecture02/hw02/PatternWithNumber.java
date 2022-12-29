package lecture02.hw02;

import java.util.Scanner;

// Write program that display triangle with number.
public class PatternWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j == i) {
                    for (int k = j - 1; k >= 1; k--)
                        System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
