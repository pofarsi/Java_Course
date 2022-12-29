package lecture08.hw8.pharmacy_management_system.service.impl;


import lecture08.hw8.pharmacy_management_system.entity.Admin;
import lecture08.hw8.pharmacy_management_system.repository.AdminRepository;
import lecture08.hw8.pharmacy_management_system.repository.impl.AdminRepositoryImpl;
import lecture08.hw8.pharmacy_management_system.service.AdminService;

import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {
    // Create an instance of the AdminRepositoryImpl class
    AdminRepository adminrepository = new AdminRepositoryImpl();

    @Override
    public boolean save(String username, String password) throws SQLException {
        // Check if the username already exists in the repository
        if (adminrepository.loadByUsername(username)) {
            // Create a new Admin object with the given username and password
            Admin admin = new Admin(username, password);
            // Save the Admin object in the repository
            adminrepository.save(admin);
            return true;
        }
        return false;
    }

    @Override
    public Admin load(String username, String password) throws SQLException {
        // Load the Admin object from the repository using the given username and password
        Admin admin = adminrepository.load(username, password);
        // Check if the Admin object was found
        if (admin != null) {
            return admin;
        }
        return null;
    }

    @Override
    public boolean changePassword(Admin admin, String newPassword) throws SQLException {
        // Check if the given Admin object is valid (username and password match an existing Admin object in the repository)
        if (load(admin.getUsername(), admin.getPassword()) != null){
            // Change the password of the given Admin object in the repository
            adminrepository.changePassword(admin.getUsername(), admin.getPassword(), newPassword);
            return true;
        }
        return false;
    }

    @Override
    public boolean changeUsername(Admin admin, String newUsername) throws SQLException {
        // Check if the given Admin object is valid (username and password match an existing Admin object in the repository)
        if (load(admin.getUsername(), admin.getPassword()) != null){
            // Change the username of the given Admin object in the repository
            adminrepository.changeUsername(admin.getUsername(), newUsername, admin.getPassword());
            return true;
        }
        return false;
    }
}

