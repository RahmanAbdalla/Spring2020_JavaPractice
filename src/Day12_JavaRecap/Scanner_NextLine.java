package Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullAddress = " ";


        System.out.println("Enter the building number:");
        String bNum = input.nextLine(); //when the building number has letter then we can use next()
        //String bNum = input.next();
        input.nextLine(); /*  we just need one (input.nextLine();) to take out "Enter" keyword
                              we have left in the Scanner */


        System.out.println("Enter street name:");
        String stName = input.nextLine();

        /* if we want to enter zip code separately then we will have another "Enter" left in the
        Scannerm therefore we have to use another (input.nextInt();). Like this:

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();
        input.nextInt();
        */

        System.out.println("Enter city name, state, zip code");
        String cityAndStateName = input.nextLine();


        fullAddress = bNum+" "+stName+", "+cityAndStateName;

        System.out.println(fullAddress);







    }
}
