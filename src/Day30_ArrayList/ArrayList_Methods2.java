package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("G");
        list.add("C");
        list.add("D");

        System.out.println(list);
        //list.remove(1);
        String str ="G";
        boolean b1 = list.remove(str);// TRUE coz we have obj "G" in the ArrayList
        System.out.println(b1);//true
        String str2 ="Z";
        boolean b2 = list.remove(str2); // FALSE coz we DON'T have obj "Z" in the ArrayList
        System.out.println(b2);//false

        System.out.println(list);//[A, B, C, C, D]
        list.remove(list.lastIndexOf("C"));
        System.out.println(list); //[A, B, C, D]

        // ************ clear() METHOD *****************
        // this methods cleans everything in the ArrayList and changes the size to 0
        list.clear();
        System.out.println(list); // [ ] and  the size becomes 0

        // ************** indexOf(object) ***************
        // calls the object in the given index and it returns int

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);//0
        list2.add(1);//1
        list2.add(2);//2
        list2.add(3);//3
        int n = list2.indexOf(3);/*autoboxing happens coz indexOf() accepts obj, which in this case 3 is
                                 an Object NOT int, and then we assign it to int. */
        System.out.println(n);

        //if we get negative number then it means there's no Such index in the list
        int n1 = list2.indexOf(100);
        System.out.println(n1);// -1 coz there's no index 100 in the list






    }
}
