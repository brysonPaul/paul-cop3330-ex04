/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String noun, verb, adjective, adverb;
        noun = strIO("Enter a noun: ", sc);
        verb = strIO("Enter a verb: ", sc);
        adjective = strIO("Enter an adjective: ", sc);
        adverb = strIO("Enter an adverb: ", sc);
        String finalString = String.format("Do you %s your %s %s %s? That's hilarious!",verb,adjective,noun,adverb);
        System.out.println(finalString);
        sc.close();
    }

    public static String strIO(String input, Scanner sc) {
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}