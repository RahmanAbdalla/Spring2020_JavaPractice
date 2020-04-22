package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100,200,300};

        System.out.println(arr[1]);

        for (int i=0; i < arr.length; i++){

            int num = arr[i];
            System.out.println(num);
        }
        System.out.println("====================");
        int j = 0;
        while (j < arr.length){

            int num = arr[j];
            System.out.println(num);
            j++;
        }

        System.out.println("====================");

        String [] names = {"Rahman", "Adil", "Hunar"};

        String [] reverse = new String[names.length];

        int l=0;
        for (int k = names.length-1; k >=0; k--){

            reverse[l]=names[k];
            l++;
          //OR  System.out.print(names[k]+" ");

            //We CANNOT say
            /*reverse[k]=names[k]; coz k starts from index 4 of (names), and we want (reverse)
            to start from (0), therefore we need another variable (increment or decrement)like l
             */

        }
        System.out.println();
        System.out.print(Arrays.toString(reverse)+" ");

 /*
        // USING While


        int l=0;
        int k =names.length-1;

        while ( k>=0){

            reverse[l]=names[k];
            l++;
            k--;
        }
        System.out.println(Arrays.toString(reverse));

 */
    }
}
