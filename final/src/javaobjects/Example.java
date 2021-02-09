package javaobjects;

public class Example {

    public static void main(String[] args) {
        System.out.println("We are making a new Pez Dispenser");
        PezDispenser dispenser = new PezDispenser();
        System.out.printf("The dispenser is %s", dispenser.name);
    }
}
