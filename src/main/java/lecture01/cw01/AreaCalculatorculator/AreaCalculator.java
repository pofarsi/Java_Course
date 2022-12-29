package lecture01.cw01.AreaCalculatorculator;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            System.out.print("You enter negative number ");
            return -1.0;
        }
        System.out.print("The area of circle is ");
        return radius * radius * 3.14159;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.print("You enter negative number ");
            return -1.0;
        }
        System.out.print("The area of rectangle is ");
        return x * y;
    }

    public static void main(String[] args) {

        System.out.println(area(2.0));
        System.out.println(area(-1));
        System.out.println(area(9, 6));
        System.out.println(area(6, -3));
    }
}