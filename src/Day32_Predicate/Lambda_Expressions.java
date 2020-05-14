package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        // Predicate METHOD only accepts objects not primitive. It applies for Integers and strings too
        Predicate<Integer> oddNum = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(oddNum);// it removes every odd num from the list. NO Printing
        System.out.println(list);

        // remove all numbers less than five in the list above
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Predicate<Integer> lessthan5 = Y -> Y < 5;
        list1.removeIf(lessthan5);
        System.out.println(list1);

        //remove all names started with "r" and "Z"
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Rahman", "rarzy", "rdil","runar", "Zipper", "Zee"));

        Predicate <String> startwith = n -> n.startsWith("r") || n.startsWith("Z");
        names.removeIf(startwith);
        System.out.println(names);


        // remove all characters which are digit

        Predicate<Character> removeDigit2 = d ->  Character.isDigit(d);
      //OR  Predicate<Character> removeDigit = d -> d >=48 && d <=57;
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4','5', '@','&','Z'));



        chars.removeIf(removeDigit2);
        System.out.println(chars);

        System.out.println("==============================");

        /// we can also use removeIf() directly. Like This
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3.removeIf(n -> n > 5);
        System.out.println(list3);

        System.out.println("=============================");



        // Write a program to print only the special characters
        Predicate<Character> removeExceptsp = d ->  Character.isDigit(d) || d >=65 && d <=90;
        ArrayList<Character> random = new ArrayList<>();
        random.addAll(Arrays.asList('A', 'B', '3', '4','5', '@','&','Z'));
        random.removeIf(removeExceptsp);
        System.out.println(random);

/*
        1. write a program that can return the unique objects from a anArray List of Integers
        Ex:
        list: {1,1,2,3,4,5,5}
        sout(list); ==> {2,3,4};
        Note: 1. DO NOT use any extra arrayList
        2. DO NOT use any loops
        3. do not use any sort method
        4. use predicate only and collections methods only */

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,2,2,3,4,5,6,6,7,7,8,8,9,10,10));

        list5.removeIf(s -> Collections.frequency(list5,s)!=1);
        System.out.println(list5);


    }
}

