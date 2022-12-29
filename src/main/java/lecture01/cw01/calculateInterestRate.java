package lecture01.cw01;

/* using the for statement, call the calculateInterestRate method with which interestRate
 is 2,3,4,5,6,7, and 8 How would you modify for loop to work backwards from 8 to 2. */
public class calculateInterestRate {
    private static final int PERCENT = 100;

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            System.out.println("Interest received for " + i + "% is " + calculateInterestRate(100000, i));
        }
        System.out.println("***************************");

        for (int i = 2; i < 9; i++) {
            System.out.println("100,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterestRate(100000.0, i)));
            // We use "%.2f" so this 7000.000000000001 doesn't happen again.
        }
        System.out.println("***************************");

        for (int i = 8; i >= 2; i--) {
            System.out.println("100,000 at " + i + "% interest = "
                    + String.format("%.2f", calculateInterestRate(100000.0, i)));
        }
        System.out.println("***************************");

    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate / PERCENT));
    }

}