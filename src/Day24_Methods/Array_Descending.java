package Day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Descending {

    public static void main(String[] args) {

        int [] arr1 = {14,4,6,3,9,1};

        int [] arr2 = {200, 11, 120, 400, 50};

        int [] arr3 = {200, 100, 600, 400};

        arr1 = sortDescending(arr1);
        arr2 =sortDescending(arr2);
        arr3 =sortDescending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));


    }

    public static int [] sortDescending(int [] arr){

        Arrays.sort(arr);

        int [] reveArr = new int[arr.length];
        int k=0;
        for (int i = arr.length-1; i >=0; i--){
            reveArr[k] = arr[i];
            k++;// 0         4
        }
        return reveArr;
    }


}
