package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000,
                stateTaxRate = 0.08,
                federalTaxRate = 0.21;

        double stateTax, federalTax,totalTax, salaryAfterTax;

        stateTax = salary * 0.08;  //%8
        federalTax= salary * 0.21; //%21

        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        System.out.println("State tax rate; " + stateTaxRate + "\nFederal tax rate: " + federalTaxRate + "\nBase salary: "+ salary + "\nTotal tax amount: $" + totalTax + "\nThe salary after tax: $" + salaryAfterTax);


    }
}
