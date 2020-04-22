package Day16_ForLoop;

import java.util.Scanner;

public class PalingdromeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        String reverse="";

        for (int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }
        if (word.length()==5){
            System.out.println(reverse);
        }

        if (reverse.equalsIgnoreCase(word)){
            System.out.println(reverse+" is a palindrome word");
        }else {
            System.out.println(reverse+" is not a palindrome word");
        }
     //   System.out.println(reverse);


    }
}
