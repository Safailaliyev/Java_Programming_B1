package day05_variables;

public class School {
     /*
    Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all the variables with unique messages
*/

    public static void main(String[] args) {

        int number0fStudentsInGrade1 = 40;
        int number0fStudentsInGrade2 = 30;
        int number0fStudentsInGrade3 = 35;
        int number0fStudentsInGrade4 = 50;
        int number0fStudentsInGrade5 = 44;

        int totalNumber0fStudents = number0fStudentsInGrade1 + number0fStudentsInGrade2 + number0fStudentsInGrade3 + number0fStudentsInGrade4 + number0fStudentsInGrade5;

        double number0fDaysInYear=100.5;
        double number0fSnowDays=5.5;
        double averageGpaInSchool=3.2;

        System.out.println("Number of students in Grade 1= " + number0fStudentsInGrade1 );
        System.out.println("Number of students in Grade 2= " + number0fStudentsInGrade2 );
        System.out.println("Number of students in Grade 3= " + number0fStudentsInGrade3 );
        System.out.println("Number of students in Grade 4= " + number0fStudentsInGrade4 );
        System.out.println("Number of students in Grade 5= " + number0fStudentsInGrade5 );

        System.out.println();

        System.out.println("Total number of Students: " + totalNumber0fStudents);

        System.out.println();

        System.out.println("Number of Days in year:" + number0fDaysInYear);
        System.out.println("Number of snow days: " + number0fSnowDays);
        System.out.println("AVERAGE GPA in school:" + averageGpaInSchool);


    }

}
