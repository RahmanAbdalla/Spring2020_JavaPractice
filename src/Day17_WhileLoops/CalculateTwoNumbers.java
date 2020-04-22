package Day17_WhileLoops;

import java.util.*;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
         */

        String  calculate="";
        String result="";
        for (int i=1; true;){
            //we can also use (int i=1; true)
            System.out.println("Enter first number");
            double n1=scan.nextInt();
            System.out.println("Enter second number");
            double n2=scan.nextInt();
            System.out.println("Enter the math operators");
            String operator= scan.next();
            // we can also use charAt()
           // char operator = scan.next().charAt(0);

            if (operator.equals("+")) {
                 calculate ="Addition is: "+ (n1 + n2);
            }else if(operator.equals("-")){
                calculate = "Subtraction is: "+(n1 - n2);
            }else if (operator.equals("*")){
                calculate = "Multiplication is: "+(n1 * n2);
            }else if(operator.equals("/")){
                calculate = "Division is: "+(n1 / n2);
            }else if (operator.equals("%")){
                calculate = "Remainder is: "+n1 % n2;
            }else {
                System.out.println("Invalid operator");
                break;
            }

            System.out.println(calculate);
            System.out.println("Do you want to continue?");
            String ans = scan.next();
            if (ans.equalsIgnoreCase("No")){
                break;
            }
        }

        System.out.println("Thanks for using calculator");

    }
}
 /*                 OR this way
       Scanner input = new Scanner(System.in);

    for(int i= 0; true ; ) {  // infinite loop  ,  opening culry brace of loop

        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Math operator: ");
        char operator = input.next().charAt(0);  // +, -, *, /, %

        if (operator == '+') {
            System.out.println("Addition is: " + (num1 + num2));

        } else if (operator == '-') {
            System.out.println("Subtraction is: " + (num1 - num2));

        } else if (operator == '*') {
            System.out.println("Multiplication is: " + (num1 * num2));

        } else if (operator == '/') {
            System.out.println("Division is: " + (num1/num2));

        } else if (operator == '%') {
            System.out.println("remainder is: " + (num1 % num2));

        } else {
            System.out.println("Invalid Operator");

        }

        System.out.println("Do you wanna continue");
        String answer = input.next();

        if(answer.equalsIgnoreCase("no")){  // o0nly exits the loop if the answer is NO
            System.out.println("Thank you for using the calculator");
            break;
        }

    } // closing curly brace of loop



    }

}
         */
