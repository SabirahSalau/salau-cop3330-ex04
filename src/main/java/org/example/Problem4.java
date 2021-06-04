/*
 *  UCF COP3330 Summer 2021 MotivatedAssignment 1 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;
import java.util.Scanner;

public class Problem4
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a noun:");
            String noun = input.next();

            System.out.println("Enter a verb:");
            String verb = input.next();

            System.out.println("Enter an adjective:");
            String adj = input.next();

            System.out.println("Enter an adverb:");
            String adv = input.next();

            System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");

        }
}
