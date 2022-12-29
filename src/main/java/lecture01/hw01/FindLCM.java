package lecture01.hw01;

import java.util.Scanner;

public class FindLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 that is larger than second number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number2 that is less than first number: ");
        int number2 = sc.nextInt();
        System.out.println(GCD(number1, number2));

    }

    static int GCD(int number1, int number2) {
        int reminder = number1 % number2;
        if (reminder == 0)
            return number2;
        return GCD(number2, reminder);

    }
}
