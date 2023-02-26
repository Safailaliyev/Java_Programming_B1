package day09_b__if_statements;

public class SingleIfExample {

    public static void main(String[] args) {

        // if condition is tru print out "Today is java day"


        if (true) {
            System.out.println("Today is java day");
        }

        //System.out.println("Today is java day");

        //mac number of days in Feb28

        int maxNumberOfDay = 28;


        if (maxNumberOfDay == 28) {
            System.out.println("This mount is February");
        }

        maxNumberOfDay = 30;
        if (maxNumberOfDay == 28) {
            System.out.println("This mount is February");


            int quizResult = 50;
            int passRAte = 65;
            if (quizResult >= passRAte) {
                System.out.println("Passed the exam.");
            }

            if (quizResult < passRAte) {
                System.out.println("Failing the exam");
            }


            int year = 2021;
            //If year is equal or bigger than 2020 and less than or equal to 2022 --- it is true
            boolean isCovidYears = year >= 2021 && year <= 2022; //year ==2021 && year ==2022

            if (isCovidYears) {
                System.out.println("It was Covid a Covid year");












            }
        }
    }
}


