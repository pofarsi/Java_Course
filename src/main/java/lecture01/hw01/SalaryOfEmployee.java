package lecture01.hw01;

import java.util.Scanner;

/* Write program that take employee's salary if they make less than 50,000 a year they should not
 to pay taxes if  they make between 50,000$ to 60,000$ a year tha tax should be 5% if they make
 between 60,000$ to 80,000$ tax should be 10% if they make more it should be 24% tax */
public class SalaryOfEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long salary_of_employee, payment_tax, salary_after_tax;
        final int PERCENT = 100;
        System.out.println("Enter the amount of salary of employee: ");
        salary_of_employee = sc.nextLong();

        if (salary_of_employee <= 50_000) {
            System.out.println("You make: " + salary_of_employee + "$ " + "your payment tax is: 0$" +
                    " you should not to pay taxes");

        } else if (salary_of_employee <= 60_000) {
            payment_tax = salary_of_employee * 5 / PERCENT;
            salary_after_tax = salary_of_employee - payment_tax;
            System.out.println("You make: " + salary_of_employee + "$ " + "your payment tax is: " +
                    payment_tax + "$ " + "and your salary after tax is: " + salary_after_tax);

        } else if (salary_of_employee <= 80_000) {
            payment_tax = salary_of_employee * 10 / PERCENT;
            salary_after_tax = salary_of_employee - payment_tax;
            System.out.println("You make: " + salary_of_employee + "$ " + "your payment tax is: " +
                    payment_tax + "$ " + "and your salary after tax is: " + salary_after_tax);

        } else {
            payment_tax = salary_of_employee * 24 / PERCENT;
            salary_after_tax = salary_of_employee - payment_tax;
            System.out.println("You make: " + salary_of_employee + "$ " + "your payment tax is: " +
                    payment_tax + "$ " + "and your salary after tax is: " + salary_after_tax);
        }
    }
}
