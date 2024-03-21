package db;

import java.sql.*;

public class ConnectionManager {
    private static Connection connection;

    public static Connection getConnection(String url, String user, String password) throws SQLException {
        try {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
