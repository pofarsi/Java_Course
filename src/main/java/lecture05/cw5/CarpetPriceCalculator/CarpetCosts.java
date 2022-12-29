package lecture05.cw5.CarpetPriceCalculator;

public class CarpetCosts {
    private double cost;

    public CarpetCosts(double cost) {
        if (cost < 0) cost = 0;
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }
}
