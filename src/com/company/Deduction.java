package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Deduction {


    double hours;

    double stateTax;

    double federalTax;

    double wage;

    Scanner user = new Scanner(System.in);

    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
    //math class #7


    //Display Constructor
    public Deduction(double wages) {

        System.out.print("Enter hours worked this week");
        hours = user.nextDouble();

        wage = wages;
    }


    //Constructors with arguement
    public Deduction(double stax, double ftax) {
        stateTax = stax;

        federalTax = ftax;

    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    //Pay for hours worked with deductions included
    public void deductions() {

        // register
        if (wage == 10.75) {
            stateTax = 0.0475;
            federalTax = 0.15;


            double payWithoutD = wage * hours;
            double stateTaxDed = payWithoutD * stateTax;
            double federalTaxDed = payWithoutD * federalTax;

            double grossPay = payWithoutD - (stateTaxDed + federalTaxDed);

            System.out.println("The total net pay is : " + defaultFormat.format(payWithoutD));
            System.out.println("The State tax deduction is : " + defaultFormat.format(stateTaxDed));
            System.out.println("The Federal tax deduction is : " + defaultFormat.format(federalTaxDed));
            System.out.println("The total gross pay is : " + defaultFormat.format(grossPay));

        }

        //store Manager
        else if (wage == 20.45) {
            stateTax = 0.0475;
            federalTax = 0.15;

            double payWithoutD2 = wage * hours;
            double stateTaxDed2 = stateTax * payWithoutD2;
            double federalTaxDed2 = federalTax * payWithoutD2;
            double grossPay2 = payWithoutD2 - (stateTaxDed2 + federalTaxDed2);


            System.out.println("The total net pay is : " + defaultFormat.format(payWithoutD2));
            System.out.println("The State tax deduction is : " + defaultFormat.format(stateTaxDed2));
            System.out.println("The Federal tax deduction is : " + defaultFormat.format(federalTaxDed2));
            System.out.println("the total gross pay is: " + defaultFormat.format(grossPay2));
        }

        //branch manager
        else if (wage == 40.87) {
            stateTax = 0.0575;
            federalTax = 0.20;


            double payWithoutD3 = wage * hours;
            double stateTaxDed3 = payWithoutD3 * stateTax;
            double federalTaxDed3 = payWithoutD3 * federalTax;

            double grossPay3 = payWithoutD3 - (stateTaxDed3 + federalTaxDed3);


            System.out.println("The total net pay is : " + defaultFormat.format(payWithoutD3));
            System.out.println("The State tax deduction is : " + defaultFormat.format(stateTaxDed3));
            System.out.println("The Federal tax deduction is : " + defaultFormat.format(federalTaxDed3));
            System.out.println("The total gross pay is : " + defaultFormat.format(grossPay3));
        }


        //Vp
        else if (wage == 500) {
            stateTax = 0.0575;
            federalTax = 0.15;

            double payWithoutD4 = wage * hours;

            double stateTaxDed4 = payWithoutD4 * stateTax;
            double federalTaxDed4 = payWithoutD4 * federalTax;

            double grossPay4 = payWithoutD4 - (stateTaxDed4 + federalTaxDed4);


            System.out.println("The total net pay is : " + defaultFormat.format(payWithoutD4));
            System.out.println("The State tax deduction is : " + defaultFormat.format(stateTaxDed4));
            System.out.println("The Federal tax deduction is : " + defaultFormat.format(federalTaxDed4));
            System.out.println("The total gross pay is : " + defaultFormat.format(grossPay4));


        } else
            System.out.print("Error: Invalid Entry! ");

    }
}
