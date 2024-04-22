package org.example.groupproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


public class GuessWhoGroupProject extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Loads the FXML file and displays a popup for game instructions
     * @param stage: GUI from SceneBuilder
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Guess Who");
        stage.setScene(scene);
        stage.show();
        // Popup window displaying the instructions for the game
        Alert instructions = new Alert(Alert.AlertType.INFORMATION);
        instructions.setTitle("Welcome to Guess Who!");
        instructions.setContentText("Instructions: You may ask 5 questions to find out the mystery character. You have three guesses, so use them wisely! Click on a character to mark them eliminated!");
        instructions.showAndWait();
    }


}
