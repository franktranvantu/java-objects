// 1. Create a new private field named barCount that will track how many bars of energy our GoKart battery currently has.
// 2. Now create a method named charge that sets the new barCount field to the maximum amount of bars available for each GoKart.

package com.franktran.start;

public class GoKart {

    public static final int MAX_BARS = 8;
    private String color;

    public GoKart(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
