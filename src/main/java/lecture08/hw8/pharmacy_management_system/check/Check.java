package lecture08.hw8.pharmacy_management_system.check;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Check {
    // check() method prompts the user to enter an integer within the range specified by 'first' and 'last'
    // and returns the input if it is a valid integer within the range.
    // It takes in three arguments: 'first' (the lower bound of the range), 'last' (the upper bound of the range),
    // and 'input' (a Scanner object used to read user input).
    public static int check(int first, int last, Scanner input) {
        int button;
        while (true) {
            // If the user has entered an integer, check if it is within the specified range
            if (input.hasNextInt()) {
                int temp = input.nextInt();
                if (temp >= first && temp <= last) {
                    button = temp;
                    return button;
                } else {
                    System.out.print("Enter Number Between" + first + "and" + last + " : ");
                }
                // If the user has not entered an integer, prompt them to enter a number
            } else {
                System.out.print("Enter Number! : ");
                input.next();
            }
        }
    }

    // checkQuantity() method prompts the user to enter a quantity (a positive integer) and returns the input if it is valid.
    // It takes in one argument: 'input' (a Scanner object used to read user input).
    public static int checkQuantity(Scanner input) {
        int quantity;
        while (true) {
            // If the user has entered an integer, check if it is positive
            if (input.hasNextInt()) {
                int temp = input.nextInt();
                if (temp > 0) {
                    quantity = temp;
                    return quantity;
                } else {
                    System.out.print("Enter Quantity Greater than 0! : ");
                }
                // If the user has not entered an integer, prompt them to enter a number
            } else {
                System.out.print("Enter Number! : ");
                input.next();
            }
        }
    }

    // checkNationalCode() method prompts the user to enter a national code (a string of 10 digits) and returns the input if it is valid.
    // It takes in one argument: 'input' (a Scanner object used to read user input).
    public static String checkNationalCode(Scanner input) {
        System.out.print("Enter national code : ");
        String nationalCode;
        while (true) {
            // If the user has entered a string of digits, check if it is 10 digits long
            if (input.hasNextInt()) {
                String temp = input.next();
                if (temp.length() == 10) {
                    nationalCode = temp;
                    return nationalCode;
                } else {
                    System.out.print("Enter 10 Number! : ");
                }
                // If the user has not entered a string of digits, prompt them to enter a number
            } else {
                System.out.print("Enter Number! : ");
                input.next();
            }
        }
    }

    public static boolean checkYN(Scanner input) {
        // Create a stream of the valid inputs "Y" and "N"
        Stream<String> validInputs = Stream.of("Y", "N");

        while (true) {
            String yn = input.next();
            // Check if the input is in the stream of valid inputs
            if (validInputs.anyMatch(yn::equalsIgnoreCase)) {
                // Return true if the input is "Y"
                if (yn.equalsIgnoreCase("Y")) {
                    return true;
                }
                // Return false if the input is "N"
                else if (yn.equalsIgnoreCase("N")) {
                    return false;
                }
            } else {
                System.out.println("Please Enter Y or N!");
            }
        }
    }
    public static int checkPrice(Scanner input) {
        return IntStream.iterate(0, i -> i + 1)
                .mapToObj(i -> input.hasNextLong() ? input.nextInt() : -1)
                .filter(price -> price > 0)
                .findFirst()
                .orElseThrow();
    }
}




