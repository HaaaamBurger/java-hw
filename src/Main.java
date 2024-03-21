import db.ConnectionManager;
import db.Query;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection dbConnection = ConnectionManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "rootroot");
            System.out.println("Connect to docker db successfully!");

            String userTableStructure = "CREATE TABLE USERS " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " age INTEGER, " +
                    " gender VARCHAR(6), " +
                    " PRIMARY KEY ( id ))";  ;

            Query.createTable(dbConnection, userTableStructure);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        ConnectionManager.disconnect();
    }
}