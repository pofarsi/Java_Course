package lecture02.section02.SpeedConverter;

public class Main {
    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(20);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(20);
    }
}

