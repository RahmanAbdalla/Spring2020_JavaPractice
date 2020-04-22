package Day13_StringClass;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "Cybertek";
        //            01234567
        char ch1 = str.charAt(5);
        System.out.println(ch1);
        System.out.println(ch1 == 'A');
        //                 't' == 'A'   false
        System.out.println(ch1 == 'T');
        //                  't' == 'T'   false

        int totalLenght = str.length();
        System.out.println(totalLenght);
        System.out.println(totalLenght > 250); // to put a limit of input text that user can input?

        String str2 = "Today is a great day to learn Java ";

        int maxIndextNum = str2.length()-1;
        System.out.println(maxIndextNum); // 34. This mean that 35 -1 =34. So entire text num is 35

        String s1 = "Cybertek";
        s1 = s1.concat(" School"); // s1 = "Cybertek School"
        System.out.println(s1);

        String s2 = "Java";
        System.out.println(s2); // it still returns "Java" coz it is immutable

        s2 = s2.concat(" is a programming language"); /* If we don't assign it back to s2 then we
                                                    will get the same result "Java" for s2 like line 33 */
        System.out.println(s2); // "Java is a programming language"


        // but if we want to reassign (s2) at line 40 to s2.concat(" is a programming language"),
        // this is what we can do
        s2.concat(" is a programming language");

        String r1 = "Java is fun";
        r1 = r1.concat(" and it's easy");
        System.out.println(r1);

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        String A1 = "          Today is a great day";
        System.out.println(A1); /* if we do like this: A1.trim(); then the spaces will still be there
                                if we print A1 coz we haven't assign it back to A1 */
        A1 = A1.trim(); // but this one here removes the SPACES coz we assigned it back to A1
        System.out.println(A1);

    }
}
