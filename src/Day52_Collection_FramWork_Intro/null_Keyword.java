package Day52_Collection_FramWork_Intro;

import java.util.ArrayList;
import java.util.TreeSet;

public class null_Keyword {

    //We can assign "null" to all reference types: String and all object types like below


    static String str = new String("Cybertek"); //default value is "null"
   // static ArrayList<Integer> list;

    public static void main(String[] args) {

        //if we try to call index of the above str then we get "NullPointerException" coz the str doesn't refer to any
            // obj but it refers to "null". That's, we haven't instantiate it to an object

        System.out.println( str.charAt(0) ); // C
     //   System.out.println(list.get(1)); result: NullPointerException

        Integer n = null;
        String str2 = null;

       // int n = null;

        ArrayList<String> list = new ArrayList<>();
        // we can assign "null" to the object of this list, however, "null" is basically nothing, we SHOULDN'T consider
        // it an obj
        list.add(null);
        System.out.println(list); //[null]


        System.out.println("============= null =================");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add(null);
        treeSet.add(null);
        treeSet.add(null);
        //   System.out.println(treeSet); //NullPointerException. COZ TreeSet has to find objects and sort them, however
        // there's no object here, coz null is nothing.

        System.out.println("====================================");

        String number = null;
           int num1 = Integer.parseInt(number);
           System.out.println(num1); //NullPointerException. Coz "null" is NOT an object and also primitives don't accept null


        System.out.println("=============================");

        String [] arr1 = {null, "Cybertek", null};
        // size is ==3, but actually ONE object is created coz 'Null" is NOT and object

        // arr1[0].toUpperCase();// NullPointerExceptio, coz element at index [0] is not an object and we cannot call upercase
        arr1[1].toUpperCase(); // CORRECT

        String name1 = "hello".toUpperCase();
        System.out.println(name1);



    }
}
