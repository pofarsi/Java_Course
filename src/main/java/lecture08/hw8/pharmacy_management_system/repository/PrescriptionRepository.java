package lecture08.hw8.pharmacy_management_system.repository;

import lecture08.hw8.pharmacy_management_system.entity.Drug;
import lecture08.hw8.pharmacy_management_system.entity.Patient;
import lecture08.hw8.pharmacy_management_system.entity.Prescription;

import java.sql.SQLException;

// The 'PrescriptionRepository' interface provides methods for saving, editing, and loading prescriptions from a repository
public interface PrescriptionRepository {
    // A method to save a drug and a patient to the repository
    void save(Drug drug, Patient patient) throws SQLException;

    // A method to load a prescription from the repository for a given patient before it has been confirmed
    Prescription loadBeforeConfirm(Patient patient) throws SQLException;

    // A method to load a prescription from the repository for a given patient after it has been confirmed
    Prescription loadAfterConfirm(Patient patient) throws SQLException;

    // A method to load all prescriptions from the repository
    Prescription loadAll() throws SQLException;

    // A method to edit a prescription in the repository by replacing a drug with a new drug for a given patient
    void editPrescription(String oldName, Drug newDrug, Patient patient) throws SQLException;

    // A method to change the 'doesExist' field of a drug in the repository
    void changeExistMode(boolean exist, String name) throws SQLException;

    // A method to change the 'isConfirm' field of a prescription in the repository for a given patient
    void changeConfirmMode(boolean confirm, String nationalCode) throws SQLException;

    // A method to change the 'isPay' field of a prescription in the repository for a given patient
    void changePaymentMode(boolean pay, String nationalCode) throws SQLException;

    // A method to add a price to a drug in the repository for a given patient
    void addPrice(String name, long price, String nationalCode) throws SQLException;

    // A method to remove a prescription from the repository for a given patient
    void remove(Patient patient) throws SQLException;
}

