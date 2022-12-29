package lecture02.hw02;

class Water {
    public static int maxWater(int[] array, int n) {
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = array[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, array[j]);
            }
            int right = array[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, array[j]);
            }
            result += Math.min(left, right) - array[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }
}