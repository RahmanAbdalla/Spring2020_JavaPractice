package Day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_SetEntries {
    public static void main(String[] args) {

        LinkedHashMap<String, String> fb = new LinkedHashMap<>();

        fb.put("tester1","password1");
        fb.put("tester2","password1");
        fb.put("tester2","password2");
        fb.put("tester3","password3");
        fb.put("tester4","password4");
        fb.put("tester5","password5");


        System.out.println(fb.size()); // size is 5 coz tester2 is duplicated

        // 6- keySet() method : return all the keys as set collection
        for ( String eachKey : fb.keySet() ){

            System.out.println(eachKey+" "+fb.get(eachKey));
        }

        List<String> userNames = new ArrayList<>( fb.keySet() );
        System.out.println(userNames);

        System.out.println("==========================");

        // 7- values() method : return all the values as set interface
        for ( String eachValue : fb.values() ){

            System.out.println(eachValue);
        }

        // We can store all values or keys into lists
        List<String> password = new ArrayList<>( fb.values() );

        System.out.println(password);


        System.out.println("==================");

        Map<String, Integer> students = new LinkedHashMap<>();

        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for (String eachKey : students.keySet()){
            int eachValue = students.get(eachKey);
            if ( eachValue < 90) {
                badStudents.put(eachKey, eachValue);
            }else {
                goodStudents.put(eachKey, eachValue);
            }
        }
        System.out.println(badStudents);
        System.out.println(goodStudents);







    }
}
