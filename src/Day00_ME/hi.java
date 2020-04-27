package Day00_ME;

import Resourses.Library;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        s =s.toLowerCase();
        String res ="";
        for (int i=0; i < s.length(); i++){

            if (i %2 ==0){
                res += s.substring(i,i+1).toLowerCase();
            }else {
                res += s.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(res);






    }

 }












