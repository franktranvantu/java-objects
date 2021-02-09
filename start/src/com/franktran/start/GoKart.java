//1. First, define a public constructor that expects a String argument named color.
//2. Now in the body of your constructor, set the private field color to the value of
//the color argument passed into the constructor.
//3. Finally, since the color is being set in the constructor now, remove the initialization
//from the field definition. Just leave it declared, but not initialized to "red".

package com.franktran.start;

public class GoKart {

    private String color = "red";

    public String getColor() {
        return color;
    }
}
