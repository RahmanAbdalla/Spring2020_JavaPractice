package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrintThreeLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         /*
        Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr,
        one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
         */

         String arr[] = new String[5];

        for (int k=0; k <=4; k++ ){

            System.out.println("Enter a word");
            arr[k] = scan.nextLine();
        }
        System.out.println(Arrays.toString(arr));

        for (String letters : arr){

            System.out.println("First three letters: "+letters.substring(0,3));
            System.out.println("First and Last letters: "+letters.charAt(0)+""+letters.charAt(letters.length()-1));

            System.out.println();

        }

    }
}
