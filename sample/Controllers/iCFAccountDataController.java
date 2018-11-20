package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class iCFAccountDataController {

    @FXML
    private AnchorPane mainLoginScreen;

    @FXML
    private ImageView background;

    @FXML
    private Button createAcctButton;

    @FXML
    private Label acctText;

    @FXML
    private Label mainNameLabel;

    @FXML
    private TextField nameCollector;

    @FXML
    private Label ageLabel;

    @FXML
    private ChoiceBox<?> userAge;

    @FXML
    private ChoiceBox<?> userSex;

    @FXML
    private TextField usernameCollector;

    @FXML
    private Label sexLabel;

    @FXML
    private Label mainUsernameLabel;

    @FXML
    private Button cancelToLoginButton;

    @FXML
    private ImageView profilePic;

    @FXML
    private Label photoLabel;

    @FXML
    private Button imageChooserButton;

}
