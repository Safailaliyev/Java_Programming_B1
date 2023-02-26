package day08_scanner_logical_operators;

import java.util.Scanner;

public class WorkStatus {

    /*create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean

     */



    public static void main(String[] args) {

        Scanner anything = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String firstName = anything.next();

        System.out.print( "Enter your last name: ");
        String lastName = anything.next();

        System.out.print("How are you? ");
        String felling = anything.next();

        System.out.print("What is the best team? ");
        String team = anything.next();

        System.out.print("How much are you making? ");
        String answersalary = anything.next();


        System.out.println("\nFirst name: \t" + firstName + "\nLast name:\t" + lastName);
        System.out.println("How are you: \t" +felling);
        System.out.println("Best team ever:\t"+team);
        System.out.println("How much are you making?:\t" +answersalary);







    }
}
