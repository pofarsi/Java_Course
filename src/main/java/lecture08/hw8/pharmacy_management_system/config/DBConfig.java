package lecture08.hw8.pharmacy_management_system.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
    private static Connection connection;
    static {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hw9",
                    "postgres","044033");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
