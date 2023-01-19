package sa.aref.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String SERVER_ADDRESS = "127.0.0.1:5432";
    private final static String DBNAME = "postgres";
    private final static String USER = "postgres";
    private final static String PASSWORD = "postgres";

    private Connection connection;

    public Connection connection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + SERVER_ADDRESS + "/" + DBNAME, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
