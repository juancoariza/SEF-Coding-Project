package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class iCFLoginMainController {

    @FXML
    private AnchorPane mainLoginScreen;

    @FXML
    private PasswordField mainPasswordInfo;

    @FXML
    private Button loginButton;

    @FXML
    public void signInButtonClicked() throws Exception
    {
//Here I want call the new Scene(SignInGUI.fxml) in my old Stage
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("iCodeFitMainOptions.fxml"));


    }


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
    public void newUserLogin(ActionEvent event) throws IOException {

        Parent iCFMainMenuParent = FXMLLoader.load(getClass().getResource("iCodeFitLogin1stTime.fxml"));
        Scene iCFMainMenuScene = new Scene(iCFMainMenuParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(iCFMainMenuScene);
        window.show();

    }


    public void handle(ActionEvent event){

    }

    @FXML
    private void initialize() {

    }
}
