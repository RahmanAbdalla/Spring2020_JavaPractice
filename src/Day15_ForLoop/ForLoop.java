package Day15_ForLoop;

import java.io.StringReader;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        for (int i=0 ; i<5; i++){ // if iterator =i-- then code will run infinitely coz i will
                                    // become negative and never be greater than 5
            System.out.println("Hello World");
        }
        for (int i=1; i<=11; i+=2){// no matter if you use pre or post increment or decrement
            System.out.println("Hello World");//
        }

        for (int i=1; i<=11; i++){
            System.out.println(i*i);
        }




        /*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
        System.out.println("Write you word to be reversed");

        String word = scan.next();


        int length = word.length()-1;
        String reverse ="";

        for (int num=length; num >=0; num--) {

            reverse+=word.charAt(num);
        }
        System.out.println(reverse);
        if (reverse.equals(word)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
