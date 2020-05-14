package Day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {

        // we can have more than one object and put them in an array, or an ArrayList

        carpet [] carpets =  { new carpet(), new carpet(),new carpet(),new carpet(),new carpet()};

        carpets[0].cutomerOrder(7,8.5,20, true);
        carpets[1].cutomerOrder(5,8,25,false);
        carpets[2].cutomerOrder(6,7,30,true);
        carpets[3].cutomerOrder(5.6,7,21,false);
        carpets[4].cutomerOrder(8,6,26,true);

        System.out.println( carpets[0]);
        System.out.println(carpets[1]);
        System.out.println(carpets[2]);

        ArrayList<carpet> persianCarpets = new ArrayList<>();

        for (carpet each : carpets){
            if (each.isPersian){
                persianCarpets.add(each);
            }
        }
        System.out.println("ArraysList size is: "+persianCarpets.size());
        System.out.println(persianCarpets);

        System.out.println(persianCarpets.get(0));// we can print whatever index we have in the ArrayList

        // Or we can only print the total price of the first carpet we have in the list
        System.out.println(persianCarpets.get(0).calCost());

        // Or we can print out the total price of all the persian carpets in the list
        int sum=0;
        for (carpet each : persianCarpets){
            sum+= each.calCost();
        }
        System.out.println("Total price of all the persian carpets is: "+sum);


        // We can add all the carpet we have in the Array above into one ArrayList, and then remove the persian ones

        ArrayList<carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);
       // OR regularCarpets.removeIf(p -> p.isPersian);
        System.out.println(regularCarpets); // prints regular carpets

    }
}
