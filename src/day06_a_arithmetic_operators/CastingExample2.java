package day06_a_arithmetic_operators;

public class CastingExample2 {

    public static void main(String[] args) {


        short numOne = 40;
        float numTWo = numOne;


        char letter  = 'A';
        int letter2 = letter;
        System.out.println(letter2);


        float num2 = 100.5F;
        short num4 = (short)num2;
        System.out.println(num4);

    }
}