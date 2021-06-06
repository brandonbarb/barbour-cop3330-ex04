/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input.next();
        System.out.print("Enter an adjective: ");
        String adj = input.next();
        System.out.print("Enter an adverb: ");
        String adv = input.next();
        System.out.print("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}
