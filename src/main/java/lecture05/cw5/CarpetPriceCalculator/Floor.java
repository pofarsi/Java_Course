package lecture05.cw5.CarpetPriceCalculator;

public class Floor {
    // Two instance
    private double width;

    private double length;

    // For setting the instance
    public Floor(double width, double length) {
        if (width < 0) width = 0;
        if (length < 0) length = 0;
        this.width = width;
        this.length = length;
    }

    public double getArea() {
     return length * width;
    }
}
