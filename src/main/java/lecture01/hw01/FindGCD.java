package lecture01.hw01;

// find GCD of two numbers
public class FindGCD {
    public static void main(String[] args) {
        System.out.println(find_gcd(12, 6));
    }

    public static int find_gcd(int x, int y) {
        if (y > x) {
            int t = x;
            x = y;
            y = t;
        }
        int r = x - y * (x / y);
        if (r == 0) return y;
        return find_gcd(y, r);
    }
}
