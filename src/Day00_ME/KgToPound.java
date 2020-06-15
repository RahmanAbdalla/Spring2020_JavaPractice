package Day00_ME;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.lang.reflect.Array;
import java.util.*;
public class KgToPound {
    public static void main(String[] args) {


        String str = "AAABBCCDDDG";
        String str1 = "ADHKNEDJEDD";



        String res = frequency(str);
        System.out.println(res);

        boolean res1 = equals(str,str1);
        System.out.println(res1);

        String sttr = "aabbccddgee";
        String result = uniqueChar(sttr);
        System.out.println(result);

        String str4 = "1er43f";
        int sum = sumOfDigits(str4);
        System.out.println(sum);

        String atirn = "DC501GCCCA098911";

        SortLettersAndNumbersFromString(atirn);
    }

    public static String uniqueChar(String str){

        String unique="";
        for (int k=0; k < str.length(); k++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count++;
                }
            }
            if (count==1){
                unique+=str.charAt(k);
            }
        }
        return unique;
    }

    public static String frequency (String str) {

        String nonDupl = "";

        for (int j = 0; j < str.length(); j++) {

            if (!nonDupl.contains("" + str.charAt(j))) {
                nonDupl += str.charAt(j);
            }

        }
        System.out.println(nonDupl);

        String result = "";

        for (int k = 0; k < nonDupl.length(); k++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDupl.charAt(k)) {
                    count++;
                }
            }
            result += nonDupl.charAt(k) + "" + count;
        }
        return result;
    }

    public static boolean equals(String str1, String str2){


        char [] arr = str1.toCharArray();
        char [] arr2 = str2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        boolean res = Arrays.equals(arr,arr2);

        return res;
    }

    public  static int  sumOfDigits(String s) {

        int sum=0;
        char[] arr = s.toCharArray();
        for (int i=0; i < arr.length; i++){
            if (Character.isDigit(arr[i])){
                sum+= Integer.valueOf(""+arr[i]);
            }
        }
        return sum;
    }


    public static void SortLettersAndNumbersFromString(String str) {

        //Ex:
        //Input:  "DC501GCCCA098911"
        //OutPut: "CD015ACCCG011899"

        char arr [] = str.toCharArray();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}
