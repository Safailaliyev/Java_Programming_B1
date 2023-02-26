package day09_a__scanner;

import java.util.Scanner;

public class Revenue {
    /*write a program that asks

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //java creates an object here


        double price;  // Java declare a price variable that has data type of double
        int quantity;  // Java declare a quantity variable that has data type of double


        System.out.println("Enter the price and quantity: "); //Java says print out whatever is in double quote

        price = input.nextDouble();   //Java asks user to put/info/value then assign that value to price variable
        quantity = input.nextInt();  //Java asks user to put/info/value then assign that value to quantity variable


        double revenue = price * quantity;

        System.out.println("your revenue: " + revenue);

        System.out.println(price);
        System.out.println(quantity);
    }
}
