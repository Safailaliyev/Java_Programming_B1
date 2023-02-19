package day05_variables;

public class CellPhone {

    public static void main(String[] args) {


        String brand = "apple";
        String model = " Iphone 10";
        String color = " black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        //I have an IPhone 10 from apple
        System.out.println("I have an" + model+ "from" +brand);

        //It came in the color black 'and it has [128]GB
        System.out.println("It came in the color" +color+ "and it has" +storage+ "GB");

        //For the sim type [A] with a camera [hasCamera] the total price was $[price]
        System.out.println("for the sim type" +sim+ "with a camera" + hasCamera+ "the total price was $" +price);


        String fullMessage = "I have an " +model+ " from " +brand + " it came in the color " +color+ " and it has " +storage+ "GB";
        System.out.println(fullMessage);


    }
}
