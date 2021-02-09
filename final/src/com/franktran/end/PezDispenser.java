package com.franktran.end;

public class PezDispenser {

    public static final int MAX_PEZ = 12;
    final private String name;
    private int pezCount;

    public PezDispenser(String name) {
        this.name = name;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public String getName() {
        return name;
    }
}
