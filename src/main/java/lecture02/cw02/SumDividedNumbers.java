package lecture02.cw02;

// Write program tha sum first 5 numbers that divided by 3 and 5 from 1 to 100.
public class SumDividedNumbers {
    public static void main(String[] args) {

        int count = 0; // for counting, so we can break when we reach 5th number.
        int sum = 0; // sum of numbers that divided by 3 and 5.

        for(int i=1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i; // i, is now the number that divided by 3 and 5 like 15.
                System.out.println("Number = " + i);
            }

            if(count == 5) { // for breaking.
                break;
            }
        }

        System.out.println("Sum = " + sum);

    }
}
