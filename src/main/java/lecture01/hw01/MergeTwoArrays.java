package lecture01.hw01;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] number1 = {1, 2, 3, 4, 5, 5, 6, 2, 3};
        int[] number2 = {4, 2, 8, 15, 18, 6, 3, 8};
        int str1 = number1.length;
        int str2 = number2.length;

        int lengthArray = str1 + str2;
        int[] lenArray = new int[lengthArray];

        System.arraycopy(number1, 0, lenArray, 0, str1);
        System.arraycopy(number2, 0, lenArray, str1, str2);

        System.out.println(Arrays.toString(lenArray));
    }
}
