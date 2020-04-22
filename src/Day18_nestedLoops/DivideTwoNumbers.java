package Day18_nestedLoops;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        /*
        write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators

        a = a - b = 7;
        a = a - b = 4;
        a = a - b = 1;
         */
        Scanner scan = new Scanner(System.in);
        int a = 15;
        int b = 3;
        if (b== 0){
            System.out.println("b cannot be zero");
            System.exit(0);
        }
        int count=0; // to count the execution of the loop
        while (a >= b) {
            a -= b;
            count++;
        }

        if(a==0){
            System.out.println("The result is "+count);
        }else {
            System.out.println("The result is "+count+" with the remainder of "+a);
        }


    }
}
