package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);

        System.out.println("Original list: "+list1); // 5,7,8

        // ******** add(int index, Integer element) METHOD  ***************

        // add(int index, Integer element) is used for adding elements in a specific index. EX:
         // we want to add 6 at index 1
        list1.add(1,6); // 6 replaces goes to index 1, that's, 7's index

        System.out.println("Adjusted list: "+list1); // list1: 5,6,7,8

        System.out.println("====================================");

        // ************ set (int index, Integer element) METHOD

        // in array we used to do this to replace an element
        int arr [] = {1,2,3,4};
        //if we replace 4 with 5
        arr[3] = 5;

        //but in ArraysList we use set(int index, Integer element) method
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1,"C");
        list2.add(1,"D");
        System.out.println(list2);// [A, D, C, B]

        //set method  get this result {A, D, E, F}
        list2.set(2,"E");
        list2.set(3,"F");
        System.out.println(list2);// {A, D, E, F}

        System.out.println("====================================");

        // ************ remove METHOD *****************

         //1. remove(int num)
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);//0
        list3.add(2);//1
        list3.add(3);//2
        list3.add(4);//3

        list3.remove(2);// remove element at index 2, that's, number 3.
        System.out.println(list3); // {1,2,4}

        //2. remove(object)
        list3.remove(2);// this removes the obj we have in the list NOT the index
        System.out.println(list3); // {1,3,4}

        //3. remove(boolean) used to know if the element removed is true or not

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(1);//0
        list5.add(2);//1
        list5.add(3);//2

       // boolean b = list5.remove(1); ERROR coz this method accepts obj, but int is primitive
        Integer a=2;
        boolean b1 = list5.remove(a);
        System.out.println(b1);//true coz we have object 2 in the list
        Integer a2 =5;
        boolean b2 = list5.remove(a2);
        System.out.println(b2);// false coz we don't have index 5 in the list

    }
}
