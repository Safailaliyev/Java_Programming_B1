package day06_b_unary_operators;

public class InrementExample2 {
    public static void main(String[] args) {


        int age = 20;
        System.out.println(age--); //20

        System.out.println(age); //19

        System.out.println(++age); // age = age +1 ---> 20

        System.out.println(--age); //19

        --age;
        System.out.println(--age); //17
    }
}
