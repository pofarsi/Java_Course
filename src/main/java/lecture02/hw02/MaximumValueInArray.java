package lecture02.hw02;

import java.util.Scanner;

public class MaximumValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your numbers list: ");
        String numbersAsString = scanner.nextLine();
        String[] numbersSeparate = numbersAsString.split(",");
        int[] count;
        int maximumOfArray = 0;
        count = new int[numbersSeparate.length];
        for(int i = 0; i < count.length; i++) {
            count[i] = Integer.parseInt(numbersSeparate[i]);
        }
        maximumOfArray = count[0];
        for(int i = count.length -1 ; i > 1; i--){
            if(count[i] > maximumOfArray)
                maximumOfArray = count[i];
        }
        System.out.println("You input "+ count.length + " Number and the largest number is " + maximumOfArray);
    }
}