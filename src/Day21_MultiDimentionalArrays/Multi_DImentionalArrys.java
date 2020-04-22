package Day21_MultiDimentionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_DImentionalArrys {
    public static void main(String[] args) {

        int []arr = {1,2,3};
                         //  0 1 2     0 1 2 3 4
        int [][] arr2D = {  {1,2,3} , {3,4,5,6,7}  };
                        //     0    ,      1     ,       2
        System.out.println(arr2D.length);// length is 3

        // we can retrieve arr2D index and assign them to single dimensional array: LIKE THIS

        int [] arr1De = arr2D[0];// we give arr2D and its index which is 0 in this case
        System.out.println(Arrays.toString(arr1De));// {1,2,3}

        System.out.println(Arrays.toString(arr2D[1]));//{3,4,5,6,7} we can also print of index of arr2D

        int num1 = arr2D [1] [3];
        System.out.println(num1);// returns : 6


        // Char Dimentional Array

                        //   0  , 1      0 ,  1 ,  2      0    1    2
        char [] [] ch2D = { {'A', 'B'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}  };
                //             0     ,         1               2

        char ch = ch2D [1] [0]; // it returns 'D'
        System.out.println(ch);

        char ch1 [] =  ch2D [2];
        System.out.println(Arrays.toString(ch1));// res: {'G', 'H', 'I'}

                            //  0   1   2       0   1   2      0   1   2
        String [][] str2D = { {"A","B","C"} , {"E","F","G"}, {"H","I","J"}  };
                        //         0                1               2

        String str1 = str2D [2] [2];// "J"

        System.out.println(str1);
    }
}
