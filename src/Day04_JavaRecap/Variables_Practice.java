package Day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {

        // Data type variableName = Data;

        // byte num1 = 100.5; // Wrong coz it only accepts whole number
        // byte num2  129; // Wrong coz the number is out of Byte range

        // double > float > long > int > short > byte

        byte num1 = 100;
        short s1 = num1; // we can assign the byte num to the short co it's smaller
        // byte num2 = s1; Wrong coz sort is greater

        // short s2 = 40000; Wrong coz 40000 is out f short range

        int num2 = s1;

        int num3 = 1000;
         // int public = 1000; Wrong coz the word "public" is one of Java reserved names

        long li = 99999999999l;

        float f1 = 100l;
        System.out.println(f1);

        double d1 = 15.5;
        double d2 = 10; // result: 10.0
        double d3 = 100L; // result: 100.0

        char ch1 = 'A'; //
        System.out.println(ch1);

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 9800;
        System.out.println(ch3);

        int a1= 'a';
        System.out.println(a1);

        int a2 = 'a' + 'b'; // result is: 97 + 98 = 195
        System.out.println(a2);

        double dnum = 'a';
        System.out.println(dnum);

        char char1 = 'a';
        //byte byte1 = char1; Wrong coz the compiler takes char1 as a character which can be out of byte range

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(10 > 5+5);

        boolean result1 = 10 > 9;

        System.out.println(10 >= 10); // true
        System.out.println(10 != 10); //false

        System.out.println("Corona" == "Ebola"); //false
        System.out.println("Corona" != "Ebola"); //true

       // System.out.println("Nine" == 9); Wrong coz num cannot be compared to text

        System.out.println('a' != 97); //False. result is: 97 != 97

        System.out.println("****************************************");

        System.out.println(!true); // result is: False
        System.out.println(!false); // result is: true

        boolean r1 = true != !false; // result: false
        System.out.println(r1);
        boolean r2 = !(9 > 10) !=   !(10>9); //true
        System.out.println(r2);

        // we can have more than one exclamation mark in Java. EX:
        boolean r3 = !!!true; // result is: false
        System.out.println(r3);



    }
}
