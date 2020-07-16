package Day52_Collection_FramWork_Intro;

import sun.jvm.hotspot.oops.Array;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(19,3,5,2,79));

        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("=================================");

        // 1- sort the array and remove duplicate

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(3,5,2,6,89,1,7,7,3,5,6,54,65));

        // One way
        // We need to reinstantiate the arrayList
        arrayList = new ArrayList<>(new TreeSet<>(arrayList));


        // OR Second way
        // TreeSet<Integer> treeSet = new TreeSet<>(arrayList);

       //  arrayList = new ArrayList<>();
      //   arrayList.addAll(treeSet);

        System.out.println(arrayList);

        System.out.println("============================");
        // Write a program that can remove duplicates and keep the order as it is

        ArrayList<Character> arrayList1 = new ArrayList<>(Arrays.asList('D','S','S','A','A','E','R'));

        arrayList1 = new ArrayList<>( new LinkedHashSet<>(arrayList1) );

        System.out.println(arrayList1);


        System.out.println("================ frequency ==============");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A","A","C","B","D"));

        int freq = Collections.frequency(letters,"A");
        System.out.println("A has occurred "+freq+" times");
        boolean res = Collections.frequency(letters,"A") ==1;
        System.out.println(res);
    }
}
