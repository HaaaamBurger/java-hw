package db;

import entities.User;

import java.sql.*;



public class Query {
    public static void findById(int id) {
        try {
            Connection connection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            String findByIdScheme = "SELECT * FROM USERS WHERE ID = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(findByIdScheme);
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();

            if(result.next()) {

                System.out.println();
            } else {
                System.out.println("User with id " + id + " not found!");
            }
            System.out.println(result.getString("name"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createUser(User user) {
        String creationScheme = "INSERT INTO USERS (name, age, gender, id) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);

            PreparedStatement preparedStatement = connection.prepareStatement(creationScheme);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setObject(3, user.getGender().toString());
            preparedStatement.executeUpdate();

            System.out.println("User " + user.getName() + " was successfully added!\n");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
