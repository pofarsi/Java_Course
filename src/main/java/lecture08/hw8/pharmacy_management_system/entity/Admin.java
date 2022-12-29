package lecture08.hw8.pharmacy_management_system.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Admin {
    // The 'username' field stores the username of the admin
    private String username;

    // The 'password' field stores the password of the admin
    private String password;
}
