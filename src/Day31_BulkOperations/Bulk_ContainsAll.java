package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);


        // if 10,20,60 if all objects exist in the ArrayList ==> true
        // otherwise ==> false
        // if we don't use containAll()method then we have to use three different contains()method
        /*
        boolean b1 = list1.contains(10);
        boolean b2 = list1.contains(10);
        boolean b3 = list1.contains(10);
        boolean result = b1==true && b2 ==true && b3 == true;

        if (result){
            System.out.println(result);
        }
         */

        // instead of doing all those steps above we can use containsAll()
        // But we MUST use Arrays.asList() inside containsAll() body coz containsAll() by itself doesn't take
        // object but Array.asList collects objects so we can put it inside the body
        boolean b1 = list1.containsAll(Arrays.asList(10,20,30));
        System.out.println(b1); // false

        // OR we can make an array of Integer
        Integer [] data = {10,30,40};
        boolean b2 = list1.containsAll(Arrays.asList(data));
        System.out.println(b2);


    }
}
