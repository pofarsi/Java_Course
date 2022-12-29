package lecture02.section02;

// Every recursive function should have a halting condition,
// which is the condition where the function stops calling itself
// add all the numbers between 5 and 10.
public class HaltingCondition {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
