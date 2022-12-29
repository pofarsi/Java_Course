package lecture08.hw8.pharmacy_management_system.repository.impl;


import lecture08.hw8.pharmacy_management_system.config.DBConfig;
import lecture08.hw8.pharmacy_management_system.entity.Patient;
import lecture08.hw8.pharmacy_management_system.repository.PatientRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientRepositoryImpl implements PatientRepository {
    // This method inserts a new patient record into the "patient" table in the database
    @Override
    public void save(String nationalCode) throws SQLException {
        // Create an SQL query to insert a new record into the "patient" table
        String query = " insert into patient(national_code)values (?)";

        // Create a PreparedStatement object to execute the query
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the value of the placeholder in the query to the provided nationalCode
        preparedStatement.setString(1,nationalCode);

        // Execute the query
        preparedStatement.executeUpdate();

        // Close the Prepared Statement object
        preparedStatement.close();
    }

    // This method retrieves a patient record from the "patient" table in the database
    @Override
    public Patient load(String nationalCode) throws SQLException {
        // Create an SQL query to select a patient record from the "patient" table
        String query = " select national_code from patient where national_code = ? ";

        // Create a Prepared Statement object to execute the query
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the value of the placeholder in the query to the provided nationalCode
        preparedStatement.setString(1,nationalCode);

        // Execute the query and store the result in a ResultSet object
        ResultSet resultSet = preparedStatement.executeQuery();

        // If a matching record is found, create a new Patient object and return it
        if (resultSet.next()){
            // Close the Prepared Statement object
            preparedStatement.close();
            return new Patient(nationalCode);
        }
        // If no matching record is found, return null
        else {
            // Close the Prepared Statement object
            preparedStatement.close();
            return null;
        }
    }

    // This method updates an existing patient record in the "patient" table in the database
    @Override
    public void edit(String oldNationalCode, String newNationalCode) throws SQLException {
        // Create an SQL query to update a patient record in the "patient" table
        String query = "update patient set national_code = ? where national_code = ? ";

        // Create a Prepared Statement object to execute the query
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the values of the placeholders in the query to the provided old and new national codes
        preparedStatement.setString(1,newNationalCode);
        preparedStatement.setString(2,oldNationalCode);

        // Execute the query
        preparedStatement.executeUpdate();

        // Close the Prepared Statement object
        preparedStatement.close();
    }
}

