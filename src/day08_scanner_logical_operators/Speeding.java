package day08_scanner_logical_operators;

public class Speeding {

    public static void main(String[] args) {

        /*declare 3 variable:
        Current speed
        speed limit
        speeding


        print
        "Is this person speeding?" true or false

         */


        int currentSpeed= 50;
        int speedLimit= 50;

        boolean isSpeeding= currentSpeed <= speedLimit;

        System.out.println("Is this person speeding? " + isSpeeding);



    }
}
