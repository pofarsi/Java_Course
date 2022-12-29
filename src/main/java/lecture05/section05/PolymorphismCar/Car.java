package lecture05.section05.PolymorphismCar;

class Car {
    private boolean electric;
    private boolean brakes;
    private int wheels;
    private String name;

    public Car(boolean brakes, String name) {
        this.brakes = brakes;
        this.name = name;
        this.wheels = 4;
        this.electric = true;
    }

    public boolean getBrakes() {
        return brakes;
    }

    public String getName() {
        return name;
    }

    public String startCar() {
        return "Car ---> Start engine";
    }

    public String Charging() {
        return "Car ---> Pumping gas";
    }

    public String autoPilot() {
        return "Car ---> manual drive";
    }
}

class Tesla extends Car {
    public Tesla(boolean brakes, String name) {
        super(brakes, name);
    }

    @Override
    public String startCar() {
        return "Tesla Moving";
        //return super.startCar();
    }

    @Override
    public String Charging() {
        return "Tesla Charging";
    }

    @Override
    public String autoPilot() {
        return "Tesla Autopilot";
    }
}



