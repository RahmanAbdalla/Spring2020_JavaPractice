package Day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Your age is: "+age);

        input.nextLine(); // we added this to solve the issue

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();/*not this doesn't allow us to enter full name
                                            coz there's one "Enter" left in the previous step
                                            therefore we can add another (input.nextLine();)
                                            in the before this one
                                              */

        System.out.println("Your full name is: "+fullName);
    }
}
