package Day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        /*
        write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number: ");
        String buildingNum = scan.next();

        scan.nextLine();/* we use this when we have (nextLine) right after the next(), but if
    we use nextLine through the entire code then we don't need nextLine to take out the ENTER */

        System.out.println("Enter street number: ");
        String street = scan.nextLine();

        System.out.println("Enter city name: ");
        String city = scan.nextLine();// some city name like "New York" is two words

        System.out.println("Enter state name: ");
        String state = scan.nextLine();//"North Carolina" is two words
        System.out.println("Enter zip code: ");
        String zipCode= scan.nextLine(); // we can use next() for zip Code
     // the same thing like the one above. we use (nextLine) right after next()
        scan.nextLine();// we use this coz we have nextLine right after next()

        System.out.println("Enter your full name: ");

        String fullName = scan.nextLine();

      //  String str = "Ship To:  "+city+", "+state+" "+zipCode;

        System.out.println("Ship To: "+fullName+"\n\t\t "+street+"\n\t\t "+city+", "+state+" "+zipCode);

    }
}
