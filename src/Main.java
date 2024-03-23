import db.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection myConnection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            System.out.println("Connect to docker db successfully!\n");

//            String userTableStructure = "CREATE TABLE USERS (" +
//                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
//                    "name VARCHAR(255), " +
//                    "age INTEGER, " +
//                    "gender VARCHAR(255)" +
//                    ")";
//
//            ConnectionManager.createTable(userTableStructure);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionManager.disconnect();
    }
}