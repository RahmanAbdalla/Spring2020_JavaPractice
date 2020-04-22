package Day22_Arrays_Loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecendingOrder {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5};



            for (int i = arr.length - 1; i >= 0; i--) {

                System.out.print(arr[i]+" ");
            }


        int []arrRev = new int[arr.length]; //arRev = [0,0,0,0,0]

       /* we have to do this step several time so we use loop

        arrRev [0] = num [4]; when arrRev value is (0) we need to assign num value which is (4)
        arrRev [1] = num [3]; when arrRev value is (1) we need to assign num value which is (3)
        arrRev [2] = num [2]; when arrRev value is (2) we need to assign num value which is (2)
        arrRev [3] = num [1]; when arrRev value is (3) we need to assign num value which is (1)
        arrRev [4] = num [0]; when arrRev value is (4) we need to assign num value which is (0)

        */

        int k = arr.length-1; //we need this k coz each time we need to decrease arr value by 1

        for (int j=0; j < arr.length; j++) {

            arrRev[j] = arr[k];
            k--;

            }
        System.out.println(Arrays.toString(arrRev));
        }
    }
