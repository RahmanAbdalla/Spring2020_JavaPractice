package Day17_WhileLoops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        /*
        write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
         */
        Scanner scan = new Scanner(System.in);

        int max= -2147483647;// coz we assume that any number user input can be greater than this number
        int min=2147483647;// this is the maximum number int can hold

        for (int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int num =scan.nextInt();

            if (num > max){ //to compare each user inputs, and assign the maximum num to max variable
                max=num;
            }
            if (num < min){
                min=num;
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);



    }
}
