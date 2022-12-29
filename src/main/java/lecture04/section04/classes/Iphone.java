package lecture04.section04.classes;


/* class is a blueprint for creating an object.The blueprint can be used for creating another objects with
 different attribute. we have to define behaviors and properties. properties are attribute like
 (price, model, year of built)
  behaviors is the functionality of given object based of this class. getter and setter are behaviors. */

public class Iphone {
    // private writing of properties called encapsulation. we hide data from outside.

    private phoneModel model;
    //    private String model;
    private double price;
    private boolean waterResistant;
    private String licence;

    // default constructor
//    private Iphone(){}



    public Iphone(phoneModel model,
                  double price,
                  boolean waterResistant) {
        this.model = model;
        this.price = price;
        this.waterResistant = waterResistant;
    }

// Method overloading: there are two method with same name Iphone but with different parameters.

    public Iphone(phoneModel model, String licence) {
        this(model,90.00,true);
        this.licence = licence;
    }

    //    public String getModel() {
    public phoneModel getModel() {
        return model;
    }

    public void setModel(phoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }

    public String getLicence() {
        return licence;
    }

    // also for not getting Classes.Iphone@7a79be86
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", waterResistant=" + waterResistant +
                ", licence='" + licence + '\'' +
                '}';
    }
}

