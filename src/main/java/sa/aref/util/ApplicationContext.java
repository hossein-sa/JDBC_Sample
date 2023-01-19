package sa.aref.util;

import java.sql.Connection;

public class ApplicationContext {
    private static final Connection connection = new DBConnection().connect();

    public static Connection getConnection() {
        return connection;
    }
}
