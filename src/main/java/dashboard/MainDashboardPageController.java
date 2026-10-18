package dashboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class MainDashboardPageController {

    Stage addStudentPage = new Stage();
    @FXML
    private TableColumn<?, ?> colCourse;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colStudentId;

    @FXML
    private TableColumn<?, ?> colStudentName;

    @FXML
    private Label lblCurrentTime;

    @FXML
    private Label lblDbmsMarks;

    @FXML
    private Label lblGreeting;

    @FXML
    private Label lblPrfMarks;

    @FXML
    private Label lblTotalStudents;

    @FXML
    private Label lblTotalSubjects;

    @FXML
    private TableView<?> tblRecentStudents;

    @FXML
    void addMarksOnAction(ActionEvent event) {

    }

    @FXML
    void addStudentOnAction(ActionEvent event) {
        try {
            addStudentPage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/add_student_page.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        addStudentPage.show();
    }

    @FXML
    void dashboardOnAction(ActionEvent event) {

    }

    @FXML
    void deleteStudentOnAction(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

    @FXML
    void manageSubjectsOnAction(ActionEvent event) {

    }

    @FXML
    void updateStudentOnAction(ActionEvent event) {

    }

    @FXML
    void viewStudentsOnAction(ActionEvent event) {

    }


}
