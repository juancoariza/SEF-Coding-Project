package sample.Controllers;

public enum screenSelection {

    //Enum used to store the relative path of the screens.
    // Cleans code presentation.

    MAIN_LOGIN {
        @Override
        public String toString() {
            return "Screens/iCodeFitLoginMain.fxml";
        }
    },

    ACCOUNT_CREATE{
        @Override
        public String toString() {
            return "Screens/iCodeFitAccountCreate.fxml";
        }
    },

    ACCOUNT_DATA{
        @Override
        public String toString() {
            return "Screens/iCodeFitAccountData.fxml";
        }
    },

    ACCOUNT_1ST{
        @Override
        public String toString() {
            return "Screens/iCodeFitLogin1stTime.fxml";
        }
    },

    MAIN_MENU{
        @Override
        public String toString() {
            return "Screens/iCodeFitMainOptions.fxml";
        }
    },

    NUTRITION_STATS{
        @Override
        public String toString() {
            return "Screens/nutritionStatsScreen.fxml";
        }
    },

    NUTRITION_TRACK{
        @Override
        public String toString() {
            return "Screens/nutritionTrackerScreen.fxml";
        }
    },

    WORKOUT_SELECT{
        @Override
        public String toString() {
            return "Screens/workoutSelectScreen.fxml";
        }
    }

}
