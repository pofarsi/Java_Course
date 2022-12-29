package lecture01.hw01;

public class LargestNumberInArrays {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 4, 5, 5, 6, 2, 3};
        int[] number2 = {4, 2, 8, 15, 18, 6, 3, 8};

        int len = number1.length > number2.length ? number1.length : number2.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (number1.length > i && number1[i] > max) {
                max = number1[i];
            }
            if (number2.length > i && number2[i] > max) {
                max = number2[i];
            }
        }
        System.out.print("max element is:" + max);

    }
}


