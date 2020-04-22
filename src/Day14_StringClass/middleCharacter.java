package Day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        /*
        Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
         */

        System.out.println("write a word");
        String word = scan.next();
        String middleCharacter = "";
                                    // elephant (even)   bananas  (odd)
                                    // 01234567          0123456
        int totalWord = word.length(); // 8   length       7
        int middleNumber = totalWord/2;/* 8/2 = 4        7/2 = 3 ==> we need to look for these numbers
                                        through charAt() coz they're the middle number we get by dividing
                                        total word length to 2 */

        if (totalWord %2 !=0){ // odd number
            middleCharacter= middleCharacter+word.charAt(middleNumber);
            //we use the (middleCharacter) to concatinate the number of charAt with the string, coz we
            // get addition if we dont do so

        }else   { //even number
            middleCharacter= middleCharacter+word.charAt(middleNumber -1)+word.charAt(middleNumber);
               //   this will choose 3, but we need to add 4 too, coz even num has two middle letters

        }

        System.out.println("The middle character of "+word+" is: "+middleCharacter);


    }
}

