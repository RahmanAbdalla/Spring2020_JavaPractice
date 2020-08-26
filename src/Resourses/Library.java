package Resourses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Library {

    public static int[] sortDescending(int[] arr) {

        Arrays.sort(arr);

        int[] reveArr = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reveArr[k] = arr[i];
            k++;
        }
        return reveArr;

    } // end of first method

    // Reverse String
    public static String reverse2(String str) {

        String reverse = ""; // we want to reuse it again in the main method, but we CAN reuse it coz it's NOT void
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;

    } // end of second method

    // Unique Character
    public static String uniqueCharacter(String st) {

        String result = "";

        for (int k = 0; k <= st.length() - 1; k++) {

            int count2 = 0;
            for (int i = 0; i <= st.length() - 1; i++) {
                if (st.charAt(i) == st.charAt(k)) {
                    count2++;
                }
            }
            if (count2 == 1) {// this if condition relates to teh outer loop NOT the inner loop
                result += st.charAt(k);
            }
        }
        return result;
    }

    // Count Duplicate
    public static String countDuplicate(String st) {

        String res = "";
        String[] words = st.split(" ");  //Split the word from String
        int wrc = 1;    //Variable for getting Repeated word count

        for (int i = 0; i < words.length; i++) //Outer loop for Comparison
        {
            for (int j = i + 1; j < words.length; j++) //Inner loop for Comparison
            {

                if (words[i].equals(words[j]))  //Checking for both strings are equal
                {
                    wrc = wrc + 1;    //if equal increment the count
                    words[j] = "0"; //Replace repeated words by zero
                }
            }
            if (words[i] != "0")
                res += words[i] + "--" + wrc + " \n"; //Printing the word along with count
            wrc = 1;

        }

        return res;
    }

    // maximum Array
    public static int maxArray(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //Minimum Array
    public static int minArray(int[] arr) {

        Arrays.sort(arr);
        return arr[0];
    }

    // merge two array and return third one
    public static int[] mergArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];


        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int l = 0; l < arr2.length; l++) {
            arr3[arr1.length + l] = arr2[l];
        }

        return arr3;
    }

    // Split string to array and reverse
    public static String[] stringToArrayRev(String st) {

        String[] arr = st.split(" ");
        String res[] = new String[arr.length];

        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k] = arr[i];
            k++;
        }
        return res;
    }

    // Reverse Array String
    public static String[] reversArrayString(String[] arr) {

        String res[] = new String[arr.length];

        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k] = arr[i];
            k++;
        }
        return res;
    }

    // Sorting Int Array in Descending order
    public static int[] sortArrIntDescend(int[] arr) {

        Arrays.sort(arr);
        int res[] = new int[arr.length];

        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[k] = arr[i];
            k++;
        }
        return res;
    }

    // Longest Array
    public static String[] longestArr(String[] text) {

        String longest2Arr[] = new String[1];// size is 1 coz we store one string in it
        int maxlength2 = text[0].length();

        for (int k = 0; k < text.length; k++) {

            if (text[k].length() > maxlength2) {
                maxlength2 = text[k].length();//when the next element has longest length, we replace
                //  the previous one
                longest2Arr[0] = text[k];// then we need to save it here so we can retrieve it later
            }
        }
        return longest2Arr;
    }

    // Shortest Array
    public static String[] shortestArr(String[] text) {

        String shortest2SArr[] = new String[1];// size is 1 coz we store one string in it
        int minength3 = text[0].length();

        for (int k = 0; k < text.length; k++) {

            if (text[k].length() < minength3) {
                minength3 = text[k].length();//when the next element has longest length, we replace the previous one
                shortest2SArr[0] = text[k];// then we need to save it here so we can retrieve it later
            }
        }
        return shortest2SArr;
    }

    //remove duplicate from string
    public static String removeDupl(String st) {

        String res = "";

        for (int i = 0; i <= st.length() - 1; i++) {
            if (res.contains("" + st.charAt(i))) {
                continue;
            }
            res += st.charAt(i);
        }
        return res;
    }// end of Main Method

    //Counting characters
    public static int frequency(String st1, String st2) {
        int count = 0;
        for (int j = 0; j <= st1.length() - 1; j++) {
            if (st1.contains(st2)) {
                count++;
                st1 = st1.replaceFirst(st2, "");
            }
        }
        return count;
    }

    //Frequency of Characters in a String
    public static String frequencyOfChars(String str) {

        String NonDup = Library.removeDupl(str);             //ABC
        String result = ""; //contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//  "A"
            int num = Library.frequency(str, ch);
            result += ch + num;
                /*
                OR we can do this way
                int num =  Library.frequency(str, ""+nonDup.charAt(i));//to find of frequency of non-Dup in main String
                result += nonDup.charAt(i)+""+num;
                 */
        }

        return result;
    }

    // Finding unique character
    public static String uniques(String str) { // "AABCDCD"
        String result = ""; //ACD
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    /* OR We can use FOR EACH Loop
    public static String uniques2(String str) {
        String uniq = "";
        char[] arr = str.toCharArray();
        for (char each : arr) {
            if (frequency(str, each) == 1) {
                uniq += each;
            }
        }
        return uniq;
    }

     */

    // Frequency of chars in a string
    public static int frequency(String words, char ch) {

        //  String arr [] = words.split(" ");
        char ch1[] = words.toCharArray();
        int count = 0;
        for (char each : ch1) {
            if (each == ch) {
                count++;
            }
        }
        return count;

    }

    //Merging Two Strings
    public static String mergeStrings(String one, String two) {
        String res = "";

        for (int i = 0; i < one.length() || i < two.length(); i++) {

            if (i < one.length()) {
                res += one.charAt(i);
            }
            if (i < two.length()) {
                res += two.charAt(i);
            }
        }

        return res;
    }

    //Check if a number is palindrome
    public static void isPalindrome(int num) {

        int palindrome = num;
        int reverse = 0; //
        while (palindrome != 0) {
            int remainder = palindrome % 10; //123%10 ==3 ,  12%10 ==2;
            reverse = reverse * 10 + remainder; //0 *12 +3 ==>3
            palindrome = palindrome / 10; //12 / 10 ==>1.2
        }
        if (num == reverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /* This way Also
     String st = Integer.toString(num);
        String res = "";
        for (int i=st.length()-1; i >=0; i--){
            res +=st.charAt(i);
        }
        if (res.equals(st)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

         */
    }

    //Changes the alternate case changes in a String
    public static String alternateCase(String s) {

        s = s.toLowerCase();
        String res = "";
        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0) {
                res += s.substring(i, i + 1).toLowerCase();
            } else {
                res += s.substring(i, i + 1).toUpperCase();
            }
        }
        return res;
    }

    // finding max number in an ArrayList
    public static int maxArrayList(ArrayList<Integer> list) {

        Integer max2 = Integer.MIN_VALUE;
        for (int k = 0; k < list.size(); k++) {
            // OR (Integer k=0; k< list.size(); k++)
            if (list.get(k) > max2) {
                max2 = list.get(k);
            }
        }
        return max2;


//          OR
//        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,5,2,68,9));
//
//        Collections.sort(list);
//
//        System.out.println(list.get(0));
    }


    // Reverse ListInteger
    public static String reverseList(ArrayList<Integer> list) {
        String res = "";
        for (int k = list.size() - 1; k >= 0; k--) {
            res += list.get(k) + " ";
        }
        return res;
    }

    public static String seperateLetterandDigits(String str) {
        String letters = "";
        String digits = "";
        char array[] = str.toCharArray();
        for (char each : array) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isAlphabetic(each)) {
                letters += each;
            }
        }
        System.out.println(digits);
        return letters;
    }

    //Finding maximum number from an ArrayList
    public static int maxArraylist (ArrayList<Integer> list1) {
        return Collections.max(list1);
    }

    //Finding minimum number from an ArrayList
    public static int minArraylist (ArrayList<Integer> list1) {
        return Collections.min(list1);

    }

}