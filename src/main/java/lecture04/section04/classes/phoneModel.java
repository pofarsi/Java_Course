package lecture04.section04.classes;

// Constant of our program write as enum class.
public enum phoneModel {
    IPHONE_11_PLUS("Iphone 11 + "),
    IPHONE_12("Iphone 12 + "),
    IPHONE_12_PLUS("Iphone 12 + ");

    private String modelstr;

    phoneModel(String model) {
        this.modelstr = model;
    }

    public String getModelstr() {
        return modelstr;
    }
}
