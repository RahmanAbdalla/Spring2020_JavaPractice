package OfficeHours.Practice_04_15_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        /*
        String methods:
            1- toCharArray():returns char array
            2- split():
         */
        String str = "Cybertek";

        char ch [] = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(str.length() == ch.length);// true

        /*
        str1= "abc" , str2 = "cab"
            1: we need to convert them to char
            2: we need to sort them
         */

        String str1 = "ABC";
        String str2 = "BAC";

        char ch1 [] = str1.toCharArray();
        char ch2 [] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));// true


        int  count=0;
        for (int i=0; i < ch1.length; i++){

            if (ch1[i] != ch2[i]){
                count++;
            }
        }
        if (count ==0){
            System.out.println("Both are same");
        }else {
            System.out.println("They are not same");
        }

        System.out.println("=======================");

        // write a program to print total num of words user inputs

        String sentence = "I like to learn java";

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int totalWords = words.length; // coz we split it, so total num of words is word's length
        System.out.println(totalWords);// 6


        for (int k = words.length-1; k >=0; k--){

            System.out.print(words[k]+" ");
        }
    }
}
