package lecture05.cw5.CarpetPriceCalculator;

public class Calculator {
    private Floor floor;

    private CarpetCosts carpetCosts;

    public Calculator(Floor floor, CarpetCosts carpet) {
        this.floor = floor;
        this.carpetCosts = carpet;
    }
    public double getTotalCost() {
        return floor.getArea() * carpetCosts.getCost();
    }
}
