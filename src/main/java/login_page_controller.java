import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class login_page_controller {

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtname;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void loginOnAction(ActionEvent event) {
    String name=txtname.getText();
    String password=txtpassword.getText();

    boolean b=nameandpasswordcheck(name,password);
        System.out.println(b);
    }
    private boolean nameandpasswordcheck(String name, String password) {
        if(name.equals("githmi") && password.equals("1234")){
            return true;

        }
    return  false;
    }
}
