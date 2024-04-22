package org.example.groupproject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GameManager {

    private final ArrayList<GameCharacter> characters;
    private final GameCharacter selectedCharacter;

    public GameManager() {
        // Randomly selects the 10 characters and chooses one to be the 'correct' character
        characters = getRandomCharacters();
        selectedCharacter = correctCharacter(characters);

        // For testing use only
        // System.out.println(selectedCharacter.getName());
    }

    /**
     * Gets the selected/'correct' character
     *
     * @return GameCharacter object of 'correct' character
     */
    public GameCharacter getSelectedCharacter() {
        return selectedCharacter;
    }

    /**
     * Gets the list of characters in current instance of game
     *
     * @return ArrayList<GameCharacter> object containing list of characters
     */
    public ArrayList<GameCharacter> getCharacters() {
        return characters;
    }

    /**
     * Helper function for retrieving the character object using String name
     *
     * @param name: String that can be used to get the character
     * @return GameCharacter object of given character
     */
    public GameCharacter getCharacter(String name) {
        for (GameCharacter character : characters) {
            if (character.getName().equals(name)) {
                return character;
            }
        }
        return null;
    }

    /**
     * Returns String array of questions that can be asked during a game
     * @return String array of questions
     */
    public String[] getQuestions() {
        return new String[]{"Does the character have glasses?",
                "Does the character have black hair?",
                "Does the character have white hair?",
                "Does the character have brown hair?",
                "Does the character have blonde hair?",
                "Does the character have red hair?",
                "Is the character a man?",
                "Is the character a woman?",
                "Does the character have short hair?",
                "Does the character have medium hair?",
                "Does the character have long hair?",
                "Is the character bald?"};
    }

    /**
     * Randomly chooses a character to serve as the "correct" guessed character
     *
     * @param characters: Array of GameCharacters objects
     * @return random GameCharacter object from array
     */
    private GameCharacter correctCharacter(ArrayList<GameCharacter> characters) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(characters.size());
        return characters.get(randomIndex);
    }

    /**
     * Helper function for initializing characters included in a game. Returns an ArrayList containing 10 randomly chosen
     * GameCharacter objects obtained from initCharacters() function
     * @return ArrayList<GameCharacter> containing 10 GameCharacter objects </GameCharacter>
     */
    private ArrayList<GameCharacter> getRandomCharacters() {

        ArrayList<GameCharacter> characters = initCharacters();
        ArrayList<GameCharacter> newlist = new ArrayList<>();
        for (int counter = 0; counter < 10; counter++) {
            int characterChoice = (int) (Math.random() * (characters.size()));
            newlist.add(characters.get(characterChoice));
            characters.remove(characterChoice);
        }

        return newlist;
    }
    /**
     * Helper function to initialize an ArrayList of all possible characters that can be selected to be in a game
     * @return ArrayList</GameCharacter> containing all possible Guess Who characters
     */
    private ArrayList<GameCharacter> initCharacters() {
        GameCharacter alex = new GameCharacter("Alex", false, true, "black", "short", "brown");
        GameCharacter alfred = new GameCharacter("Alfred", false, true, "red", "short", "blue");
        GameCharacter anita = new GameCharacter("Anita", false, false, "white", "medium", "blue");
        GameCharacter anne = new GameCharacter("Anne", false, false, "black", "medium", "brown");
        GameCharacter bernard = new GameCharacter("Bernard", false, true, "brown", "medium", "brown");
        GameCharacter bill = new GameCharacter("Bill", false, true, "red", "bald", "brown");
        GameCharacter charles = new GameCharacter("Charles", true, true, "black", "short", "green");
        GameCharacter claire = new GameCharacter("Claire", true, false, "red", "long", "blue");
        GameCharacter david = new GameCharacter("David", false, true, "blonde", "medium", "brown");
        GameCharacter eric = new GameCharacter("Eric", false, true, "blonde", "short", "brown");
        GameCharacter herman = new GameCharacter("Herman", false, true, "red", "bald", "brown");
        GameCharacter frans = new GameCharacter("Frans", false, true, "red", "short", "brown");
        GameCharacter george = new GameCharacter("George", false, true, "white", "short", "brown");
        GameCharacter joe = new GameCharacter("Joe", true, true, "blonde", "short", "brown");
        GameCharacter maria = new GameCharacter("Maria", false, false, "brown", "long", "brown");
        GameCharacter max = new GameCharacter("Max", false, true, "brown", "short", "brown");
        GameCharacter paul = new GameCharacter("Paul", true, true, "white", "short", "brown");
        GameCharacter peter = new GameCharacter("Peter", false, true, "white", "medium", "blue");
        GameCharacter phillip = new GameCharacter("Philip", false, true, "black", "short", "brown");
        GameCharacter richard = new GameCharacter("Richard", false, true, "brown", "bald", "brown");

        ArrayList<GameCharacter> characters = new ArrayList<>(Arrays.asList(alex, alfred, anita, anne, bill, bernard, claire, charles, david, eric,
                frans, george, herman, joe, maria, max, paul, peter, phillip, richard));
        return characters;
    }


}
