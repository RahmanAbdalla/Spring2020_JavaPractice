package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list1 =  new   ArrayList<>( );
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list1);
        System.out.println(max);

        int min = Collections.min(list1);
        System.out.println(min);

        System.out.println("======================");

        ///************** swap() METHOD ******************

        ArrayList<Integer> list2 =  new   ArrayList<>( );
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(list2,1,8);
        System.out.println(list2);

        ///****************** replaceAll() METHOD ******************

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ali","Ali","Ali","Adil"));

        System.out.println(names);
        Collections.replaceAll(names,"Ali","Rahman");

        System.out.println(names);

    }
}
