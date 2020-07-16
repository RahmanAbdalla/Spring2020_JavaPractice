package Day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class Maps_Intro {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();

        //1- put() method : adds objects
        employeeInfo.put("Adil", 125000.0);
        employeeInfo.put("Rahman",130000.0);
        employeeInfo.put("Hunar",126000.0);


        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size()); // 3

        //Map doesn't have index number, so we need to use the key inorder to get the value
        //2- get() method : retrieve the value of the given key
        System.out.println(employeeInfo.get("Adil"));

        //3- remove() method : removes the whole object
        employeeInfo.remove("Rahman");

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        // Map doesn't accept duplicate, and even if it does then it only keeps the last added one
        employeeInfo.put("Adil", 132000.0); // the first "Adil" will be removed

        System.out.println(employeeInfo);


        System.out.println("==========================");

        Map <String, LocalDate> friends = new LinkedHashMap<>();

        friends.put("Adil", LocalDate.of(1983,05,03) );
        friends.put("Hunar",LocalDate.of(1986,07,01) );
        friends.put("Barzy",LocalDate.of(1990,10,10) );
        friends.put("Hardi",LocalDate.of(1986,07,01) );
        friends.put("Rawand",LocalDate.of(1989,04,04) );

        System.out.println(friends);

        //4- containsKey() method : checks if a given key is contained in the map

        boolean b1 = friends.containsKey("Hawar"); // False coz it's not contained
        System.out.println(b1);

        //5- containsValue() method : checks if a given value is contained in the map

        boolean b2 = friends.containsValue(LocalDate.of(1989,04,04)); // True
        System.out.println(b2);

        // size() method : return the size of the map

        System.out.println(friends.size());




    }
}
