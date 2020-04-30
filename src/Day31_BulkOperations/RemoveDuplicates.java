package Day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // removing Duplicate from an ArrayList
        ArrayList <String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Adil", "Rahman", "Barzy", "Hardi", "Barzy", "Adil", "Hunar"));
        System.out.println(list1);
        //remove duplicate from list1 above
        // we basically need another ArrayList to store the result
        ArrayList<String > result = new ArrayList<>();
        for (String each : list1){
            if (! (result.contains(each))){
                result.add(each);
            }
        }
        System.out.println(result);


    }
}
