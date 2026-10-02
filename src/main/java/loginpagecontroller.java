import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginpagecontroller {

    Logincontroller logincontroller=new Logincontroller();


    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtname;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void loginOnAction(ActionEvent event) {


        if(logincontroller.nameandpasswordcheck(txtname.getText(),txtpassword.getText())){
            Stage stage=new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/home_page.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }else {
            Stage stage=new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/invalid_data.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }

}
