package Day20_ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Size {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3}; // 0 ~ 2
                    //0  1  2
     //   System.out.println(arr1[100]);// out of bound ERROR coz array's size is fixed

        int[] nums ; // values now are {0 , 0};
        nums = new int[2];
        nums[0] = 10;
        nums[1] = 20;
      //  nums[2] = 30; // give error

    //    System.out.println(nums[0]);//0   :this prints values of the first array in line 10
     //   System.out.println(nums[1]);//20

        nums = new int[4]; // reset the array size. {0, 0, 0}. THIS     refers to the new one
        nums[2]= 30;
        nums[3]= 40;// not the old one.

        System.out.println(Arrays.toString(nums));
      //  System.out.println(nums[0]);//0  :this prints values of the new array in line 18
       // System.out.println(nums[1]);//0
    }
}
