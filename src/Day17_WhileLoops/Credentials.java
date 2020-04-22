package Day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count=1;
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();

        boolean valid = name.equals("cybertek") && password.equals("cybertek123");

        while (! valid) {
            System.out.println("Wrong user name or password. Pleas re-enter");
            System.out.println("Enter your name:");
            name = scan.nextLine();
            System.out.println("Enter your password");
            password = scan.nextLine();

            valid = name.equals("cybertek") && password.equals("cybertek123");
            // We have to declare this boolean again coz it always shows the fist result if we don't
            // declare it again

            count++;//we have to put it here coz first count is one then every time it adds one
           if (count == 3 && !valid){
               System.out.println("Your account is locked");
               break;
           }

           }
        if (valid) {
            System.out.println("Login successful");
        }
        }
    }


