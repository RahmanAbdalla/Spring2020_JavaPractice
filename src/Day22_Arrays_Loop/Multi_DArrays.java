package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {

        int [] arr ={1, 2, 3};
        //           0  1  2

        // n dimensional array contains ( n - 1 ) dimensional arrays

        // 2D arrays:
        int [][] arr2D = {  {1,2,3}, {4,5,6}  };
                    //         0         1
        int [] arr1D = arr2D[0];//{1, 2, 3}
        System.out.println(Arrays.toString(arr1D));

        System.out.println(Arrays.toString(arr2D[0]));//{1, 2, 3}

        System.out.println(arr2D[0][2]);// 3 we don't use Arrays.toString coz it's a single value

        System.out.println(Arrays.deepToString(arr2D));//{1,2,3}

        System.out.println(Arrays.toString(arr2D[1]));//{4,5,6}


        for (int eachElement : arr2D[0]){//we're printing each element of arr1D from arr2D

            System.out.println(eachElement+" ");//{1,2,3}
        }


        for (int i =0; i < arr2D[0].length; i++){//first we call arr1D index which is 0 then
                                                //which goes to {1,2,3}, then we can print it
                                                    //using i
            System.out.print(arr2D[0][i]+" ");
        }
        System.out.println();

                        //        0         1       2         0         1         2
        String name [][] =  { {"Rahman", "Adil", "Barzy"}, {"Hunar", "Hardi", "Rawand"}   };
                        //                0                             1

        // print "Rahman"

        // first we can create a new array string to store name[0] index, which is "Rahman", "Adil", "Barzy"}

        String word [] = new String[name[0].length];// we add : [Rahman, Adil, Barzy] to this new String

        for (int i=0; i < name[0].length; i++){

            word[i] = name[0][i];// Rahman Adil Barzy
        }

        System.out.println(Arrays.toString(word));

        System.out.println(name[0][1]);// Adil








    }
}
