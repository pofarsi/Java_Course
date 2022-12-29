package lecture08.hw8.pharmacy_management_system.service.impl;



import lecture08.hw8.pharmacy_management_system.entity.Patient;
import lecture08.hw8.pharmacy_management_system.repository.PatientRepository;
import lecture08.hw8.pharmacy_management_system.repository.impl.PatientRepositoryImpl;
import lecture08.hw8.pharmacy_management_system.service.PatientService;

import java.sql.SQLException;

public class PatientServiceImpl implements PatientService {
    // Create an instance of the PatientRepositoryImpl class
    PatientRepository patientRepository = new PatientRepositoryImpl();

    @Override
    public boolean save(String nationalCode) throws SQLException {
        // Check if a Patient object with the given national code exists in the repository
        if (patientRepository.load(nationalCode) == null){
            // Save the Patient object in the repository
            patientRepository.save(nationalCode);
            return true;
        }else
            return false;
    }

    @Override
    public Patient load(String nationalCode) throws SQLException {
        // Check if a Patient object with the given national code exists in the repository
        if (patientRepository.load(nationalCode) != null){
            // Load the Patient object from the repository
            return patientRepository.load(nationalCode);
        }else
            return null;
    }

    @Override
    public boolean edit(String oldNationalCode, String newNationalCode) throws SQLException {
        // Check if a Patient object with the given old national code exists in the repository
        if (load(oldNationalCode) != null){
            // Edit the national code of the Patient object in the repository
            patientRepository.edit(oldNationalCode,newNationalCode);
            return true;
        }else
            return false;
    }
}

