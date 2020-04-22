package Day17_WhileLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String reverse= "";

        int lenght = word.length()-1;

        while (lenght >= 0){
            reverse+=word.charAt(lenght);
            lenght--;
        }
        if (reverse.equalsIgnoreCase(word)) {
            System.out.println(reverse + " is a palindrome word");
        }else {
            System.out.println(reverse+" is not a palindrome word");
        }
    }
}
