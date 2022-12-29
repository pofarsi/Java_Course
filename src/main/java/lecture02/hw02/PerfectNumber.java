package lecture02.hw02;

import java.util.Scanner;

// PerfectNumber.java determines whether number is perfect or not.
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sumOfDivisors = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        // divides the given number by natural number from 1 to half the given number adn find the divisors and adds up
        for (int i = 1; i <= number / 2; ++i)
            if (number % i == 0)
                sumOfDivisors += i;

        if(sumOfDivisors == number)
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");
    }
}