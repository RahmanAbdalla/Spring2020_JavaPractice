package Day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);

        System.out.println("Enter a long number: ");

        long num = type.nextLong();

        System.out.println("You have entered: "+num);

        System.out.println("Enter a decimal: ");
        double a =  type.nextFloat(); // float can be assigned to double
        // long b = (long) type.nextFloat(); // explicit casting, so we get whole num in result

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal number: ");
        double c= type.nextDouble();
        System.out.println("You have entered: "+c);

        System.out.println("Enter True or False");
        boolean bool = type.nextBoolean();

        System.out.println(bool);

        System.out.println("Enter your name: ");
        String str= type.next(); // this method only shows the first word of the string for Ex:
                                // Rahman Abdalla==> ONLY (Rahman) wil be printed.

        System.out.println("You have entered: "+str);






    }
}
