package Day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {

        // Remove all numbers less than 4
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for (int i=0; i < list.size(); i++) {
          /*  if (list.get(i) < 4){ // this is not able to remove duplicate but temporarily, therefore we should use
                                        ITERATOR
                list.remove(i);
            }
           */
            list.removeIf(s -> s < 4);// removeIf does remove duplicate coz it's internally using Iterator.
        }
        System.out.println(list);



        System.out.println("=============== While loop with Iterator ===================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
        // iterator() method will return interface of Iterator so we need to assign it to an Iterator of the same data type
        Iterator<Integer> iterator = list2.iterator();


        // In order to verify if the Iterator has objects or Not then we use hasNext() method

       while (iterator.hasNext()){

           if ( iterator.next() < 4 ){
               iterator.remove();
           }
       }

        System.out.println(list2);

        System.out.println("================ for loop with Iterator");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));

        for (Iterator<Integer> it = list3.iterator(); it.hasNext(); ){
            int num = it.next();
            if (num < 4){
                it.remove();
            }
        }

        System.out.println(list3);
    }
}
