package com.company;

// 6 classes #12
public class employee implements Person {

    private String Fname, Lname, ID, gender, position;
    //String class #6
    private double rate;

    public employee(String firstname, String Lastname, String Gender, int count)
    //constructor #14
    {

        this.Fname = firstname;
        //this keyword #21
        this.Lname = Lastname;
        this.gender = Gender;
        if (this.Fname.length() > 1 || this.Lname.length() > 1 || this.gender.length() > 1)
        //conditional operator #4
        // operators #5
        {
            this.ID = this.Fname.charAt(0) + this.Lname.charAt(0) + "umbc" + this.gender.toUpperCase().charAt(0) + count;
        } else {
            System.out.println("Missing name or gender, ID set to default 0");
            this.ID = "0";
        }
    }

    public employee()
    //method overloading with default constructor #10
    {

        this.Fname = "blank";
        this.Lname = "blank";
        this.gender = "blank";
        int ID = 00000;
    }

    public double returnRate() {
        return rate;
    }

    public boolean hasBenefit() {
        return false;
    }

    public boolean haspension() {
        return false;
    }

    public void getID() {
        System.out.println(this.Fname + " " + this.Lname + "'s" + " ID number is " + this.ID);
    }

    @Override
    public String getFirstName() {
        return Fname;
    }

    @Override
    public String getLastName() {
        return Lname;
    }

    @Override
    public String getGender() {
        return gender;
    }


}