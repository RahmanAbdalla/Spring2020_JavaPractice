package Day21_MultiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Shortest_Words {
    public static void main(String[] args) {


        String text[] = {"Rahman", "Ramadan", "Hello World", "Wali", "Mohammed", "Abdulkareem"};

        int maxlength = text[0].length();// we assume that 1st element of the array has the longest length
        int minength2 = text[0].length();

        String longest = " ";
        String shortest = "";

        for (int k = 0; k < text.length; k++) {

            if (text[k].length() > maxlength) {
                maxlength = text[k].length();//when the next element has longest length, we replace
                //  the previous one

                longest = text[k];// then we need to save it here so we can retrieve it later
            }
            if (text[k].length() < minength2){
                minength2 = text[k].length();
                shortest = text[k];
            }
        }
        System.out.println("Shortest word is: "+ shortest);
        System.out.println("Longest word is: "+longest);

        System.out.println("************************************");

        // We can also store longest and shortest string in a String Array

        String longest2Arr[] = new String[1];// size is 1 coz we store one string in it
        String shortest2SArr[] = new String[1];// same here

        int maxlength2 = text[0].length();
        int minength3 = text[0].length();

        for (int k = 0; k < text.length; k++) {

            if (text[k].length() > maxlength2) {
                maxlength2 = text[k].length();//when the next element has longest length, we replace
                //  the previous one
                longest2Arr[0] = text[k];// then we need to save it here so we can retrieve it later
            }
            if (text[k].length() < minength3){
                minength3 = text[k].length();
                shortest2SArr[0] = text[k];
            }
        }
        System.out.println("Shortest word is: "+ Arrays.toString(shortest2SArr));
        System.out.println("Longest word is: "+Arrays.toString(longest2Arr));
    }
}