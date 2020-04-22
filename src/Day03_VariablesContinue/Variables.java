package Day03_VariablesContinue;

public class Variables {
    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;
        /* boolean not necessarily takes True or False but any other expression
        which gives result of True or False. For example:
         */
        boolean result3 = 10+2 > 5; // This boolean variable is correct coz the answer is correct//

        System.out.println( 9 >= 8); //true
        System.out.println( 10 != 11); //true
        System.out.println("Rahman" == "Good guy");// true or false. We can compare text to text//
        System.out.println("9" == "3");//false.
        System.out.println(true != false);// true

        /* System.out.println(9 = 9);
        (=) operates only
         */

        //char: used for single characters, must be given in single quote ''//
            char ch1 = 'A';
        System.out.println(ch1);

            char ch2 = 'B';
        System.out.println(ch2);

            char ch0 = 'N';
        System.out.println(ch0);

            char ch3 = 100;
        System.out.println(ch3);

            char ch4 = 50000;
        System.out.println(ch4);

            char ch5 = 48000;
        System.out.println(ch5);

        char character1 = 'a'; // number is 97
        // short s1 == character1;
         int num1 = character1;
        System.out.println(num1); // 97

        int total = 'a' + 'b'; //number is 97+98 = 195
        System.out.println(total);

        //if the chart date type is falling in the range of Short or Byte then we can do that. EX:

        short sh1 = 'a';
        byte by1 = 'b'; // this is OK coz the char dataType (b) falls in the range of Byte.
        System.out.println(sh1);
        System.out.println(by1);

    }
}
