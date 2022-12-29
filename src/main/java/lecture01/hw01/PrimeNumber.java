package lecture01.hw01;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                System.out.println(i);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            return false;
        return true;
    }

}

