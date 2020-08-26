package Day20_ArraysContinue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int num;
        int attempts=1;

        System.out.println("Enter a number:");
        num = scan.nextInt();

        for (int i=1; i <=7; i++ ){

            while (num <= 0 || num > 7){

                System.out.println("Invalid Entry. Try again:");
                num=scan.nextInt();
                attempts++;

                // Attempts:
                if (attempts ==3 && (num <= 0 || num > 7)){
                    System.out.println("Reached maximum attempt");
                    System.exit(0);
                }
            }

            if (num ==i){
                System.out.println(day[i]);
            }

        }


    }
}
