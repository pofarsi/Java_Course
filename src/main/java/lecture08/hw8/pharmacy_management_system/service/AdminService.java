package lecture08.hw8.pharmacy_management_system.service;


import lecture08.hw8.pharmacy_management_system.entity.Admin;

import java.sql.SQLException;

public interface AdminService {
    boolean save(String username, String password) throws SQLException;
    Admin load(String username, String password) throws SQLException;
    boolean changePassword(Admin admin, String newPassword) throws SQLException;
    boolean changeUsername(Admin admin, String newUsername) throws SQLException;
}
