package Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      /*  System.out.println("Please write something");
        String str = input.next();



        System.out.println(str); // next() only takes first word.

       */
        // 7921 Jones Branch Dr, McLean VA, 22034

        String fullAddress = " ";

        System.out.println("Please enter the building number: ");
        int buildingNum = input.nextInt();
        //fullAddress += buildingNum+" ";

        System.out.println("Please enter the street name: ");
        String streetName = input.next();
        //fullAddress += streetName+" ";

        System.out.println("Please enter the road name: ");
        String roadName = input.next();
        //fullAddress +=roadName+" ";

        System.out.println("Please enter the city name, state, zipcode: ");
        String cityName = input.next();
        //fullAddress += cityName;

        String stateName = input.next();
       // fullAddress +=stateName;

        int zipCode = input.nextInt();
       // fullAddress +=zipCode;


        fullAddress+= buildingNum+" "+streetName+" "+roadName+", "+cityName+" "+stateName+", "+zipCode;

        System.out.println(fullAddress);
    }
}
