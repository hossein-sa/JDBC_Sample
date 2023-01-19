package sa.aref.util;

import sa.aref.repository.UserRepository;

import java.sql.Connection;

public class ApplicationContext {
    private static final Connection connection = new DBConnection().connect();
    private static final UserRepository userRepository = new UserRepository();

    public static Connection getConnection() {
        return connection;
    }

    public static UserRepository getUserRepository() {
        return userRepository;
    }
}
