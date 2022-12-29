package lecture02.cw02;

import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you ");
        int age = sc.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You are born in year  " + year);
    }
}
