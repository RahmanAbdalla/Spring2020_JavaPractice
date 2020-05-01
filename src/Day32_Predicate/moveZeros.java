package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveZeros {
    public static void main(String[] args) {

    /*    Write a program that can move all the zeros to  last indexes of ArrayList
        Ex:
        list:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
        DO NOT USE SORT method, DO NOT declear  any extra lists
     */

            ///  First Solution
            ArrayList<Integer> zeros = new ArrayList<>();
            zeros.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

            int count=0;
            for (Integer each : zeros){
                if (each == 0){
                    count++;
                }
            }
        System.out.println(count);

           zeros.removeAll(Arrays.asList(0));

           for (int i=0; i < count; i++){
               zeros.add(0);

           }
        System.out.println(zeros);



        /// Second Solution. Much Easier

        int count2 = Collections.frequency(zeros,0);
        System.out.println(count2);

        zeros.removeAll(Arrays.asList(0));
        for (int i=0; i < count2; i++){
            zeros.add(0);
           // zeros.add(0,0); if we want to put zeros at the beginning

        }
        System.out.println(zeros);

    }

}
