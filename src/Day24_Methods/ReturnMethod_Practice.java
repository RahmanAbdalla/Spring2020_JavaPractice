package Day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnMethod_Practice {
    /*
    create a function that can return the max number from any given array
     */

    public static int maxNum (int [] arr){

        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    public static void main(String[] args) {

        int [] arr  = {9,5,4,7,4,21,3,11,2};

        int max = maxNum(arr);
        System.out.println(max);

        int min = minNum(arr);
        System.out.println(min);
    }

    public static int minNum (int [] arr) {

        Arrays.sort(arr);
        return arr[arr[0]];
    }

    }
