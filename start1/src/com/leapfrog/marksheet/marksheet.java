package com.leapfrog.marksheet;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Annoyin
 */
public class marksheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Students Name\t");
            String x = input.next();
            System.out.print("Enter Students Symbol No.\t");
            String y = input.next();
            System.out.println("Enter Marks for following");
            System.out.print("1.Science\t");
            double p = input.nextFloat();
            System.out.print("2.Maths\t");
            double q = input.nextFloat();
            System.out.print("3.Optional Maths\t");
            double r = input.nextFloat();
            System.out.print("4.English\t");
            double s = input.nextFloat();
            System.out.print("5.Nepali\t");
            double t = input.nextFloat();

            double total = p + q + r + s + t;
            double percent = total / 5;
            String Division = null;
            if (percent >= 80) {
                Division = "DISTINCTION";
            } else if (percent >= 60) {
                Division = "FIRST DIVISION";
            } else if (percent >= 40) {
                Division = "SECOND DIVISION";
            } else {
                Division = "THIRD DIVISION";
            }

            System.out.println("\n\n\nRESULT\n");
            System.out.println("Name:" + "\t" + "\t" + x);
            System.out.println("Symbol no:" + "\t" + y);
            System.out.println("\nMarksheet");
            System.out.println("1.Science" + "\t" + "\t" + p);
            System.out.println("2.Maths" + "\t" + "\t" + "\t" + q);
            System.out.println("3.Optional Maths" + "\t" + r);
            System.out.println("4.English" + "\t" + "\t" + s);
            System.out.println("5.Nepali" + "\t" + "\t" + t);
            System.out.println("------------------------------");
            if (percent >= 32) {
                System.out.println("Total" + "\t" + "\t" + "\t" + total);
                System.out.println("Percentage" + "\t" + "\t" + percent);
                System.out.println("Division" + "\t" + "\t" + Division);
            } else {
                System.out.println("FAILED");
            }

            System.out.println("Continue..[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
