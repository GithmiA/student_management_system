package student;

import java.sql.*;
import java.time.LocalDate;

public class AddStudentController {
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_management_system_v1",
                    "root",
                    "12345"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addStudent(String name, String address, String email, LocalDate dob, String batch, String nic) {

        String SQL = "INSERT INTO students(student_name,address,email,birthday,batch,nic,student_id) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setString(3,email);
            preparedStatement.setDate(4, Date.valueOf(dob));
            preparedStatement.setString(5,batch);
            preparedStatement.setString(6,nic);
            preparedStatement.setInt(7,2);


            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
