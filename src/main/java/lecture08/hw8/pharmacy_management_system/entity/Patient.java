package lecture08.hw8.pharmacy_management_system.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {
    // The 'nationalCode' field stores the national code of the patient
    private String nationalCode;

    // A constructor that takes in the 'nationalCode' field as an argument
    public Patient(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}

