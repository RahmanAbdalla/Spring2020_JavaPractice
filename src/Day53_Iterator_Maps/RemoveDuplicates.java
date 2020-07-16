package Day53_Iterator_Maps;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {


       // 1. write a program that remove the duplicates from an array of String and keep the inserting as it is

        String arr [] = {"e","f","a","b","b","a","c"};

        LinkedHashSet<String> list1 = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(list1);




        //	2. write a program that can remove the duplicates from an arrayList of String

        ArrayList<String>list = new ArrayList<>(Arrays.asList("F","K","B","B","K"));

        System.out.println("Before removing duplicates: "+list);

        LinkedHashSet<String> hashSet = new LinkedHashSet<>(list);

        // we reassign the list and add the hashSet to it again
        list = new ArrayList<>(hashSet);

        System.out.println("After removing duplicates: "+ list);

    }
}
