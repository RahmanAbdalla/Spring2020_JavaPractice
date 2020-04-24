package OfficeHours.Practice_04_22_2020;

import sun.jvm.hotspot.debugger.windbg.AddressDataSource;

import java.io.StringReader;

public class Return_Method {
    public static void main(String[] args) {

        int res = sum2(10,43);
        System.out.println(res);

        System.out.println("=================");

        String word1 = "Cybertek";
        String word = reverse(word1);
        System.out.println(word);

        System.out.println(word.equalsIgnoreCase(word1));//false :  see if it's palindrome or not


    }


    public static int sum2 (int a, int b){
        return a + b;
    }

    public static String reverse (String st){
        String res= "";
        for (int k = st.length()-1; k >=0;  k--){
            res += st.charAt(k);
        }
        return res;
    }


}
