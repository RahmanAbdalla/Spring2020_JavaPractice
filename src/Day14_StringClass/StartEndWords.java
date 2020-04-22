package Day14_StringClass;

import java.util.Scanner;

public class StartEndWords {
    public static void main(String[] args) {
/*
        Write a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first word");
        String  word1 = scan.nextLine();

        System.out.println("Enter second word");
        String  word2 = scan.nextLine();

        int length1 = word1.length();
        int length2 = word2.length();

        if (length1 ==5 && length2 ==5){
            //OR (word1.charAt(length-1)
            if (word1.charAt(4)==word2.charAt(0)){
                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }

        }else {
            System.out.println("need to be exactly 5 chars length");

        }

    }
}
