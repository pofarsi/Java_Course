package lecture04.section04.oop_basic;

import java.time.LocalDate;

public class Methods {

    /* public is access modifier, static means this method belong to a class not an instance,
       void is a return Type that does not return anything, main is a name of the method, inside
       parentheses we have some arguments,arguments are data which are pass in to methods that we
       can work with. */

    public static void main(String[] args) {
        // If the method does not return a value we can not assign it to variable.
        var a = incrementNumber(3);
        print(a);
        // We can not assign print method in to variable int because print does not return anything.
//        int x = print(a);
        var currentDate1 = currentDate();
        System.out.println("currentDate " + currentDate1);
        var currentDate2 = yesterdayDate(1);
        System.out.println("yesterdayDate " + currentDate2);
        var currentDate3 = yesterdayDate(3);
        System.out.println("Three days a go's Date " + currentDate3);
    }

    private static int incrementNumber(int value) {
        return value + 1;
    }

    private static void print(int value) {
        System.out.println(value);
    }

    // When a method does not have any parameters we can return it empty.
    private static LocalDate currentDate() {
        return LocalDate.now();
    }

    // When a method return a certain data type we should use that in the method and when we want to call the method.
    private static LocalDate yesterdayDate(int x) {
        return LocalDate.now().minusDays(x);
    }
}
