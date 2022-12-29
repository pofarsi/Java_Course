package lecture01.hw01;

import java.util.Scanner;

// find min and max between 10 numbers
public class FindMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int min = sc.nextInt();
        int max = min;
        int num;
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num > max)
                max = num;
            else min = num;
        }
        System.out.println("min is " + min + "," + " max is " + max);
    }
}
