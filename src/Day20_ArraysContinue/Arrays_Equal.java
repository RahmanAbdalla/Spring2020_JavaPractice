package Day20_ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_Equal {
    public static void main(String[] args) {

       int[]arr1 = {1,2,3};
       int[]arr2 = {1,2,3};

       boolean result =  Arrays.equals(arr1,arr2);// true. this method checks index of each array
        System.out.println(result);

        int[]arr3 = {1,3,2};
        int[]arr4 = {3,1,2};
        boolean result2 = Arrays.equals(arr3,arr4);//false coz it checks the indexes.
        System.out.println(result2);//false

        // we need to sort them in order to return (true)
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        boolean result3 = Arrays.equals(arr3,arr4);
        System.out.println(result3);// true

        // when arrays have different length then result is ALWAYS false
        int []arr5 = {1,2,3};
        int []arr6 = {1,2,3,4};
        boolean result4 = Arrays.equals(arr5,arr6);
        System.out.println(result4);//false coz of different length




    }
}
