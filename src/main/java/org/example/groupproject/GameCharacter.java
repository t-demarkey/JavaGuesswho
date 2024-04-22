/**
 * Names: Ethan Driggers, Levi Sessions, Simon Yang, Hannah Thomas
 * Date: 4/10/2024
 * Assignment: Group Project
 */


package org.example.groupproject;

import javafx.scene.image.Image;

/**
 * GameCharacter Class helps create characters for Guess Who
 */
public class GameCharacter {

    // Initializes the name variable as a String
    private String name;

    // Initializes the glasses variable as a boolean
    private boolean glasses;

    // Initializes the isMale variable as a boolean
    private boolean isMale;

    // Initializes the haircolor variable as a String
    private String hairColor;

    // Initializes the hairlength variable as a String
    private String hairLength;

    // Initializes the eyecolor variable as a String
    private String eyeColor;

    private Image charImage;

    public GameCharacter(String name, boolean glasses, Boolean isMale, String hairColor,
                         String hairLength, String eyeColor) {
        this.name = name;
        this.glasses = glasses;
        this.isMale = isMale;
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.eyeColor = eyeColor;
        this.charImage = new Image("file:src/main/resources/Images/" + this.name + ".png");
    }


    // Getters
    public String getName() {
        return name;
    }

    public boolean getGlasses() {
        return glasses;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getHairLength() {
        return hairLength;
    }

    public Image getCharImage() {
        return this.charImage;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //toString method that converts the line into a readable form
    @Override
    public String toString() {
        return String.format("GameCharacter: %s", name);
    }

}
