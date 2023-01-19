package sa.aref.repository;

import sa.aref.util.ApplicationContext;

import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {
    public void createUserTable() throws SQLException {
        Statement stm = ApplicationContext
                .getConnection()
                .createStatement();
        String query = """
                create table if not exist user_table(
                                                     id serial primary key not null,
                                                     firstName varchar(30),
                                                     lastName varchar(30),
                                                     username varchar(30) unique not null,
                                                     password varchar(80) not null);
                """;
        stm.executeUpdate(query);
    }
}
