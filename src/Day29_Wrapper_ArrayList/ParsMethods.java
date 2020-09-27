package Day29_Wrapper_ArrayList;

public class ParsMethods {
    public static void main(String[] args) {

        String str = "123";// Parsing converts string int to Integer class

        int a1 = Integer.parseInt(str);// 123

        // we can add a number to them to know if it's string or a number
        System.out.println(str+1);
                        // 123 +1 ==> 1231  concatination coz str is a string NOT an int
        System.out.println(a1+1);
                        // 123 +1 ==> 124 coz a1 is an int

        byte b1 = Byte.parseByte(str);
        System.out.println(b1+3);

        Integer I1 = (int) Byte.parseByte(str); // AutoBoxing coz we assign int to Integer Wrapper class
                // we need to cast it to int coz Integer Only takes int

        // Integer = (byte)byte;
        // Integer = int;
        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        System.out.println(f1); // float 10.5
        float f2 = (float)Double.parseDouble(str2); // float 10.5
        System.out.println(f2);

        double d1 = Double.parseDouble(str2);
        System.out.println(d1); // double 10.5

        String str3 = "3147483647";
        long l1 = Long.parseLong(str3); // Long 3147483647
        // int i1 = Integer.parseInt(str3);// Error coz number is too large for int range
        System.out.println(l1);

        Long l2 = Long.parseLong(str3); // AutoBoxing

        String result1 = "true";
        boolean b = Boolean.parseBoolean(result1);
        System.out.println(b); // true: in order to know if result is boolean or not we need to give (!) expression to it
        System.out.println(! b);

        // but if we give anything else other than True or False then compiler by default return false
        String str4 = "There are 12 months in a year"; // this expression is true but ...
        boolean b2 = Boolean.parseBoolean(str4); // returns False though the string expression is true
        System.out.println(b2); // False, but we can make it true by adding (!)

        // Parsing method ignores case sensitivity
        String result2  = "fALsE"; // false
        boolean b3 = Boolean.parseBoolean(result2);// false coz it ignores case sensitivity
        System.out.println(b3);
    }
}
