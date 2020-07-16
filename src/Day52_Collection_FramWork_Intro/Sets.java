package Day52_Collection_FramWork_Intro;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

        // Set doesn't accept duplicated objects. And it Randomly 'prints out the objects
        Set<String> names = new HashSet<>();

        names.add("Rahman");
        names.add("Hardi");
        names.add("Adil");
        names.add("Hunar");
        names.add("Rawand");
        names.add("Hardi");
        names.add("Hardi");
        names.add("Hardi");

        System.out.println(names); //[Rahman, Rawand, Adil, Hardi, Hunar]

        //However LinkedHashSet prints the objects as it it inserted

        Set<String> names2 = new LinkedHashSet<>();

        names2.add("Rahman");
        names2.add("Hardi");
        names2.add("Adil");
        names2.add("Hunar");
        names2.add("Rawand");
        names2.add("Hardi");
        names2.add("Hardi");
        names2.add("Hardi");

        System.out.println(names2); //[Rahman, Hardi, Adil, Hunar, Rawand]

        // Now we can easily remove duplicate from lists using HasSet, OR LinkedHasSet

        String arr [] = {"A", "A", "B", "C","C", "D"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(arr));

        System.out.println(set1); //[A, B, C, D]

       //  System.out.println(set1.get(1)); Coz there's no index number in Set


        System.out.println("================================");

        // TreeSet() removes duplicated and sort it at the same time
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(Arrays.asList(10,22,5,3,15,7,7,8,9));
        System.out.println(numbers);




    }
}
