package Day11_Scanner;
import java.util.*;
public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        write a program that can display the selected browser
                        1. declare a String variable called browserName
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary before tax:");
        int salary = input.nextInt();

        System.out.println("Enter state tax rate:");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter the federal tax rate:");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;


        double totalTax= (federalTaxPercentage+stateTaxPercentage)*salary;
        double salaryAfterTax= salary-totalTax;

        System.out.println("Total tax you pay is: $"+totalTax);
        System.out.println("Your salary after tax is: $"+salaryAfterTax);
    }
}

