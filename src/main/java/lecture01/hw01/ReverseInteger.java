package lecture01.hw01;

import java.util.Scanner;

// Write program that reversed a number
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        System.out.println("Reversed a number is: ");

        /* if number is %10 the last digit of number is going to be decimal like 234 % 10 = 23.4,
        and we print 4 then number / 10 is going to remove number until reach 0 and get out of loop*/

        while (number > 0) {
            System.out.print(number % 10);
            number /= 10;
            // System.out.println("Number after % and / by 10 is --> " + number);
        }
    }
}
