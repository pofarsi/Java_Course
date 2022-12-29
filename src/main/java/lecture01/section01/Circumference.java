package lecture01.section01;

// this class shows the radius of circle which circumference is lower than 100.
public class Circumference {
    public static void main(String[] args) {
        int r = 0;
        double c = 0;
        do {
            r++;
            c = circumference(r);
            if (c < 100)
                System.out.print(r + ",");
        } while (c < 100);

        /* now we want to write program that print circumference of circle that the radius is less than 10.
        for(int r=1; r<=10; r++) {
            double c = circumference(r);
            System.out.println(c);
        } */
    }
    static double circumference (int num) {
        double c = 3.14 * 2 * num; // instead of this we can just use return 3.14 * 2 * num; without "c" as variable.
        return c; // we have to put return key because returns a double.

    }
}
