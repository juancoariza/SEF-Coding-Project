package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class iCFLogin1stTimeController implements Initializable {

    // used for a small menu to keep track of the user's training choice
    int buttonChoice = 0;

    @FXML
    private AnchorPane backgroudMain;

    @FXML
    private Label login1stTimeMsg;

    @FXML
    private GridPane choice1;

    @FXML
    private Button trainer1Selected;

    @FXML
    private ImageView trainer1;

    @FXML
    private TextArea choice1Dialog;

    @FXML
    private GridPane choice2;

    @FXML
    private Button trainer2Selected;

    @FXML
    private ImageView trainer2;

    @FXML
    private TextArea choice2Dialog;

    @FXML
    private GridPane choice3;

    @FXML
    private Button trainer3Selected;

    @FXML
    private ImageView trainer3;

    @FXML
    private TextArea choice3Dialog;

    @FXML
    private Label subtitlePT1;

    @FXML
    private Label subtitlePT2;


    @FXML
    public void sendDataFromTrainer1() {
        ScreenManager.getInstance().switchToScreen("/Screens/iCodeFitMainOptions.fxml");

    }

    @FXML
    public void sendDataFromTrainer2() {


    }


    @FXML
    public void sendDataFromTrainer3() {


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // prevents user from re-writing data in the options' TextArea(s). They are for display only.
        choice1Dialog.setEditable(false);
        choice2Dialog.setEditable(false);
        choice3Dialog.setEditable(false);

        // save preferences from user's choice of training style into the program depending on the button choice
        switch (buttonChoice) {

            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            default:
                buttonChoice = 0;
                break;
        }
    }
}
