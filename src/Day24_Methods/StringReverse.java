package Day24_Methods;

import java.io.StringReader;

public class StringReverse {
    public static void main(String[] args) {

        reverse("Cybertek");// we cannot assign it to a variable coz it's void

        String name = reverse2("School");// but we can for this one

        System.out.println(name);



    }

    public static void reverse (String str){

        String reverse = ""; // we want to reuse it again in the main method, but we CANNOT
        for (int i=str.length()-1; i >=0; i--){ // use it again coz it's void method
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverse2 (String str){

        String reverse = ""; // we want to reuse it again in the main method, but we CAN reuse it coz it's NOT void
        for (int i=str.length()-1; i >=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
