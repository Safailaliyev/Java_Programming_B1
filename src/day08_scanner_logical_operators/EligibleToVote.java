package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        /*create and assign these variables:

            name
            are they citizen
            do have criminal background
            age

            sample inputs:
                "James Bond"
                true
                false
                49

        determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

        print : $name is eligible to vote: $boolean


         */


        String name = "Tom";
        boolean isCitizen = true;
        boolean hasCriminalBackRound = true;
        int age = 49;

        boolean isEligible;
        isEligible = age>= 18 && isCitizen && !hasCriminalBackRound;

        System.out.println(name+ " is eligible to vote " + isEligible);


        isEligible = age>= 18 && isCitizen && hasCriminalBackRound;

        System.out.println(name+ " is eligible to vote " + isEligible);
    }
}
