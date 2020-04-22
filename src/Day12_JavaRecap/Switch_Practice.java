package Day12_JavaRecap;

import java.util.Scanner;

public class Switch_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = 3;
        switch (day){

            default:
                System.out.println("Invalid");

            case 1:
                System.out.println(" 3 ");
                break;

            case 2:
                System.out.println(" 2 ");

        }


        System.out.println("=====================================================");

        int statusCode = 404;
        switch (statusCode){

            default:
                System.out.println("Invalid status code");
                break; // if we put this default at the beginning or middle then we must add the break

            case 200:
                System.out.println("OK");
                break;

            case 201:
                System.out.println("Created");
                break;

            case 202:
                System.out.println("Accepted");
                break;

        }
    }
}
