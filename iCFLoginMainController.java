package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class iCFLoginMainController {

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

    @FXML
    private void initialize() {

    }

    @FXML
    private void acceptLogin() {

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }

}
