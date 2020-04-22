package Day00_ME;
import java.util.*;
public class LitterToGallons {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        /*
        How to find a factor of a given number
        Factors of 14 = 1, 2, 7 and 14.

Factors of 18 = 1, 2, 3, 6, 9 and 18.

Therefore, common factor of 14 and 18 = 1 and 2.

Highest common factor (H.C.F) of 14 and 18 = 2.
         */
/*
        System.out.println("=============== For Loop ===============");

        int n = console.nextInt();
        String factor1 = "";
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    factor1 += i + ", ";
                }

            }
        System.out.print(factor1);
        System.out.println();

 */


        System.out.println("=============== While Loop ===============");
/*

        int n2 = console.nextInt();
        int j = 1;
        String factor2 = "";
        while (j <= n2) {
            if (n2 % j == 0) { //14/13 ==
                factor2 += j + ", ";
            }
            j++;
        }
        System.out.println(factor2);


        System.out.println("=============== Do-While Loop ===============");

        int n3= console.nextInt();
        String factor3="";
        int k=0;
        do {
            k++;
            if (n3 % k == 0) { //14/13 ==
                factor3 += k + ", ";

            }
         } while (k <= n3) ;
        System.out.println(factor3);

 */

         /*
        Write a program to enter the numbers till the user wants and at the end
        it should display the count of positive, negative and zeros entered.
         */

        System.out.println("*****************************************");

        int NegCount = 0;
        int PosCount = 0;
        int zeros = 0;
        char ch = ' ';
/*
        for (int i=0; true;){

            System.out.println("Enter a number");
            int num=s.nextInt();

            if (num ==0){
                zeros++;
            } else if (num % 2==0){
                PosCount++;
            }else if (num % 2!=0){
                NegCount++;
            }
            System.out.println("Do you still want to continue?");
             ch = s.next().charAt(0);

            if (ch=='y'){

            }
            if (ch == 'n'){

                System.out.println("The sum of positive numbers is: "+PosCount);
                System.out.println("The sum of negative numbers is: "+NegCount);
                System.out.println("Number of zeros entered is: "+zeros);
                System.out.println();
                System.out.println("******* THANK YOU *******");
                break;
            }
        }

          */

        // do-while
/*
        do {

            System.out.println("Enter a number");
            int num = s.nextInt();

            if (num == 0) {
                zeros++;
            } else if (num % 2 == 0) {
                PosCount++;
            } else if (num % 2 != 0) {
                NegCount++;
            }
            System.out.println("Do you still want to continue?");
            ch = s.next().charAt(0);

            if (ch == 'y') {

            }
            if (ch == 'n') {

                System.out.println("The sum of positive numbers is: " + PosCount);
                System.out.println("The sum of negative numbers is: " + NegCount);
                System.out.println("Number of zeros entered is: " + zeros);
                System.out.println();
                System.out.println("******* THANK YOU *******");
                break;

            }
        } while (ch == 'y' || ch == 'Y') ;

 */

        System.out.println("===============================");

        /*
        Write a program to enter the numbers till the user wants and at the end
        the program should display the largest and smallest numbers entered.
         */
/*
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char cha = ' ';

        do {

            System.out.println("Enter a number");
            int n = s.nextInt();

            if (n > largest) {
                largest = n;
            }

            if (n < smallest) {
                smallest = n;
            }

            System.out.println("Do you still want to continue?");
            cha = s.next().charAt(0);

        } while (cha == 'y' || cha == 'Y');

        System.out.println("The largest number you entered is :" + largest);
        System.out.println("The smallest number you entered is :" + smallest);
        System.out.println();
        System.out.println("========= ENJOY YOUR TIME =========");

 */

        System.out.println("====================================");


        /*
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself,
        then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
         */

        /*
        int armstrong = 0;
        int digit1,  // To hold first digit (Ones) of number
                digit2,  // To hold second digit (Tens) of number
                digit3;  // To hold third digit (Hundreds) of number

        for (int number = 1; number <= 500; number++) {

            digit3 = number % 10;
            digit2 = number % 100 / 10;
            digit1 = number % 1000 / 10 / 10;

            if ((digit1*digit1*digit1) + (digit2*digit2*digit2) + (digit3*digit3*digit3) ==number){

                System.out.println(number);

            }

        }

         */

        System.out.println("====================================");

        /*
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
         */
        /*
        double a = s.nextInt();

        double sum=0;
        for (int i=1; i <=a; i++){

            sum += 1.0/i ;
        }

        System.out.println(sum);

         */

        System.out.println("====================================");
/*
        int number;
        int guess;
        int tries=0;
        number = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Try a number");
            guess=s.nextInt();

            tries++;

            if (guess > number){
                System.out.println("Too high. Try again");
            }else if (guess < number) {
                System.out.println("Too low. Try again");
            }else {
                System.out.println("Right answer\nNumber of tries: "+tries);
            }

        }while (guess !=number);
 */


    }


}







