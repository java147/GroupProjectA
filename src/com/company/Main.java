package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static employee setter() {
        //static method #20
        Scanner input = new Scanner(System.in);
        //scanner class #1
        System.out.print("Enter your first name: ");
        String firstname = input.next();
        System.out.print("Enter your last name: ");
        String lastname = input.next();
        System.out.print("Enter your gender: ");
        String gender = input.next();
        gender = gender.toLowerCase();
        if (!gender.equals("male") && !gender.equals("female")) {
            do {
                System.out.println("Invalid, enter either male or female: ");
                gender = input.next();
            } while (!gender.equals("male") && !gender.equals("female"));
            //loop #8
        }

        byte count = 1;
        //variable #2
        employee emp = new employee(firstname, lastname, gender, count);
        // created object #13
        System.out.println("------------------------");


        return emp;
    }

    public static void main(String[] args)
    {

        int random = (int )(Math. random() * 4 + 1);

        employee emp = setter();
        emp.getID();


        switch (random){
            //switch statement #3
            case 1:
                Register reg = new Register(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                reg.getposition();
                reg.getClearance();
                System.out.println("Hourly pay rate is: " + reg.returnRate());
                System.out.println("------------------------");
                Deduction tax = new Deduction(reg.returnRate());
                tax.deductions();
                break;
            case 2:
                StoreManager sm = new StoreManager(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                sm.getposition();
                sm.getClearance();
                System.out.println("Hourly pay rate is: " + sm.returnRate());
                System.out.println("------------------------");
                Deduction tax2 = new Deduction(sm.returnRate());
                tax2.deductions();
                break;
            case 3:
                BranchManager bm = new BranchManager(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                bm.getposition();
                bm.getClearance();
                System.out.println("Hourly pay rate is: " + bm.returnRate());
                System.out.println("------------------------");
                Deduction tax3 = new Deduction(bm.returnRate());
                tax3.deductions();
                break;
            case 4:
                ExecutiveVP vp = new ExecutiveVP(emp.getFirstName(), emp.getLastName(), emp.getGender(), 1);
                vp.getposition();
                vp.getClearance();
                System.out.println("Hourly pay rate is: " + vp.returnRate());
                System.out.println("------------------------");
                Deduction tax4 = new Deduction(vp.returnRate());
                tax4.deductions();
                break;
            default:

                break;
        }







    }





}
