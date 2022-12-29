package lecture08.hw8.pharmacy_management_system.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Drug {
    // The 'name' field stores the name of the drug
    @EqualsAndHashCode.Include
    private String name;

    // The 'quantity' field stores the quantity of the drug
    private int quantity;

    // The 'price' field stores the price of the drug
    private long price;

    // The 'doesExist' field stores a boolean value indicating whether the drug is available
    private boolean doesExist;

    // The 'isConfirm' field stores a boolean value indicating whether the drug has been confirmed
    private boolean isConfirm;

    // The 'isPay' field stores a boolean value indicating whether the drug has been paid for
    private boolean isPay;

    // The 'totalPrice' field stores the total price of the drug (quantity * price)
    private long totalPrice;

    // The 'patientNationalCode' field stores the national code of the patient
    private String patientNationalCode;

    // A constructor that takes in the 'name' and 'quantity' fields as arguments
    public Drug(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        totalPrice = price*quantity;
    }

}

