package lecture01.section01;

public class TernaryOperator {
    public static void main(String[] args) {
// When we have one boolean
// variable = (condition) ? expressionTrue :  expressionFalse;
        int age = 15;
        String message = age >= 18 ? "adult" : "child";
        System.out.println(message);

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int timeTernary = 20;
        String result = (timeTernary < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
