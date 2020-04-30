package Day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> list1 =new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        //********************* contains() METHOD *************************
        // it returns boolean

        boolean b= list1.contains("C");
        System.out.println(b); // True

        //********************* equals() METHOD *************************
        // it returns boolean
        ArrayList<String> list2 =new ArrayList<>();
        list2.add("A");
        list2.add("D");
        list2.add("C");
        list2.add("B");
        boolean b1 = list2.equals(list1);
        System.out.println(b1);//False,  coz the order of the element is different, once we sort the it gives TRUE


        //********************* sort() METHOD *************************
        Collections.sort(list1);
        Collections.sort(list2);
        boolean b2 = list1.equals(list2);
        System.out.println(b2); // True coz we sorted both lists


        //reversing an ArrayList
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(400);list3.add(600);list3.add(100);list3.add(300);

        // we can also add it to another list
        ArrayList<Integer>reversedList = new ArrayList<>();
        Collections.sort(list3);
        for (int i = list3.size()-1; i >=0; i--){
            reversedList.add(list3.get(i));
        }
        System.out.println(reversedList);


        //********************* isEmpty() METHOD *************************
        // it returns boolean
        boolean b3 = list3.isEmpty();// FALSE coz it's NOT empty, BUT if we use clear() then it becomes TRUE
        System.out.println(b3);




    }
}
