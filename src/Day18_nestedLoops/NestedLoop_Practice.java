package Day18_nestedLoops;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition of two numbers is: " + n1 + n2);

            System.out.println("Do you want to continue: Yes/No?");
            String ans = scan.next();

            while (! ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("no")) {
                System.out.println("Invalid entry. Please type Yes/No");
                ans=scan.next();
            }
            if (ans.equalsIgnoreCase("no"))
                System.out.println("Thank for using the calculator");
                break;
            }


        }
    }

