package Day4_variables;

public class Fruits {
    public static void main(String[] args) {
        //create 3 variables called apple, grapes, bananas, --> dataType is int and assign values 50, 100, 150 respectfully

        int apples =50;
        int grapes =100;
        int bananas =150;

        //int apples = 50, grapes = 100, bananas = 150;
        //int public = 50;


        //lets print out "this is how many apples we have
        System.out.println("This is how many apples we have: " + apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        //We gaves 20 apples to a friend
        apples = 30;
        System.out.println("Apples left: " + apples);

        //declare new variable called price and assign value 20.0
        double price = 20.0;

        //Write statement: "The price for 100 grapes is $20.0"
        System.out.println("The price for 100 grapes is $20.0"); //hard coded
        System.out.println("The price for " + grapes + "grapes is $" + price);


    }
}
