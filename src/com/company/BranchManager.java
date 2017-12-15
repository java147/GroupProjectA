package com.company;


import java.util.Random;

public class BranchManager extends employee {
    private final double rate = 40.87;


    public BranchManager(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);

    }

    public void getposition() {
        String[] position = new String[]{"Maryland branch", "Virginia branch", "Texas branch", "Florida branch"};
        int index = (new Random()).nextInt(position.length);
        String job = position[index];
        System.out.println(getFirstName() + " is the manager of the " + job + " stores. ");
    }

    public void getClearance() {
        System.out.println("you have upper level administrative clearance.");
    }

    public double returnRate() {
        return rate;
    }
}