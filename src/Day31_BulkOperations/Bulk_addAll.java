package Day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30,20,40,50,60,10,

        // if we don't use addAll() method then we have to repeat adding them one by one. Like this
     /*   list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(10); */

     // instead of those repeated steps we can use addAll()
        // or we can create an array of Integers
        Integer [] arr = {30,20,40,50,60,10};
       // list1.addAll(Arrays.asList(arr));
        list1.addAll(Arrays.asList(30,20,40,50,60,10));
        System.out.println(list1);

        System.out.println("============================");
        String [] names = {"Rahman", "Hunar", "Adil", "Barzy"};
          // if we want to add another name to the list we cannot coz array size is fixed, BUT

        //but ArrayList size is dynamic so we can add as many names we want
        ArrayList <String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);
        //now we can easily add other names to the list
        nameList.add("Hardi");
        System.out.println(nameList);

        System.out.println("======================");
        // we can directly add object to the new created ArrayList, Like This
        Integer [] numbers = {1,2,3,4,5,6,7,8};
        ArrayList <Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(nameList);


    }
}
