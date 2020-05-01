package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindingMaxAndMin {
    public static void main(String[] args) {

        //write a program that can remove the second maximum number from an ArrayList
        ArrayList<Integer> list1 =  new   ArrayList<>( );
        list1.addAll(Arrays.asList(4,12,3,4,60,60,7,40,50,50));

        Integer max1 = Collections.max(list1);
        for (int i=0; i < list1.size(); i++){
            list1.remove(max1);
        }
        Integer max2 = Collections.max(list1);
        System.out.println("Second max number is: "+max2);
        // OR
       /* Integer max1 = Collections.max(list1);
        list1.retainAll(Arrays.asList(max1));
        Integer max2 = Collections.max(list1);

        */



        //write a program that can remove the second maximum number from an ArrayList

        ArrayList<Integer> list2 =  new   ArrayList<>( );
        list2.addAll(Arrays.asList(4,12,3,4,60,60,3,7,40,50,4,50));

        Integer min1 = Collections.min(list2);
        for (int i=0; i < list1.size(); i++){
            list2.remove(min1);
        }
        int min2 = Collections.min(list2);
        System.out.println("Second min number is: "+min2);

        // OR
       /* Integer min1 = Collections.min(list1);
        list1.retainAll(Arrays.asList(min1));
        Integer min2 = Collections.min(list1);

        */

    }
}
