package Day52_Collection_FramWork_Intro;

import java.sql.Array;
import java.util.*;

public class Practice {
    public static void main(String[] args) {

        /*
         Tasks:
        1. write a program that can remove the duplicated characters from String
         */

        // First way
        String str = "AABCDEEFFG";

        String arr [] = str.split("");
        HashSet<String> hashSet= new HashSet<>(Arrays.asList(arr));

        String res="";

        for (String each : hashSet){
            res += each;
        }
        System.out.println(res);

        //Second Way

        /*
        String str = "AABCDEEFFG";

        String arr [] = str.split("");
        str="";
        for (String each : new HashSet<>(Arrays.asList(arr))){
            str += each;
        }

         */


        // Third Way
/*
        String str = "AABCDEEFFG";

        String arr [] = str.split("");
        str= new HashSet<String>(Arrays.asList(arr)).toString().replaceFirst(",","");

 */




        ///////////////////////////
       /*
        2. write a program that can identify if two strings are build out of the same letters
        ex:
        str1 = "abababa"
        str2 ="ab";
        output: true

        */

        String str2 = "abababa";
        String str3 = "ab";

        String arr1 [] = str2.split("");
        String arr2 [] = str3.split("");

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String>treeSet1 = new TreeSet<>(Arrays.asList(arr2));

        boolean result = treeSet.equals(treeSet1);
        System.out.println(result);

        //OR
        /*
        String str2 = "abababa";
        String str3 = "ab";

        String arr1 [] = str2.split("");
        String arr2 [] = str3.split("");
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(arr1));
        TreeSet<String>treeSet1 = new TreeSet<>(Arrays.asList(arr2));

        str2= treeSet.toString();
        str3= treeSet1.toString();

        System.out.println(str2.equals(str3));

         */


        //OR
/*
        String str2 = "abababa";
        String str3 = "ab";

        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();
        str3 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str2.equals(str3));
        
 */



    }
}
