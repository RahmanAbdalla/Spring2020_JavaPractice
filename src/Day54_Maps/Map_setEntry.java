package Day54_Maps;

import com.sun.xml.internal.xsom.impl.scd.Step;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_setEntry {
    public static void main(String[] args) {




        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        //8- entrySet() method : used for iterating
        countries.put("USA","Washington DC");
        countries.put("Iraq","Baghdad");
        countries.put("Iran","Tehran");
        countries.put("France","Paris");
        countries.put("Uk","London");


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter country name:");
        String inputName = scan.next();

        for (Map.Entry<String , String> each : countries.entrySet() ){
          //  System.out.println("Country: "+each.getKey()+", Capital: "+each.getValue());
            String countryName = each.getKey();
            String capitalCity = each.getValue();

            System.out.print("Country: "+countryName+", Capital: "+capitalCity);

            System.out.println();

            if (countryName.equalsIgnoreCase(inputName)){
                System.out.println(inputName+"'s capital city is: "+each.getValue());
            }
        }


    }
}
