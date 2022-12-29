package lecture08.hw8.pharmacy_management_system.service;


import lecture08.hw8.pharmacy_management_system.entity.Patient;

import java.sql.SQLException;

public interface PatientService {
    boolean save(String nationalCode) throws SQLException;
    Patient load(String nationalCode) throws SQLException;
    boolean edit(String oldNationalCode, String newNationalCode) throws SQLException;
}
