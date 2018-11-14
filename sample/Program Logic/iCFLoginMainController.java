package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;


public class iCFLoginMainController implements Initializable {
    @FXML
    private AnchorPane mainLoginScreen;

    @FXML
    private PasswordField mainPasswordInfo;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    @FXML
    private Label mainPasswordLabel;

    @FXML
    private Label mainUsernameLabel;

    @FXML
    private TextField mainUsernameInfo;

    @FXML
    private Label welcomeText;

    @FXML
    private Label hook;

    @Override
    public void initialize(URL url, ResourceBundle resBun) {

        // kept for future use

    }

}