package com.company;

import java.util.Random;

// java library class #19

public class ExecutiveVP extends employee {
    //inheritance #17
    private final double rate = 500.00;
    //private modifiers #22


    public ExecutiveVP(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);
        //super #15

    }

    public void getposition() {
        //encapsulation #18
        String[] position = new String[]{"Financing", "Produce", "international brick and mortar", "USA brick and mortar"};
        //array #11
        int index = (new Random()).nextInt(position.length);
        String job = position[index];
        System.out.println(getFirstName() + " is Executive VP of " + job);
        //print method #23
    }

    public void getClearance() {
        System.out.println("you have upper level administrative clearance.");
    }

    public double returnRate() {
        return rate;
    }
    //Return value #9
}
