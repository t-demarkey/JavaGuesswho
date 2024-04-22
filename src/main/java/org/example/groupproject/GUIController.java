package org.example.groupproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class GUIController {

    private int guesscount; // Count for max num of guesses
    private int questioncount; // Count for max num of questions
    private GameManager manager;

    @FXML
    private TextArea answerText;

    @FXML
    private GridPane backroundGrid;

    @FXML
    private ComboBox<String> guessDropDown;
    @FXML
    private ComboBox<String> questionDropDown;

    //images for later
    @FXML
    private Image originalImage1;
    @FXML
    private Image originalImage2;
    @FXML
    private Image originalImage3;
    @FXML
    private Image originalImage4;
    @FXML
    private Image originalImage5;
    @FXML
    private Image originalImage6;
    @FXML
    private Image originalImage7;
    @FXML
    private Image originalImage8;
    @FXML
    private Image originalImage9;
    @FXML
    private Image originalImage10;

    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;
    @FXML
    private ImageView image9;
    @FXML
    private ImageView image10;

    @FXML
    private Button char1;
    @FXML
    private Button char2;
    @FXML
    private Button char3;
    @FXML
    private Button char4;
    @FXML
    private Button char5;
    @FXML
    private Button char6;
    @FXML
    private Button char7;
    @FXML
    private Button char8;
    @FXML
    private Button char9;
    @FXML
    private Button char10;
    @FXML
    private Button guessButton;
    @FXML
    private Button askQuestionButton;
    @FXML
    private Button startButton;


    @FXML
    private void onChar1Click() {
        Image currentImage = image1.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage1)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image1.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image1.setImage(originalImage1);
        }
    }
    @FXML
    private void onChar2Click() {
        Image currentImage = image2.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage2)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image2.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image2.setImage(originalImage2);
        }
    }
    @FXML
    private void onChar3Click() {
        Image currentImage = image3.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage3)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image3.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image3.setImage(originalImage3);
        }
    }
    @FXML
    private void onChar4Click() {
        Image currentImage = image4.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage4)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image4.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image4.setImage(originalImage4);
        }
    }
    @FXML
    private void onChar5Click() {
        Image currentImage = image5.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage5)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image5.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image5.setImage(originalImage5);
        }
    }
    @FXML
    private void onChar6Click() {
        Image currentImage = image6.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage6)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image6.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image6.setImage(originalImage6);
        }
    }
    @FXML
    private void onChar7Click() {
        Image currentImage = image7.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage7)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image7.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image7.setImage(originalImage7);
        }
    }
    @FXML
    private void onChar8Click() {
        Image currentImage = image8.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage8)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image8.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image8.setImage(originalImage8);
        }
    }
    @FXML
    private void onChar9Click() {
        Image currentImage = image9.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage9)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image9.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image9.setImage(originalImage9);
        }
    }
    @FXML
    private void onChar10Click() {
        Image currentImage = image10.getImage();

        // Check if the  image is the original image
        if (currentImage.equals(originalImage10)) {
            // If it is original switch to our blank image
            String blankImagePath = "src/main/resources/Images/Blank.png";
            Image blankImage = new Image("file:" + blankImagePath);
            image10.setImage(blankImage);
        } else {
            // if it is blank set to the original
            image10.setImage(originalImage10);
        }
    }

    /**
     * Executed when the 'Guess Button' GUI button is pressed. Compares the currently selected value in the guess drop
     * down to the correct character
     */
    @FXML
    private void onGuessClick() {
        GameCharacter guess = manager.getCharacter(guessDropDown.getValue()); // Get GameCharacter object from string value provided by dropdown menu
        if (guesscount < 3) { // If user still has guesses
            if (manager.getSelectedCharacter().equals(guess)) { // If guess is correct
                // Create and format alert box
                Alert winMessage = new Alert(Alert.AlertType.INFORMATION);
                winMessage.setTitle("Win!");
                winMessage.setContentText("You guessed who correctly!");
                winMessage.showAndWait();
            } else { // If guess is incorrect
                guesscount = guesscount + 1; // Add to our counter for a max of 3
                guessDropDown.getItems().remove(guessDropDown.getValue()); // Remove item from box
                // Create and format alert box
                Alert wrongMessage = new Alert(Alert.AlertType.INFORMATION);
                wrongMessage.setTitle("Wrong!");
                wrongMessage.setContentText("Guess again; " + (3 - guesscount) + " guesses remaining");
                wrongMessage.showAndWait();

            }
        }
        if (guesscount == 3) { // If the user just used their last guess
            // Create and format alert box
            Alert gameOverMessage = new Alert(Alert.AlertType.INFORMATION);
            gameOverMessage.setTitle("Game over!");
            gameOverMessage.setContentText("Please hit Start Game to play again \n" + " Correct guess:" + guess);
            gameOverMessage.showAndWait();
        }
    }

    /**
     * Executed when the 'Ask Question' GUI button is pressed. Compares the currently selected value in the question drop
     * down to the correct characters traits
     */
    @FXML
    private void onAskQuestionClick() {
        if (questioncount == 5) return; // If the user has already asked all five questions, don't do anything

        // Get the question and find the index value of it in the GameManager question list (doesn't change like the dropdown list does)
        String question = questionDropDown.getValue();
        int questionidx = -1;
        for (int x = 0; x < manager.getQuestions().length; x++) {
            if (manager.getQuestions()[x] == question) {
                questionidx = x;
            }
        }
        // Compare question with the correct character's trait given the index of the question
        switch (questionidx) {

            case 0:
                if (manager.getSelectedCharacter().getGlasses()) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 1:
                if (manager.getSelectedCharacter().getHairColor().equalsIgnoreCase("black")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 2:
                if (manager.getSelectedCharacter().getHairColor().equalsIgnoreCase("white")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 3:
                if (manager.getSelectedCharacter().getHairColor().equalsIgnoreCase("brown")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 4:
                if (manager.getSelectedCharacter().getHairColor().equalsIgnoreCase("blonde")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 5:
                if (manager.getSelectedCharacter().getHairColor().equalsIgnoreCase("red")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 6:
                if (manager.getSelectedCharacter().getIsMale()) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 7:
                if (!manager.getSelectedCharacter().getIsMale()) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 8:
                if (manager.getSelectedCharacter().getHairLength().equalsIgnoreCase("short")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 9:
                if (manager.getSelectedCharacter().getHairLength().equalsIgnoreCase("medium")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 10:
                if (manager.getSelectedCharacter().getHairLength().equalsIgnoreCase("long")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            case 11:
                if (manager.getSelectedCharacter().getHairLength().equalsIgnoreCase("bald")) {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " Yes\n");
                } else {
                    answerText.setText(answerText.getText() + (questioncount + 1) + ") " + question + " No\n");
                }
                break;
            default:
                System.out.println("Something went wrong asking question!");
                break;
        }
        questionDropDown.getItems().remove(question);  // Remove the question after its asked
        questioncount += 1; // Add one to question count
        if (questioncount == 5) { // Check if max number of questions is reached now
            answerText.setText(answerText.getText() + "Max questions asked! Try to Guess Who!");
            questionDropDown.getItems().remove(0, questionDropDown.getItems().size());
        }

    }
    /**
     * Executed when the 'Start Game' GUI button is pressed. Starts the game activities and allows a max
     * of 3 guesses per game.
     */
    @FXML
    private void onStartButtonClick() {

        // Set question/guess counters to 0 and initialize new GameManager
        guesscount = 0;
        questioncount = 0;
        manager = new GameManager();

        ArrayList<GameCharacter> characters = manager.getCharacters();

        // Clear GUI elements of previous data
        guessDropDown.getItems().clear();
        questionDropDown.getItems().clear();
        answerText.clear();

        // Add all the questions to the combo box
        questionDropDown.getItems().addAll(
                manager.getQuestions()
        );

        // Iterate through indexes of character list, puts character name in guessDropDown, and sets images appropriately
        for (int i = 0; i < characters.size(); i++) {
            GameCharacter character = characters.get(i);
            String characterName = character.getName();

            // Add character name to the ComboBox
            guessDropDown.getItems().add(characterName);

            Image image = character.getCharImage(); // Find our images in resources and add .png to the end of the char name
            // Set images
            switch (i) { // Change the image to the characters image
                case 0:
                    originalImage1 = image;
                    image1.setImage(image);
                    break;
                case 1:
                    originalImage2 = image;
                    image2.setImage(image);
                    break;
                case 2:
                    originalImage3 = image;
                    image3.setImage(image);
                    break;
                case 3:
                    originalImage4 = image;
                    image4.setImage(image);
                    break;
                case 4:
                    originalImage5 = image;
                    image5.setImage(image);
                    break;
                case 5:
                    originalImage6 = image;
                    image6.setImage(image);
                    break;
                case 6:
                    originalImage7 = image;
                    image7.setImage(image);
                    break;
                case 7:
                    originalImage8 = image;
                    image8.setImage(image);
                    break;
                case 8:
                    originalImage9 = image;
                    image9.setImage(image);
                    break;
                case 9:
                    originalImage10 = image;
                    image10.setImage(image);
                    break;
                default:
                    break;
            }
        }
    }

}