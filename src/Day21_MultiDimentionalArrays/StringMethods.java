package Day21_MultiDimentionalArrays;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";
        char [] ch = name.toCharArray();

        System.out.println(ch[0]);// J
        System.out.println(ch[3]);// a


        // Split Method
        String str = "I like Java";

        String []arr = str.split(" ");// we split by a space
        System.out.println(Arrays.toString(arr)); // [I, like, Java]

        /*
        reverse this: today is great day
                      day great is today
         */
        String sentece = "Today is great day";
        String []words = sentece.split(" ");

        System.out.println(Arrays.toString(words));// res" [Today, is, great, day]

        String reverse = "";// we can also use this
        for (int i=words.length-1; i >=0; i--){

            // OR String eachWords = words[i];
            //System.out.print(eachWord+" ");
            reverse +=words[i]+" ";

            System.out.print(words[i]+" ");//res: day great is Today
        }
        System.out.println();
        System.out.println(reverse);// res: day great is Today


        String str2 = "ABCD"; //get this result: [A, B, C, D]
        String arr2 [] = str2.split("");

        char ch2[] = str2.toCharArray();// we can also use this

        System.out.println(Arrays.toString(ch2));//[A, B, C, D]
        System.out.println(Arrays.toString(arr2));//[A, B, C, D]









    }
}
