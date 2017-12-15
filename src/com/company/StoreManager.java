package com.company;


import java.util.Random;

public class StoreManager extends employee {
    private final double rate = 20.45;


    public StoreManager(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);
    }

    public void getClearance() {
        System.out.println("you do not have upper level administrative clearance.");
    }

    public void getposition() {
        String[] position = new String[]{"Pikesville store", "Towson store", "Hunts Valley store", "Owings Mills Store"};
        int index = (new Random()).nextInt(position.length);
        String job = position[index];
        System.out.println(getFirstName() + " is the manager at the " + job);
    }

    public double returnRate() {
        return rate;
    }
}
