package Day14_StringClass;

import java.util.Scanner;

public class comineTwoString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
         */

        System.out.println("first word: ");
            String w1 = scan.next();
        System.out.println("second word: ");
            String w2 = scan.next();

         // OR          String mix2 =w1.substring(1,w1.length()-1+1);
          String  mix = w1.substring(1)+w2.substring(1);


        /// Or we can substring each word separately

            w1 = w1.substring(1);
            w2 = w2.substring(1);

            String res = w1+w2;

            System.out.println(mix); // first solution
            System.out.println(res); // second solution
    }
}
