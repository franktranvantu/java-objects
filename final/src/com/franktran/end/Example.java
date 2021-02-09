package com.franktran.end;

public class Example {

    public static void main(String[] args) {
        System.out.println("We are making a new Pez Dispenser");
        System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");
        System.out.printf("The dispenser is %s", dispenser.getName());
    }
}
