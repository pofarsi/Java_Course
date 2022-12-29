package lecture05.Article.service;



import lecture05.Article.entity.UserInfo;
import lecture05.Article.menu.UserMenu;
import lecture05.Article.repository.UserRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Login {

    Scanner scanner = new Scanner(System.in);
    UserInfo userInfo = new UserInfo();

    private void setUserName() {
        String username;
        do {
            System.out.println("please enter the username: ");
            username = scanner.next();
            if (username.length() <= 18) {
                break;
            } else {
                System.out.println("U+1F595! ");
            }
        } while (true);
        userInfo.setUserName(username);
    }

    private void setPassword() {
        String password;
        do {
            System.out.println("please enter the password code: ");
            password = scanner.next();
            if (password.length() <= 10 && password.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("U+1F595! ");
            }
        } while (true);
        userInfo.setPassword(password);
    }


    public void login() throws SQLException {
        setUserName();
        setPassword();
        UserRepository userRepository = new UserRepository();
        boolean check = userRepository.logIn(userInfo);
        if (check) {
            System.out.println("your account is exist. ");
            UserMenu userMenu = new UserMenu();
            userMenu.userMenu(userInfo);
        } else {
            System.out.println("U+1F595. ");
        }


    }
}
