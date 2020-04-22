package Day14_StringClass;

import java.util.Scanner;

public class combineTwoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         /*
        Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */
        System.out.println("first word: ");
        String w1 = scan.next();
        System.out.println("second word: ");
        String w2 = scan.next();

        String mix = w1.concat(" "+w2).concat(" "+w2).concat(" "+w1);
        System.out.println(mix);
    }
}
