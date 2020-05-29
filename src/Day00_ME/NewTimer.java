package Day00_ME;

import java.util.Scanner;

public class NewTimer {
    public static void main(String[] args) {

        System.out.println("Welcome to TIMER\nPlease enter number of minutes:");
        Scanner scan = new Scanner(System.in);

        int minutes = scan.nextInt();
        while (minutes < 0){
            System.out.println("Invalid Entry. Number MUST be grater than zero");
            minutes=scan.nextInt();
        }
        for (int k = minutes; k >= 0; k--) {
            if (k == 0){
                break;
            }
        for (int i=60; i >=0; i--) {
            seconds(1);
            System.out.println(k-1 + " minutes and " + i + " seconds");

        }

        }
    }

    public static void seconds (double second){
        try {
            Thread.sleep((long)second * 1000);
        }catch (Exception e ){

        }
    }
}
