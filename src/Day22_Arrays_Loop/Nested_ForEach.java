package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        for (int each : arr){
            System.out.println(each);
        }
        System.out.println("==========================");

        // We can also apply for each loop do multi dimensional arrays. Like this

        int [][] arr2D = {  {1,2,3}, {4,5,6}  };

        for (int[] each1Darray: arr2D) {

            System.out.println(Arrays.toString(each1Darray));/* this prints all 1D array inside
            the 2D array, in order to print all elements together we need another foreach loop */

            for (int eachElement : each1Darray){
                System.out.println(eachElement);
            }
        }

        System.out.println("=====================");

        char [][] ch2D = {  {'A', 'B'},  {'C', 'D','E'}  };

        for (char [] each1Dchar : ch2D){

            for (char eachElement : each1Dchar){
                System.out.println(eachElement);
            }
        }

    }
}
