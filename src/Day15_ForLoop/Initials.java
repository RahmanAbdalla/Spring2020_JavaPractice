package Day15_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String [] args) {
        /*
         write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("Enter your first name:");
        String lastName = scan.next();

        String initials = firstName.substring(0,1)+lastName.substring(0,1);
        //String initials = firstName.substring(0,1).toUpperCase+lastName.substring(0,1).toUpperCase;
        initials = initials.toUpperCase();
        System.out.println(initials);

        String ch1 =""+firstName.charAt(0)+lastName.charAt(0); //if we don't use "" then we cannot use string
        ch1 = ch1.toUpperCase();
        System.out.println(ch1);


    }
}
