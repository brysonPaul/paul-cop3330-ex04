/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
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
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
        sc.close();
    }

    public static String strIO(String input, Scanner sc) {
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}