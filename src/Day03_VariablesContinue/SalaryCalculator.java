package Day03_VariablesContinue;

public class SalaryCalculator {
    /*create a class called Sequare, and write a program that can calculate
    the areas and perimeters of the sequare based on the length of
    the sequare, and print the result
    Note: you only need to length of the sequare in order to calculate the area and perimeter
     */

    public static void main(String[] args) {

        double rate = 55;
        float stateTaxRate = 0.04f;
        float federalTaxRate = 0.22f;
        byte weeklyHours = 40;

        //salary = rate * weeklyHour * 4 * 12//
        double salary = rate * weeklyHours * 52;

        //stateTax = salary * stateTaxRate//
        double stateTax = salary * stateTaxRate;

        //federalTax = salary * federalTaxRate//
        double federalTax = salary * federalTaxRate;

        //income after tax = salary - (stateTax + federalTax)
        double incomeAfterTax = salary - (stateTaxRate + federalTax);

        //total tax =
        double TotalTax = stateTax + federalTax;

        System.out.println("Your salary is: " + salary); //concatenation//
        System.out.println("State tax is: " +stateTax); // state tax is 4575//
        System.out.println("Federal tax is: " +federalTax);
        System.out.println("Total tax is: " +TotalTax);
        System.out.println("Your take home salary is: " +incomeAfterTax);

    }
}
