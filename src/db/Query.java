package db;

import java.sql.*;

public class Query {

    public static void createTable(Connection connection, String schema) {
        try {
            Statement statement = connection.createStatement();

            statement.executeUpdate(schema);
            System.out.println("The table was successfully created!");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
