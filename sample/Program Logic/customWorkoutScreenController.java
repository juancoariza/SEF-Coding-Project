package sample.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class customWorkoutScreenController implements Initializable {
    ObservableList muscleList = FXCollections.observableArrayList();
    ObservableList exerciseList = FXCollections.observableArrayList();

    @FXML
    private SplitPane customWorkoutScreen;

    @FXML
    private AnchorPane workoutListGroupPane;

    @FXML
    private ListView<String> workoutListByGroup;


    public void loadGroupWorkoutList() {

        muscleList.removeAll(muscleList);
        String muscleType1 = "Chest";
        String muscleType2 = "Quads";
        String muscleType3 = "Lower Back";
        muscleList.addAll(muscleType1, muscleType2, muscleType3);

        workoutListByGroup.getItems().addAll(muscleList);
    }

    @FXML
    private AnchorPane workoutDetailPane;

    @FXML
    private ListView<?> workoutListBySpecs;

    public void loadGroupSpecsList() {

        exerciseList.removeAll(muscleList);
        String exercise1 = "Push-ups";
        String exercise2 = "Pull-ups";
        String exercise3 = "Squats";
        String exercise4 = "Sprinting";
        exerciseList.addAll(exercise1, exercise2, exercise3, exercise4);

        workoutListBySpecs.getItems().addAll(exerciseList);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // all the methods that must load "on launch" are
        // loaded in the initializable. This way, they appear to the user
        // at first glance.

        loadGroupWorkoutList();
        loadGroupSpecsList();
    }

}
