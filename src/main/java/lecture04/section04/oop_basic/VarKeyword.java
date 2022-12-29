package lecture04.section04.oop_basic;

import java.awt.*;
import java.time.LocalDate;

// in java, We have to be specific when we want to create a variable but since java 11 we can use var.
public class VarKeyword {
    public static void main(String[] args) {
//        String name = "Ali";
//        Point point = new Point(1,2);
//        int integerNumber = 1;
//        double doubleNumber = 2.3;
//        LocalDate now = LocalDate.now();

        var name = "Ali";
        var point = new Point(1,2);
        var integerNumber = 1;
        var doubleNumber = 2.3;
        var now = LocalDate.now();
    }
}
