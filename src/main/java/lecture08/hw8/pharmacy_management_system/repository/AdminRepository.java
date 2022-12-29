package lecture08.hw8.pharmacy_management_system.repository;



import lecture08.hw8.pharmacy_management_system.entity.Admin;

import java.sql.SQLException;

public interface AdminRepository {
    // A method to save an admin to the repository
    void save(Admin admin) throws SQLException;

    // A method to load an admin from the repository by its username and password
    Admin load(String username, String password) throws SQLException;

    // A method to check if an admin with the given username exists in the repository
    boolean loadByUsername(String username) throws SQLException;

    // A method to change the password of an admin in the repository
    void changePassword(String username, String oldPassword, String newPassword) throws SQLException;

    // A method to change the username of an admin in the repository
    void changeUsername(String oldUsername, String newUsername, String password) throws SQLException;
}
