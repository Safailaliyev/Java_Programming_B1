package day08_scanner_logical_operators;

public class LogicalOperator {

    public static void main(String[] args) {

        int num = 20;
        System.out.println(num > 5); //true
        System.out.println(num<10);  //false


        System.out.println(num>5  && num > 10);  //true

        System.out.println();


        int x =20;
        int w = 30;

        System.out.println(x<5 || w++>20);
        System.out.println();

        boolean isCorrect = false;
        System.out.println(isCorrect);


        System.out.println(false);


        System.out.println(!false); //true
        System.out.println(!isCorrect); //true
     }
}
