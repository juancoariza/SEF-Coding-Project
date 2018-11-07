/*
 * File: User.java
 * Purpose: Creates an User abstract class for all users to create their profile options
 */
 
 // the following class selects the pre-loaded workout set based on the trainers provided by the
 // program, defaulting to a do-it-yourself apprach (no trainer select) if no trainers are chosen.
 
 abstract public class User extends TrainerType {
	 
	  // This trainer choice is determined by the user's button press from the GUI screen 
	  // "iCodeFitLogin1stTime.FXML", which is connected to an enumerator
	  // in essence, the button is an emulation of a basic command prompt menu, replacing 
	  // key inputs with button clicks
	  
	 TrainerType trainerChoice;	// declares enum to be used for button press
	  
	 public void setTrainerChoice(Button iCodeFitLogin1stTime.button) {
		 
		 
	 } 
	 
	 public boolean loadTrainer(int trainerChoice) {
		 
		 switch (trainerChoice) {
			 
			 case TrainerType.TRAINER1:
				System.out.println("Trainer 1 Chosen.\n");
			 break;
			 
			 case TrainerType.TRAINER2:
				System.out.println("Trainer 2 Chosen.\n");
			 break;
			 
			 case TrainerType.TRAINER3:
				System.out.println("Trainer 3 Chosen.\n");
			 break;
			 
			 case TrainerType.TRAINER4:
				System.out.println("Trainer 4 Chosen.\n");
			 break;
			 
			 default:
				System.out.println("No trainer chosen. Beginning do-it-yourself protocol...\n");
							 
		 } 
	 }
}