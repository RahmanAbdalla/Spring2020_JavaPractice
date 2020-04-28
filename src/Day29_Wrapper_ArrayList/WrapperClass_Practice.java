package Day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {


        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE; // 2.5

        for(String each: arr){ // 5, each: 1, 2.5, 3, 3.5, 4.5
            double num = Double.parseDouble(each);

            if( num > max){
                max= num;
            }

        }

        System.out.println(max);

        System.out.println("============================");

        // The second way

        String[] arr2 = {"1", "5.5", "3", "3.2", "4.5"};
        double [] d = new double[arr2.length];

        double max2 = Double.MIN_VALUE;
        for (int i=0; i < arr2.length; i++){
            if (Double.parseDouble(arr2[i]) > max2){
                max2 = Double.parseDouble(arr2[i]);
            }
            d[i] = Double.parseDouble(arr2[i]);// we MUST convert string array indexes INDIVIDUALLY
            // We CANNOT give write d[i] = arr[i]
        }
        System.out.println(max2);
        System.out.println(Arrays.toString(d));

        Arrays.sort(d);
        System.out.println("Sorted Array: "+Arrays.toString(d));
        System.out.println("Max array num is: "+d[d.length-1]);

        }

    }
