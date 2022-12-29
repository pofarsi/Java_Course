package lecture01.hw01;

import java.util.Scanner;

// Write program that get number from user and draw pyramid
public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = number - i; j > 1; j--)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
