package lecture08.section08.GenericsDataStracture;

public class Generics2 {
    public static void main(String[] args) {
        // If we do not use generics here we do not get an error until run time.
        Comparable number = 13;
        Comparable<Integer> number1 = 13;
        // 0 means equal _ 1 means number1 > _ -1 means number1 <.
        System.out.println(number1.compareTo(12));
        System.out.println(number1.compareTo(13));
        System.out.println(number1.compareTo(14));
//        number.compareTo("13");
    }
}
