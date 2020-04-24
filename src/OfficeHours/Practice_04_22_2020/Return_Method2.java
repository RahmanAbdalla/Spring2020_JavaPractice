package OfficeHours.Practice_04_22_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Return_Method2 {
    public static void main(String[] args) {

        int [] arr = {100,40,500,50,30,900,100,-5,1000};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max =  maxNum(arr);
        System.out.println(max);


    }

    public static int maxNum (int [] arr){


        Arrays.sort(arr);

        return arr[arr.length-2];
    }
}
