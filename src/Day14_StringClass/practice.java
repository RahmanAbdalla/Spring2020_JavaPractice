package Day14_StringClass;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = "cybertekschool.gmail.com";
        String userInputEmail = "cybertekSchool.com";

        boolean res = (email.equalsIgnoreCase(userInputEmail));// false

        if (res)
        System.out.println("Logged in successful");

        String a1 = "Cybertek School";

        boolean res1 = a1.contains("School"); // true
        System.out.println(res1);


        System.out.println("=========================================");
        /*
        valid password MUST contain a special character such as (!, _, $)
        valid password should not contain spaces
         */

        String password = "mmasd12345";
        boolean res2 = password.contains(" ");
        if (res2){
            System.out.println("Password cannot have space in it");
        }else {
            System.out.println("Valid password");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));//true

        System.out.println("=========================================");

        /*
        write a program that can validate if a weba ddress is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, .net, .Gov
         */





    }
}
