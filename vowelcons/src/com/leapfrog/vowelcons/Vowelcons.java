/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.vowelcons;

import java.util.Scanner;

/**
 *
 * @author Annoyin
 */
public class Vowelcons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, j, consonant_count = 0, vowel_count = 0;
        String word;
        char wor;
        char[] vow = new char[]{'a', 'e', 'i', 'o', 'u'};
        String ch;
        while (true) {
            System.out.print("Enter any word:");
            word = input.nextLine();
            

            System.out.print("Vowels Contained\t");
            for (i = 0; i < word.length(); i++) {
                wor = word.charAt(i);
                if (wor == vow[i]) {
                    vowel_count++;
                    System.out.print(wor + ",");
                }
                               }
            System.out.println("");
            System.out.print("Consonant Contained\t");
            for (i = 0; i < word.length(); i++) {

                wor = word.charAt(i);
                if (wor != vow[i]) {
                    consonant_count++;
                    System.out.print(wor + ",");
                }
            }
            System.out.println("");

            System.out.println("No. of vowels=" + vowel_count);
            System.out.println("No. of consonant=" + consonant_count);

            System.out.println("Continue..[Y/N]");
            
            ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
