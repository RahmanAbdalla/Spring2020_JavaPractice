package Day00_ME;

import Resourses.Library;
import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.awt.*;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        String s1 = "wooden";
        String s2 = "spoon";
        String st = mergeStrings(s1,s2);
        System.out.println(st);

    }

    public static String mergeStrings(String one, String two) {
       String res = "";

        for (int i = 0; i < one.length() || i < two.length(); i++) {

            if (i < one.length()){
                res += one.charAt(i);
            }
            if (i < two.length()){
                res += two.charAt(i);
            }
        }

        return res;
    }

    }



