package Login;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Logincontroller {

    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_management_system_v1",
                    "root",
                    "12345");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checknameandpassword(String name, String password) {

        String SQL ="SELECT * FROM users";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String dbUsername = resultSet.getString("username");
                String dbPassword = resultSet.getString("password");

                if (name.equals(dbUsername) && password.equals(dbPassword)){
                    return true;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
