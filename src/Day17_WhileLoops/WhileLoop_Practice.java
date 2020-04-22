package Day17_WhileLoops;

import java.io.StringReader;
import java.util.Scanner;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        ask the user to enter Yes or No
        if the user enters other than Yes or No, repeat the question
         */

        System.out.println("Enter Yes or No");
        String ans = scan.next();

        boolean valid = ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no");
        while( !valid ){  // while the input is not yes or not, rpeats the question
            System.out.println("please re-enter");
            ans = scan.next();

            if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")){
                break;
            }
            valid = ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no");
            // we have to update the boolean inside the loop

        }

        if (valid){
            System.out.println("You entered no");
        }
        if  (ans.equalsIgnoreCase("yes")){
            System.out.println("You entered yes");
        }


    }
}
