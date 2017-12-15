package com.company;

import java.util.Random;

public class Register extends employee {
    private final double rate = 10.75;


    public Register(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);
    }


    public void getposition() {
        String[] position = new String[]{"Pikesville store", "Towson store", "Hunts Valley store", "Owings Mills Store"};
        int index = (new Random()).nextInt(position.length);
        String job = position[index];
        System.out.println(getFirstName() + " Works the register at " + job);
    }

    public void getClearance() {
        System.out.println("you do not have upper level administrative clearance.");
    }

    public double returnRate() {
        return rate;
    }
}
