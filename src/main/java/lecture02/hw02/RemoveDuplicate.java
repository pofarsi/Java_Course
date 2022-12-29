package lecture02.hw02;


public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7};
        int[] result = new int[intArray1.length];
        System.arraycopy(intArray1, 0, result, 0, intArray1.length);
        int[] uniq = new int[result.length];
        int count = 0;
        int countUniq = 0;
        for (int i = 0; i < result.length -1; i++){
            if (result[i] != result[i+1]){
                uniq[count] = result[i];
                count++;
            }
            else if (result[i] == result[i +1]) {
                countUniq++;
            }
        }
        System.out.print("You hava " + countUniq + " repeated numbers and numbers with out repeated numbers are ");
        uniq[count] = result[result.length -1];
        for(int j = 0; j<= count; j++)
            System.out.print(uniq[j]+" ");
    }
}