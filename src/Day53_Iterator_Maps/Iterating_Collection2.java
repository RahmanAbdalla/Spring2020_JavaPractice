package Day53_Iterator_Maps;

import java.lang.reflect.Array;
import java.util.*;

public class Iterating_Collection2 {
    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<>(
                Arrays.asList("Adil", "Adil", "Rahman", "Hunar", "Hawar", "Rahman", "Z"));
        System.out.println(names);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String eachname = iterator.next().toLowerCase();

            if (eachname.startsWith("a") || eachname.startsWith("h")) { //[Rahman, Z]

                iterator.remove();
            }

        }

        System.out.println(names);


        System.out.println("==========================");
        LinkedHashSet<String> students = new LinkedHashSet<>(
                Arrays.asList("Adil", "Adil", "Rahman", "Hunar", "Hawar", "Rahman", "Z"));
        System.out.println(students);

        for (Iterator<String> i = students.iterator(); i.hasNext(); ) {
            if (i.next().contains("H")) { // removes "Hunar, Hawar"
                i.remove();
            }
        }

        // Shortest way
        students.removeIf(each -> each.contains("H"));
        System.out.println(students);

        System.out.println("================= Bulk Operation ===============");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        T.removeAll(Arrays.asList("Mehmet", "Ozgur", "Mohammed"));

        System.out.println(T);

        System.out.println("=================================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Yucel", "Sha",
                "Ozgur", "Ahmet", "Osman", "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));

        R.retainAll(Arrays.asList("Yucel", "Sha", "Ahmet"));

        System.out.println(R);


        System.out.println("====================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        // Verify if 5,6,8,9 are contained in the list

        boolean res = list.containsAll(Arrays.asList(5,6,8,9));

        System.out.println(res);

    }
}
