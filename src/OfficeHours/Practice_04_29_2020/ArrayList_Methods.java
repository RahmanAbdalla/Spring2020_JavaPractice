package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        /*
        ArrayList: does not support primitive
                    size is dynamic, size is auto-adjusted
                       Has Index numbers
                add(), get(), size(), set(), remove(), clear(), indexOf(), lastIndexOf()
                add(): inserting
                set(): replacing
                remove(int)
                remove(Object)
     */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1,30); // adds the element at the given index

        System.out.println(list);// {10,30,20}
        System.out.println(list.size()); //3

        int num1 = list.get(2);  // Integer 20,  unboxing


        byte a = 100;
        //  Integer b = a;

        Byte a2 =100;
        int b2 = a2;  // unboxing

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        //get this result {A,B,E,C,D}
        list2.add(2,"E");
        System.out.println(list2); //{A,B,E,C,D}

        for (int i=0; i <list2.size(); i++){
            System.out.println(list2.get(i));
        }
        System.out.println();
        for (String each : list2){
            System.out.println(each);
        }

        // list2:  {A, B, E, C, D}; , replace C with F
        //          0  1  2  3  4
        list2.set(3, "F"); //{A,B,E,F,D}

        System.out.println(list2);




    }
}
