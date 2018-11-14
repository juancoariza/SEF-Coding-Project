package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

public class nutritionStatsScreenController {

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

    @FXML
    private Label lastMealVal;

}
