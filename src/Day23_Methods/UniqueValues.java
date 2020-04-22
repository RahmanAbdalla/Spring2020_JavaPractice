package Day23_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueValues {
    public static void main(String[] args) {

        /*
         Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
         */

        String arr[] = {"C++", "Java", "C++", "Python", "A", "A"};

        String uique = "";
        int count = 0;
        //  String res [] = arr; We can also declare another string array like this to compare

        for (String eachel1 : arr) {

            count = 0; // we MUST place this (count) here
            for (String eachel2 : arr)
                if (eachel2.equals(eachel1)) {
                    count++;
                }
            if (count == 1) {
                System.out.println(eachel1);
                // uique += eachel1+" "; OR we can add unique element to a string above
            }
        }

        System.out.println("==============================");

        /*
        String str = "AAABBCC"

                      A3B2C2
         */

        String str = "AAABBCC";
        String res = "";

        String st [] = str.split("");    //[A, A, A, B, B, C, C]

        String st2 [] = new String[st.length/2];

        System.out.println(Arrays.toString(st));
        System.out.println(st.length);

        int count2=0;
        for (int k=0; k < st.length; k++) {

            for (int i = 0; i < st2.length; i++) {

                if (st[k].equals(st2[i]) ) {
                   continue;
                }
                st[k]=st2[i];
            }
        }
        System.out.println(Arrays.toString(st2));
    }
}
