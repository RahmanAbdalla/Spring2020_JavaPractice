package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class returnDuplicate {
    public static void main(String[] args) {

      /*  write a program that can return the duplicated values from an ArrayList of String
        Ex:
        list: {"A", "B", "A", "C", "D"};
        output: ["A"]
        list: {"A", "B", "B", "C", "D", "D"};
        output: ["A", "C"]

       */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("R", "B", "R", "H", "B", "A"));

        ArrayList<String> list2 = new ArrayList<>();

        /// First Solution
       for (String each2 : list) {
            int count = 0;
            for (String each : list) {
                if (each2.equals(each)) {
                    count++;
                }
            }

           if (count > 1 && !(list2.contains(each2))) {// we need to give another condition that if list2 doesn't
                // contain the word then add
                list2.add(each2);
            }
        }
        System.out.println(list2);



        System.out.println("========================");

        /// Second Solution
        for (String each : list) {
            int count2 = Collections.frequency(list, each);
            if (count2 > 1 && !(list2.contains(each))) {
                list2.add(each);
            }
        }
        System.out.println(list2);

        System.out.println("==========================");
        //using regular for loop
        for (int i = 0; i < list.size(); i++) {
            int count3 = Collections.frequency(list, list.get(i));
            if (count3 > 1 && !(list2.contains(list.get(i)))) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);


        int [] arr = {0,2,9,0,1,7,0,10,0,0,8,0};

        ArrayList<Integer> notZeros = new ArrayList<>();

        int countZeros=0;
        for (int each: arr
             ) {
            if (each==0){
                countZeros++;
            }else {
                notZeros.add(each);
            }
        }

        arr = new int[notZeros.size()+countZeros];

        for (int i=0; i<notZeros.size(); i++){
            arr[i] = notZeros.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
