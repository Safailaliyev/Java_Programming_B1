package day09_b__if_statements;

import java.util.Scanner;

public class SingleIfScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Why are we studying Java?");
        String answer = input.nextLine();

        System.out.println("Is Java fun(true or false)?");
        boolean answer2 = input.nextBoolean();

        if (answer2) {
            System.out.println(" I am really happy");
        }


        if(!answer2){
            System.out.println("turn tour camera on it time to be grilled");
        }
        }


    }

