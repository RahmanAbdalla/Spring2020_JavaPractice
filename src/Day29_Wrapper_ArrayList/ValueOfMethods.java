package Day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str1 = "123";
        Integer a = Integer.valueOf(str1); // it returns wrapper class NOT primitive, Unlike Parsing
        System.out.println(a);

        double d1 = Integer.valueOf(str1);// Unboxing coz we assign wrapper class to primitive
        System.out.println(d1);

        String str2 = "15.5";
        double d2 = Double.parseDouble(str2);
        double d3 = Double.valueOf(str2);// returns Wrapper class coz it's ValueOf Method(); Unboxing

        System.out.println(d2);
        System.out.println(d3);

        System.out.println("===========================");
        int z1 = 2000;
       // Long L1 = z1; // does not accept any other primitives except fot its own

        short s1 = 2000;
        int z2 = s1;

        /*
        "True"
        "10000000.5"==> long
        "123456" ==> to short
         */
        String st1 = "FALSe";
        Boolean b = Boolean.valueOf(st1); // Boolean == Boolean ==> no Boxing happens here
        boolean b1 = Boolean.valueOf(st1); // Wrapper class to primitive ==> unboxing

        System.out.println(b1);
        System.out.println(b);

        System.out.println("==============================");
        // We can find max and min value of primitives by this way
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);
        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble);
        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);
        System.out.println("================================");
        // All primitives' values are default, But wrapper class values are ALL (null) by default
        boolean [] arr = new boolean[3];
        System.out.println(Arrays.toString(arr)); //[false, false, false]

        Character [] arr2 = new Character[3];
        System.out.println(Arrays.toString(arr2));// [null, null, null]







    }
}
