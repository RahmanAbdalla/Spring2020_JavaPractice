package Day23_Methods;

import sun.jvm.hotspot.runtime.solaris_x86.SolarisX86JavaThreadPDAccess;

import java.util.Scanner;

public class Method_WithParameters2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();

        reverseString(word);
        System.out.println("Hello World");

    }


    public static void reverseString (String str){


        for (int i= str.length()-1; i >=0; i--){

            System.out.print(str.charAt(i)+"");
        }
        System.out.println();//we need this so the next print above in main method will be in the next line
    }
}
