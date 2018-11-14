package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

public class iCFLogin1stTimeController {

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
    private GridPane choice4;

    @FXML
    private Button trainer4Selected;

    @FXML
    private ImageView trainer4;

    @FXML
    private TextArea choice4Dialog;

    @FXML
    private Button noTrainerChoice;

    @FXML
    private Label subtitlePT1;

    @FXML
    private Label subtitlePT2;

    @FXML
    private void handleButtonActionTrainerSelect (ActionEvent event) throws IOException {

        // based on the button press from the five options (Trainer 1 - 4, Custom), save data will pass to respective datafiles
		// and the program will load the main program.
		
        Parent homepageParent = FXMLLoader.load(getClass().getResource("sample/Screens/iCodeFitMainOptions.fxml"));
        Scene homepageScene = new Scene(homepageParent);
        Stage newStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newStage.setScene(homepageScene);
        newStage.show();
    }
	
}
