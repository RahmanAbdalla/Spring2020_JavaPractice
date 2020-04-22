package Day21_MultiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {


        int [] arr1D = {1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int [] [] arr2D = {  {1,2,3}, {4,5,6}  };
        //this prints some hash codes
        System.out.println(Arrays.toString(arr2D));//Arrays.toString is designed for 1 dimensional array

        //But we use Arrays.deepToString() method to print multi dimensional array
        System.out.println(Arrays.deepToString(arr2D));// [[1, 2, 3], [4, 5, 6]]

                        //         0        1                0          1
        int [][][] arr3D = { {  {1,2,3}, {4,5,6}  }  , {  {7,8,9}, {10,11,12}  }   };
                        ///            0                            1
        System.out.println(Arrays.deepToString(arr3D[1]));//[[7, 8, 9], [10, 11, 12]]

        System.out.println(Arrays.toString(arr3D [0][1]));//[4, 5, 6]

        System.out.println((arr3D[1][1][2]));// 12




    }
}
