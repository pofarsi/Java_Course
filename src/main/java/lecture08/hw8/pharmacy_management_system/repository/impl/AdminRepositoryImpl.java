package lecture08.hw8.pharmacy_management_system.repository.impl;

import lecture08.hw8.pharmacy_management_system.config.DBConfig;
import lecture08.hw8.pharmacy_management_system.entity.Admin;
import lecture08.hw8.pharmacy_management_system.repository.AdminRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepositoryImpl implements AdminRepository {

    // Method to save a new admin in the database
    @Override
    public void save(Admin admin) throws SQLException {
        // SQL query to insert a new row into the "admin" table
        String query = "insert into admin (username, password)\nvalues (?,?)";

        // Create a PreparedStatement object from the query and the connection to the database
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the values for the placeholders in the query
        preparedStatement.setString(1, admin.getUsername());
        preparedStatement.setString(2, admin.getPassword());

        // Execute the update query to insert the new row into the table
        preparedStatement.executeUpdate();

        // Close the Prepared Statement object to release resources
        preparedStatement.close();
    }

    // Method to load an admin from the database using the given username and password
    @Override
    public Admin load(String username, String password) throws SQLException {
        // SQL query to select an admin from the "admin" table with the given username and password
        String query = "select * from admin where username = ? and password = ? ";

        // Create a Prepared Statement object from the query and the connection to the database
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the values for the placeholders in the query
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        // Execute the query and get the ResultSet object
        ResultSet resultSet = preparedStatement.executeQuery();

        // Check if the ResultSet has a row, create a new Admin object with the given username and password, and return it
        if (resultSet.next()) {
            return new Admin(username, password);
        }

        // If the ResultSet is empty, return null
        return null;
    }

    // Method to check if an admin with the given username exists in the database
    @Override
    public boolean loadByUsername(String username) throws SQLException {
        // SQL query to select an admin from the "admin" table with the given username
        String query = " select * from admin where username = ? ";

        // Create a Prepared Statement object from the query and the connection to the database
        PreparedStatement preparedStatement = DBConfig.getConnection().prepareStatement(query);

        // Set the value for the placeholder in the query
        preparedStatement.setString(1, username);

        // Execute the query and get the ResultSet object
        ResultSet resultSet = preparedStatement.executeQuery();

        // Check if the ResultSet has a row, return false
        if (resultSet.next()) {
            return false;
        }

        // If the ResultSet is empty, return true
        return true;
    }

    // Method to change the password of an admin with the given username and old password
    @Override
    public void changePassword(String username, String oldPassword, String newPassword) throws SQLException {
        // SQL query to update the password of an admin in the "admin" table with the given

    }

    @Override
    public void changeUsername(String oldUsername, String newUsername, String password) throws SQLException {

    }
}