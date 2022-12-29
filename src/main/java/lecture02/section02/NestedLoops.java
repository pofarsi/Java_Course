package lecture02.section02;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loops
        Scanner scanner2 = new Scanner(System.in);
        int nextInt = 0;
        do {
            System.out.println("input the number: ");
            nextInt = scanner2.nextInt();
            for (int k = 0; k < nextInt; k++) {
                System.out.println(k);
            }
        } while (nextInt > 0);
    }
}
