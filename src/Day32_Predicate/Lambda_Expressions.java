package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        // Predicate METHOD only accepts objects not primitive. It applies for Integers and strings too
        Predicate<Integer> oddNum = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.removeIf(oddNum);// it removes every odd num from the list. NO Printing
        System.out.println(list);

        // remove all numbers less than five in the list above
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Predicate<Integer> lessthan5 = Y -> Y < 5;
        list1.removeIf(lessthan5);
        System.out.println(list1);

        //remove all names started with "r" and "Z"
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Rahman", "rarzy", "rdil","runar", "Zipper", "Zee"));

        Predicate <String> startwithr = n -> n.startsWith("r") || n.startsWith("Z");
        names.removeIf(startwithr);
        System.out.println(names);


        // remove all charcters which are digit

        Predicate<Character> removeDigit2 = d -> d >=48 && d <=57;
      //OR  Predicate<Character> removeDigit = d -> d >=48 && d <=57;
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4','5', '@','&','Z'));

        chars.removeIf(removeDigit2);
        System.out.println(chars);

        System.out.println("==============================");

        /// we can also use removeIf() directly. Like This
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3.removeIf(n -> n > 5);
        System.out.println(list3);

        System.out.println("=============================");

        Predicate<Character> removeExceptsp = d ->  Character.isDigit(d);
        ArrayList<Character> random = new ArrayList<>();
        random.addAll(Arrays.asList('A', 'B', '3', '4','5', '@','&','Z'));
        random.removeIf(removeExceptsp);
        System.out.println(random);

    }
}

