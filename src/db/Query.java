package db;

import entities.User;
import enums.EGender;

import java.sql.*;



public class Query {
    public static User findById(Integer id) {
        try {
            Connection connection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            String findByIdScheme = "SELECT * FROM USERS WHERE ID = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(findByIdScheme);
            preparedStatement.setInt(1, id);
            ResultSet result = preparedStatement.executeQuery();

            User user = new User();

            if(result.next()) {
                user.setAge(result.getInt("age"));
                user.setName(result.getString("name"));
                user.setGender(EGender.valueOf(result.getString("gender")));
            } else {
                throw new RuntimeException("User with id " + id + " not found!");
            }

            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createUser(User user) {
        String creationScheme = "INSERT INTO USERS (name, age, gender) VALUES (?, ?, ?)";

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

    public static int removeUserById(Integer id) {
        String removeScheme = "DELETE FROM USERS WHERE ID = ?";
        try {
            findById(id);

            Connection connection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            PreparedStatement preparedStatement = connection.prepareStatement(removeScheme);

            preparedStatement.setInt(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();

            return rowsDeleted;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateUserById(Integer id, User user) {
        String updateUser = "UPDATE USERS SET name = ?, age = ?, gender = ? WHERE ID = ?";
        try {
            findById(id);

            Connection connection = ConnectionManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateUser);

            preparedStatement.setString(1 ,user.getName());
            preparedStatement.setInt(2 ,user.getAge());
            preparedStatement.setString(3 ,user.getGender().toString());
            preparedStatement.setInt(4 , id);

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
