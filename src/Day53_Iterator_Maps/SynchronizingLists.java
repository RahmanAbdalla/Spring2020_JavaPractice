package Day53_Iterator_Maps;

import java.lang.reflect.Array;
import java.util.*;

public class SynchronizingLists {

    //COllections.swap, .sort, .synchronize, .frequency

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // How can we synchronize list in java?? OR how to achieve thread safety
        // We can achieve synchronized list by calling "Collections.synchronizedList".
        list = Collections.synchronizedList(list);// Now we have synchronizes the list and assigned back to it again

        Set<String> set = new HashSet<>();
        Collections.synchronizedSet(set); // we don't even need to write set name again

    }
}
