package com.franktran.end;

/**
 * @author frank.tran
 */
public class Example {

    public static void main(String[] args) {
        System.out.println("We are making a new Pez Dispenser");
        PezDispenser dispenser = new PezDispenser("Donatello");
        System.out.printf("The dispenser is %s", dispenser.getName());
    }
}
