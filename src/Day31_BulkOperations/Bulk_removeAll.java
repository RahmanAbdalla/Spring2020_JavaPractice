package Day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Adil", "Rahman", "Barzy", "Hardi", "Barzy", "Adil", "Hunar"));
        System.out.println(list1);
        //remove duplicate from list1 above
        // we basically need another ArrayList to store the result

        list1.removeAll(Arrays.asList("Adil", "Barzy"));
        System.out.println(list1);
    }
}
