package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortingArrayWithoutSort {


    public static int[] Sort(int[] a) {

        Set<Integer> list = new TreeSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int each : a) {
            list.add(each);
        }

        list1.addAll(list);

        a = new int[list1.size()];
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            a[i] += list1.get(i);
        }

        return a;
    }
}
