package Day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Rahman Abdalla";

        char [] ch = name.toCharArray();// it even counts the spaces
        System.out.println(Arrays.toString(ch));


        // CHECK if these two strings are made of same character

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        //first: we need to change the strings to chaArray
        char []ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        System.out.println(ch1);
        //second: we have to sort them coz it order them in ascending order
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        // third: we create a boolean to check their equality
        boolean b = Arrays.equals(ch1,ch2);
        System.out.println(b); // true

    }
}
