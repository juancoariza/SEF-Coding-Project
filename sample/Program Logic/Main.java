package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("iCodeFitLoginMain.fxml"));
        primaryStage.setTitle("iCodeFit Systems");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}