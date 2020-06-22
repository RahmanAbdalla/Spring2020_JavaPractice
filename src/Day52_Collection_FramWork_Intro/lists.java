package Day52_Collection_FramWork_Intro;

import java.util.*;

public class lists {
    public static void main(String[] args) {

        //******************** ArrayList *********************
        //1- We can make objects from ArrayList by making List the reference type
        List<Integer> list1 = new ArrayList<>();// polymorphisim coz parent name(List) is used to refer to child's obj
        list1.add(1);

        // List<Integer> list2 = new List(); coz List is interface and it CANNOT have objects


        //******************** List *********************
        //2- We can make objects from linkSet by making List the reference type
        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);


        //******************** Vector *********************
        //3- We can make objects from Vector by making List the reference type
        List<Integer> list3 = new Vector<>();
        list3.add(10);


        //******************** Stack *********************
        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("===========================");

        Stack<String> names = new Stack<>();
        names.add("Rahman");
        names.add("Barzy");
        names.add("Adil");
        names.add("Hunar");
        names.add("Muhtar");

        // pop() method prints the last added one and remove it form the stack too
        System.out.println(names.pop()); // Muhtar
        System.out.println(names); //[Rahman, Barzy, Adil, Hunar]

        //if we call pop() again it will remove the second last added name
        String s1 = names.pop();

        System.out.println(s1); // Hunar
        System.out.println(names); //[Rahman, Barzy, Adil]

        //push() method adds object to the stack just like add() method
        names.push("Hardi");
        System.out.println(names); //[Rahman, Barzy, Adil, Hardi]



    }
}
