package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import sample.testNutritionStatsDriver;

import java.net.URL;
import java.util.ResourceBundle;

public class nutritionStatsScreenController implements Initializable {

    testNutritionStatsDriver thisRun = new testNutritionStatsDriver();

    @FXML
    private LineChart<?, ?> weightLossLineGraph;

    @FXML
    private PieChart macronutrientPieChart;

    @FXML
    private Label currWeightStatLabel;

    @FXML
    private Label currWeightGoalStatLabel;

    @FXML
    private Label lastWorkoutStatLabel;

    @FXML
    private Label lastMealStatLabel;

    @FXML
    private Label currWeightVal;

    @FXML
    private Label currWeightGoalVal;

    @FXML
    private Label lastWorkoutVal;

    /* The method currently reads values from a driver class. This will be replaced with an User class */

    public void generalLabelSettings() {

        currWeightVal.setText(Double.toString(thisRun.getUserCurrWeight()));
        currWeightGoalVal.setText(Double.toString(thisRun.getUserGoalWeight()));
        lastWorkoutVal.setWrapText(true);
        lastWorkoutVal.setText(thisRun.getUserLastWorkout());


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        generalLabelSettings();

    }
}
