package Day16_ForLoop;

import java.io.StringReader;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        /*
         write a program that can remove duplicated characters from a string
         */
        Scanner scan = new Scanner(System.in);
        String word  = scan.nextLine();

        String result = "";  // "AB" we store the expected result in this variable

        for(int i=0; i <= word.length()-1 ; i++) {  // 0 , 1, 2 ,3
            /*
            if( !result.contains( ""+word.charAt(i)) ) {
                result += word.charAt(i);
            }
             */


                if(result.contains( ""+word.charAt(i) )){
            // if the string result does not contains str.charAt(i), then we concate it to the result, if it does we will not concate it to the result
                    continue;
                }

            result += word.charAt(i);
        }
        System.out.println(result);

    }


    }
