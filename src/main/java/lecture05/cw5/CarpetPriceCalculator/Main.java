package lecture05.cw5.CarpetPriceCalculator;

public class Main {
    public static void main(String[] args) {
        CarpetCosts carpetCosts = new CarpetCosts(5);
        Floor floor = new Floor(4,8);
        Calculator calculator = new Calculator(floor,carpetCosts);
        System.out.println("total " + calculator.getTotalCost());
    }
}
