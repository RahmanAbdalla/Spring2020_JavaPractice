package Day11_Scanner;

import java.util.Scanner;

public class Scanner_Practice1 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        /*
        Task: Scanner_Practice1
            1. ask the user enter first name
            2. ask user to enter last name
            3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
            4. if he is employeed , ask the salary
            4. if he is not employeed set the salary to 0
            output:
                full name:
                employeeed status:
                salary:
         */

        System.out.println("Enter you first name: ");
        String firstName = type.next();

        System.out.println("Enter your last name: ");
        String lastName = type.next();

        String fullName = firstName+ " "+lastName;

        System.out.println("Are you employed? ");
        boolean employed = type.nextBoolean();

        double salary = 0;
        if (employed == true){
            System.out.println("Enter your salary");
            salary = type.nextDouble();
        }


        System.out.println("Full name is: "+fullName);
        System.out.println(employed);
        System.out.println("Salary is: "+salary);



    }
}
