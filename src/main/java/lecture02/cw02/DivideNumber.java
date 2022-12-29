package lecture02.cw02;

import java.util.Scanner;

/*write program that input number from user than divide number to smaller
 number that is going top be sum of the given number  */
public class DivideNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        final int i = sc.nextInt();
        boolean state = false;

        for (int x = 1; x <= i; x++) {
            for (int y = 1; y <= i; y++) {
                for (int z = 1; z <= i; z++) {
                    if (state) break;
                    if (x + y + z != i || x * x + y * y != z * z) continue;
                    System.out.println(x + " --> " + y + " --> " + z);
                    state = true;
                }
            }
        }
        if (state) return;
        System.out.println("Impossible");
    }
}
