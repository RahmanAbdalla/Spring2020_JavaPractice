package Day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String validUserName = "cybertek";
        String validPassword = "cybertekschool";

        System.out.println("Please enter your user name:");
        String userName = scan.next();

        System.out.println("Please enter your password: ");
        String password = scan.next();

        boolean user = userName.equals("cybertek");
        boolean pass = password.equals("cybertekshcool");
        boolean passSHort = password.length()>8;

        if (user==true && passSHort && pass){
            System.out.println("Logged in successful");
        }else if (!user && !pass){
            System.out.println("invalid username or password");
        }else if (!passSHort){
            System.out.println("Password is too short. Must be more than 8 characters");
        }



    }
}
