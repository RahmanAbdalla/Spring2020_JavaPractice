package Day22_Arrays_Loop;

import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReveverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
            write a program that sort the array in descending order
            * for this kind of task we need to:
            1- sort they array if it's not sorted
            2- declare another valuable with NEW keyword, and assign it to the
               first variable's length.
            3- last assign each index of the old variable to the new one using for loop
               But we definitely need another variable like (k) in line 33, and assign it
               to the length of the first variable
         */

        int arr [] = {10,78,2,-1,45,34};

        Arrays.sort(arr); // first we need to sort the array and then reverse the sorted to decending order

        System.out.println("Sorted in ascending order : "+Arrays.toString(arr));

        int []  revArr = new int[arr.length];

        int k = arr.length-1; //we need this k coz each time we need to decrease arr value by 1

        for (int j=0; j < arr.length; j++) {

            revArr[j] = arr[k];
            k--;
        }
        System.out.println("Sorted in descending order: "+Arrays.toString(revArr));



        String [] arra = {"Rahman", "Ali", "Adil"};

        for (int i = arra.length-1; i >= 0;  i--){

            System.out.println(arra[i]+" ");
        }

    }
}
