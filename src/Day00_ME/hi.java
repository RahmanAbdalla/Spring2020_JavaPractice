package Day00_ME;

import Resourses.Library;
import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.awt.*;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         boolean b = isprime(3);
        System.out.println(b);
        for (int k=0; k <=500; k++){
            if (isprime(k)){
                System.out.print(k+" ");
            }
        }


    }

    public static boolean isprime (int n){

        if (n% 2 !=0 && n%3 != 0 && n %5 !=0 && n % 7 != 0 && n %11 !=0){
            return true;
        }else {
            return false;
        }

    }

    }



