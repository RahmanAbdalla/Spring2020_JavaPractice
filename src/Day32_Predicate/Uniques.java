package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        //write a program that can return the unique objects from an ArrayList of characters and put in another ArrayList


        Character [] chars = {'A','A','B','C','D','C', 'D'};

        ArrayList<Character> charlist = new ArrayList<>(Arrays.asList(chars));

        ArrayList<Character> resList = new ArrayList<>();

        for (Character each : charlist) {
            int count = Collections.frequency(charlist, each);
            if (count == 1) {
                resList.add(each);
            }
        }
        System.out.println(resList);


    }
}
