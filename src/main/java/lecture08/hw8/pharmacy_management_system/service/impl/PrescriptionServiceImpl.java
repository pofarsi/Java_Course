package lecture08.hw8.pharmacy_management_system.service.impl;



import lecture08.hw8.pharmacy_management_system.entity.Drug;
import lecture08.hw8.pharmacy_management_system.entity.Patient;
import lecture08.hw8.pharmacy_management_system.entity.Prescription;
import lecture08.hw8.pharmacy_management_system.repository.PrescriptionRepository;
import lecture08.hw8.pharmacy_management_system.repository.impl.PrescriptionRepositoryImpl;
import lecture08.hw8.pharmacy_management_system.service.PrescriptionService;

import java.sql.SQLException;

public class PrescriptionServiceImpl implements PrescriptionService {
    // Create an instance of the prescription repository
    PrescriptionRepository prescriptionRepository = new PrescriptionRepositoryImpl();

    @Override
    public boolean save(String name, int quantity, Patient patient) throws SQLException {
        // Check if the patient doesn't have a prescription
        if (load(patient) == null){
            // Create a new drug with the given name and quantity
            Drug drug = new Drug(name, quantity);
            // Save the drug to the repository
            prescriptionRepository.save(drug, patient);
            return true;
        }
        // Check if the patient has a prescription with less than 10 drugs and the prescription doesn't contain the given drug name
        else if (prescriptionRepository.loadBeforeConfirm(patient).size() < 10 && !load(patient).contains(name)) {
            // Create a new drug with the given name and quantity
            Drug drug = new Drug(name, quantity);
            // Save the drug to the repository
            prescriptionRepository.save(drug, patient);
            return true;
        }
        // Return false if the patient has a prescription with 10 or more drugs or the prescription already contains the given drug name
        return false;
    }

    @Override
    public boolean editPrescription(String oldName,String name, int quantity, Patient patient) throws SQLException {
        // Create a new drug with the given name and quantity
        Drug drug = new Drug(name,quantity);
        // Check if the patient's prescription contains the old drug name
        if (load(patient).contains(oldName)) {
            // Edit the prescription in the repository with the new drug
            prescriptionRepository.editPrescription(oldName, drug, patient);
            return true;
        }
        // Return false if the patient's prescription doesn't contain the old drug name
        return false;
    }

    @Override
    public boolean changeMode(String mode, boolean change, String name) throws SQLException {
        // Check the mode and change it in the repository accordingly
        if (mode.equalsIgnoreCase("exist")) {
            prescriptionRepository.changeExistMode(change, name);
        }else if (mode.equalsIgnoreCase("confirm")) {
            prescriptionRepository.changeConfirmMode(change,name);
        }else if (mode.equalsIgnoreCase("pay")) {
            prescriptionRepository.changePaymentMode(change, name);
        }
        // Return true if the mode was successfully changed
        return true;
    }

    @Override
    public boolean addPrice(String name, long price, String nationalCode) throws SQLException {
        // Create a new patient object with the given national code
        Patient patient = new Patient(nationalCode);
        // Check if the patient's prescription contains the given drug name
        if (load(patient).contains(name)) {
            // Add the price to the drug in the repository
            prescriptionRepository.addPrice(name, price, nationalCode);
            return true;
        }
        // Return false if the patient's prescription doesn't contain the given drug name
        return false;
    }

    @Override
    public Prescription load(Patient patient) throws SQLException {
        Prescription before = prescriptionRepository.loadBeforeConfirm(patient);
        Prescription after = prescriptionRepository.loadAfterConfirm(patient);
        if (before.size() != 0){
            return before;
        }else if (after.size() != 0){
            return after;
        }else
            return null;
    }

    @Override
    public Prescription loadAll() throws SQLException {
        Prescription loadAll = prescriptionRepository.loadAll();
        if (loadAll.size() != 0){
            return loadAll;
        }else
            return null;
    }

    @Override
    public void remove(Patient patient) throws SQLException {
        prescriptionRepository.remove(patient);
    }
}
