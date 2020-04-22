package Day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        ask user to enter salary
        ask user to enter full name
        ask user to enter company name
        ask user to enter company name
        ask user to enter SSN
        ask user to enter JobTitle
         */

        System.out.println("Please enter you salary: ");
        double salary = scan.nextDouble();
        scan.nextLine();

        System.out.println("Please enter you full name: ");
        String fullName = scan.nextLine();

        System.out.println("Please enter the company name: ");
        String companyName = scan.nextLine();

        System.out.println("Please enter you SSN: ");
        long SSN = scan.nextLong(); //we need to add nextline() coz "Enter" will be left in the scanner
        scan.nextLine();

        System.out.println("Please enter your job title: ");
        String jobTitle = scan.nextLine();

        System.out.println("Your full name is: "+fullName);
        System.out.println("Your job title is: "+jobTitle);
        System.out.println("Your company name is: "+companyName);
        System.out.println("Your SSN is: "+SSN);
        System.out.println("Your salary is: "+salary);


    }
}
