package day05_variables;

public class MyName {
    public static void main(String[] args) {


        char letterOne = 'S';
        char letterTwo = 'a';
        char letterThree = 'f';
        char letterFour = 'a';
        char letterFive = 'i';
        char letterSix = 'l';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterThree);
        System.out.println(letterFour);
        System.out.println(letterFive);
        System.out.println(letterSix);


        System.out.println();

        System.out.println(letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix);

        System.out.println("My name: " + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix);

        String name = " My name" + letterOne + letterTwo + letterThree + letterFour + letterFive + letterSix;
        System.out.println(name);


    }
}
