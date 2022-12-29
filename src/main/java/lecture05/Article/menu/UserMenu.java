package lecture05.Article.menu;

import lecture05.Article.entity.UserInfo;
import lecture05.Article.repository.UserRepository;
import lecture05.Article.service.AddNewArticle;
import lecture05.Article.service.ChangePassword;
import lecture05.Article.service.EditUserArticles;
import lecture05.Article.service.ShowUserArticles;

import java.sql.SQLException;
import java.util.Scanner;

public class UserMenu {

    public void userMenu(UserInfo userInfo) throws SQLException {


        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            UserRepository userRepository = new UserRepository();
            int id = userRepository.findIdByUsername(userInfo.getUserName());
            System.out.println("Welcome. ");
            System.out.println("please chose option. ");
            System.out.println("1: Show My Articles ");
            System.out.println("2: Edit My Articles ");
            System.out.println("3: Add A New Article ");
            System.out.println("4: Change Password ");
            System.out.println("5: LogOut ");

            input = scanner.next();
            switch (input) {
                case "1":
                    ShowUserArticles showUserArticles = new ShowUserArticles();
                    showUserArticles.showUserArticles(id);
                    break;
                case "2":
                    EditUserArticles editUserArticles = new EditUserArticles();
                    editUserArticles.editArticle(id);
                    break;
                case "3":
                    AddNewArticle addNewArticle = new AddNewArticle();
                    addNewArticle.AddnewArticle(id);
                    break;
                case "4":
                    ChangePassword changePassword = new ChangePassword();
                    changePassword.changePassword(userInfo);
                    break;
                default:
                    break;
            }
        }
    }
}
