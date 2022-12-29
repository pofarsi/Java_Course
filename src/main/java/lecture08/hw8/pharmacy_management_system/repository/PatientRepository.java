package lecture08.hw8.pharmacy_management_system.repository;



import lecture08.hw8.pharmacy_management_system.entity.Patient;

import java.sql.SQLException;

// The 'PatientRepository' interface provides methods for saving, loading, and editing the details of patients
public interface PatientRepository {
    // A method to save a patient to the repository
    void save(String nationalCode) throws SQLException;

    // A method to load a patient from the repository by its national code
    Patient load (String nationalCode) throws SQLException;

    // A method to edit the national code of a patient in the repository
    void edit(String oldNationalCode, String newNationalCode) throws SQLException;
}

