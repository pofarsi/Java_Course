package lecture05.Article.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ApplicationConnection {
    private static Connection connection;

    static {
        try {
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres",
                            "044033");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
