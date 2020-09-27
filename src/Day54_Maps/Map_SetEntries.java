package Day54_Maps;

import java.lang.reflect.Array;
import java.util.*;

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


        System.out.println("=============================");

        Map<String, String> animals = new LinkedHashMap<>();
        animals.put("cow","domestic");
        animals.put("tiger","wild");
        animals.put("donkey","domestic");
        animals.put("sheep","domestic");
        animals.put("ostrich","wild");

        LinkedHashMap<String, String> domesticAnimals = new LinkedHashMap<>();
        LinkedHashMap<String, String> wildAnimals = new LinkedHashMap<>();


        for ( String eachKey : animals.keySet() ) {

            String animalType = animals.get(eachKey);

            if (animalType.equals("domestic")){
                domesticAnimals.put(eachKey,animalType);
            }else {
                wildAnimals.put(eachKey,animalType);
            }
        }

        System.out.println(domesticAnimals);
        System.out.println(wildAnimals);


        for ( String eachKey : animals.keySet() ) {

            System.out.println("Animal name: "+eachKey+", Type: "+animals.get(eachKey));
            System.out.println();
        }


        }
}
