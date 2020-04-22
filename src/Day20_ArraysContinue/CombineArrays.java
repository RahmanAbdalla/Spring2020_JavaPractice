package Day20_ArraysContinue;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // can contain all the elemnts from array1 and array 2
        //OR   int arr3[]=new int[10];

        // OR  (int i=0; i <=2; i++)
        for (int i = 0; i < arr1.length; i++) {/* this loop adds arr1[] value to arr3[] value from 0 ~2
                                        and arr3[] become {1,2,3,0,0,0,0} */
            arr3[i] = arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {/* this loop adds arr1[] value to arr3[] value from 3 ~6
                                   and arr3[] become {1,2,3,4,5,6,7} */
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));



      // Second Solution
        int arra1[] = {1,2,3};
        int arra2[] = {4,5,6,7};

        int arra3[] = new int[arr1.length+arr2.length];

        int count =0;
        for (int i = 0; i<arra1.length; i++) {
            arra3[count] = arra1[i];
            count++;
        }
        for(int i =0; i<arra2.length; i++){
            arra3[count]=arra2[i];
            count++;
        }
        System.out.println(Arrays.toString(arra3));


    }
}
