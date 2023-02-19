package day3_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        //this is without any tab
        System.out.println("This is not tabbed");

        //this is with one tab
        System.out.println("\tthis is tabbed once");

        //this is with two tab
        System.out.println("\t\t this is tabbed twice");

        //here is it tabbed without escape sequence
        System.out.println("         this is tabbed without escape sequence ");


        //example of new line
        System.out.println();
        System.out.println("1 go to parking lot");
        System.out.println("2 find the car");
        System.out.println("3 start the car");

//
//        System.out.println("1) go to parking lot");
//        System.out.println();
//        System.out.println("2) find the car");

//
        System.out.println("\n1) go to parking lot\n2 find the car\n3 start the car");


    }
}
