package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;


public class iCFLoginMainController implements Initializable {

    /* Elements of the GUI screen*/

    @FXML
    private AnchorPane mainLoginScreen;

    @FXML
    private PasswordField PasswordInfo;

    @FXML
    private Button loginButton;

    @FXML
    private Button signupButton;

    @FXML
    private Label mainPasswordLabel;

    @FXML
    private Label mainUsernameLabel;

    @FXML
    private Label existingUsernameErrorMSG;

    @FXML
    private Label existingPasswordErrorMSG;

    @FXML
    private TextField UsernameInfo;

    @FXML
    private Label welcomeText;

    @FXML
    private Label hook;


    /* Methods related to screen input checker */
    public static boolean isValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public boolean checkExistingEmailProperty(TextField mainUsernameInfo) {

        boolean correctEmail;
        if (isValid(mainUsernameInfo.getText())) {
            existingUsernameErrorMSG.setVisible(false);
            correctEmail = true;
            //once the email is validated as a proper email, check its existence in the database

        } else {
            existingUsernameErrorMSG.setVisible(true);
            correctEmail = false;

        }

        return correctEmail;
    }

    public boolean checkPasswordLength(PasswordField mainPasswordInfo) {

        boolean correctLength;
        if (mainPasswordInfo.getLength() < 8) {
            existingPasswordErrorMSG.setVisible(true);
            correctLength = false;

        } else {
            existingPasswordErrorMSG.setVisible(false);
            correctLength = true;
        }

        return correctLength;
    }


    /* methods related to button action methods */
    public void handleNewAccountActions() throws IOException {
        signupButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // on the user's click of the "sign up" button, the program will redirect the user to account creation
                // screen
                //Stage stage = Main.getPrimaryStage();




            }
        });

    }

    public void handleLoginActions() {
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // on the user's click of the "Create account" button, the program will check
                // if the email provided exists in the database, provide error handling. It also does this for
                // the password (input > 8 characters, existing in the database
                checkExistingEmailProperty(UsernameInfo);
                checkPasswordLength(PasswordInfo);

            }
        });

    }

    /* Method used to switch screens */
    public void switchToMainMenu(ActionEvent event) throws IOException {

        Parent mainMenuParent = FXMLLoader.load(getClass().getResource("Screens/iCodeFitMainOptions.fxml"));
        Scene mainMenuScreen = new Scene(mainMenuParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(mainMenuScreen);
        window.show();

    }



    /* screen start-up constants*/
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        existingUsernameErrorMSG.setVisible(false);
        existingPasswordErrorMSG.setVisible(false);
        handleLoginActions();
        //handleNewAccountActions();
        if () {
            switchToMainMenu(loginButton.setOnAction());
        }

    }

}
