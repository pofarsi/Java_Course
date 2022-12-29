package lecture02.section02.ArrayEx;

public class ArrayAnswer {
    static int max(int[] numbers){ // ----> (max(array)) from Array class
        if(numbers == null || numbers.length ==0 )
            return -1;
        int max = numbers[0];
        for(int i = 1; i< numbers.length; i++)
            if(max < numbers[i])
                max = numbers[i];
        return max;
    }
}
