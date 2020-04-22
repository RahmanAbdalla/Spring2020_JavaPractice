package Day24_Methods;

import java.util.Scanner;

public class WarmUps {
/*
1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
	2. write a method called Calculation, that passes 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, '*') ==> 20;
			calculate(10, 2, '&') ==> Invalid operator
			NOTE: The method MUST take three arguments when it's called
	3. write a method that can identify if a string is palindrome
			ex: palindrom("level")  ==> true
				palindrome("Cybertek") ==> false
 */
    public static void maxNum (int num1, int num2){

        if (num1 >=num2){
            System.out.println("Maximum number is: "+num1);
        }else {
            System.out.println("Maximum number is: "+num2);
        }
    }

    public static void calculation (double num1, double num2, char operator){

        switch (operator){
            case '+':
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = "+(num1/num2));
                break;
            case '%':
                System.out.println(num1+" % "+num2+" = "+(num1%num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }

    public static void palindrome (String st){

        String res="";
        for (int i=st.length()-1 ; i >=0; i--){
            res+=st.charAt(i);
        }
        if (res.equals(st)){
            System.out.println(st+" is a palindrome word");
        }else {
            System.out.println(st+" is not a palindrome word");
        }
    }


    public static void main(String[] args) {
        // first method: ADDING two numbers
        int a = 100;
        int b = 23;
        maxNum(a,b);

        // Second method: CALCULATION
        // we can have scanner also and then call the method:
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number:");
            double num = scan.nextDouble();
            System.out.println("Enter second number:");
            double num3 = scan.nextDouble();
            System.out.println("Enter operator:");
            char operator = scan.next().charAt(0);

            calculation(num,num3,operator);
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while (! ( answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid input: Please enter Yes/No");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                break;
            }

        } // end of While Loop

        // Third method: PALINDROME
        String str = "hello";
        palindrome(str);





    }
}
