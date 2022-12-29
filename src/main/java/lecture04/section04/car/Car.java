package lecture04.section04.car;

public class Car {
    // these state of the Car, which software object stores its state in fields, and we know fields as variables.
    // And they expose their behavior with methods.
    // which class we can creat objects or "another data type", class is a template of a blueprint for creating objects.
    private int doors;
    private int wheels;
    public String model; // because public we can access in the main class, BUT this is not good practice
    // Because of "violation of encapsulation", So we're creating methods
    private String engine;
    private String color;
    // Now for building an object from class of Car we go to the Class Main.

    public void setColor(String color) { // we use setter here now we have problem that is color in here is parameter
        // in the class Car color is a field. So for updating the fields we use this key word.
        // With setters, we can do some validation.
        // For example our cars has color of white, red, blue if put another color we should get white.
        String validColor = color.toLowerCase();
        if (validColor.equals("red") || validColor.equals("blue")) {
            this.color = color;
        }else {
            this.color = "White";
        }
    }
    public String getColor(){
        return this.color;

    }
}

