package Day30_ArrayList;

import Resourses.Library;

public class SumOfDigits {
    public static void main(String[] args) {

               /*  Warm up Tasks
          1.  write a program that can return the sum of all the digits from a string
                      ex:
            input: "a1b2c3"
            output: 6
            (1+2+3= 6)
            input: "Today's date is 04/27/2020"
            output: 17
            (0+4+2+7+2+0+2+0=17) */

        String st = "Today's date is 04/27/2020";
        String num = "0123456789";
        int sum = 0;
        for (int k = 0; k < num.length(); k++) {
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == num.charAt(k)) {
                    sum += Integer.parseInt("" + st.charAt(i));
                }
            }
        }
        System.out.println(sum);


        // OR this way
        int sum2 = 0;
        char[] arr = st.toCharArray();
        for (char each : arr) {
            boolean isDigit = each >= 48 && each <= 57;
            if (isDigit) {
                // OR if (Character.isDigit(each))
                sum2 += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum2);


        boolean a = Character.isAlphabetic('A'); // identifies if the character is alphabet
        Character.isDigit('d'); // Identifies if the character is is Digit
        Character.isAlphabetic('a');// identifies if the character is Alphabet

        String str = "12b34bh5j6hdjx";

        String word = Library.seperateLetterandDigits(str);
        System.out.println(word);
    }
}

