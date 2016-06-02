/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheet;

import java.util.Scanner;

/**
 *
 * @author Annoyin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;

        String[] sub = {"English", "Nepali", "Science"};
        double[] marks = new double[sub.length];
        while (true) {
            System.out.print("Enter Students Name\t");
            String x = input.next();
            System.out.print("Enter Students Symbol No.\t");
            String y = input.next();

            System.out.println("Enter marks for following:");
            for (i = 0; i < sub.length; i++) {
                System.out.print(sub[i] + "=");
                marks[i] = input.nextDouble();
            }
            System.out.println(".............................");
            System.out.println("\nRESULT");
            System.out.println(".............................");
            System.out.println("Name:\t\t" + x);
            System.out.println("Symbol no.:\t" + y);
            System.out.println(".............................");
            System.out.println("Marksheet");
            System.out.println(".............................");
            for (i = 0; i < sub.length; i++) {
                System.out.print(sub[i] + "\t\t");
                System.out.println(marks[i]);

            }

            boolean pass = true;
            for (i = 0; i < sub.length; i++) {
                if (marks[i] < 32) {
                    pass = false;
                    System.out.println("FAILED");
                    break;

                }
                double total = 0;
                if (pass) {
                    for (i = 0; i < sub.length; i++) {
                        total += marks[i];
                    }
                    double percent = total / sub.length;
                    String Division = null;
                    if (percent >= 80) {
                        Division = "DISTINCTION";
                    } else if (percent
                            >= 60) {
                        Division = "FIRST DIVISION";
                    } else if (percent >= 40) {
                        Division = "SECOND DIVISION";
                    } else {
                        Division = "THIRD DIVISION";
                    }
                    System.out.println(".............................");
                    System.out.println("Total" + "\t" + "\t" + total);
                    System.out.println("Percentage" + "\t" + percent);
                    System.out.println("Division" + "\t" + Division);
                    System.out.println(".............................");
                }

            }

            System.out.println("Continue..[Y/N]");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }

    }
}