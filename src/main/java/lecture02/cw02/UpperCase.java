package lecture02.cw02;

import java.util.Scanner;

// write program that is going to upper case the first character of every word.
public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words that you want to be uppercase: ");
        final int count = scanner.nextInt();
        final StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter the words: ");
        for (int i = 0; i <= count; i++) {

            stringBuilder.append(scanner.nextLine()).append(",");
        }

        for (String split : stringBuilder.toString().split(",")) {
            for (String string : split.split(",")) {
                if (string.length() <= 0) continue;
                System.out.printf("%s%s ", string.substring(0, 1).toUpperCase(), string.substring(1).toLowerCase());
            }
            System.out.println("");
        }
    }
}
