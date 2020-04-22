package Day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        Create an array that holds 12 months namesUser should be able to enter
        month index and output should be:“The month name is <MonthName>”
         */

        String month[] = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December",};

        int num;// to hold the input number

        System.out.println("Enter a number");
        num = scan.nextInt();

        int attempt=1;
        for (int i = 1; i <= 12; i++) {

            while (num <= 0 || num > 12) {// repeats the input number when invalid
                System.out.println("Invalid month number: Try again");
                num = scan.nextInt();
                attempt++;

                if (attempt ==3 && (num <= 0 || num > 12 )){//when attempts reaches 3 and entry
                                                // is still invalid then system exits entirely
                    System.out.println("You reached maximum attempts");
                    System.exit(0);
                }

            }
            if (num == i) {
                System.out.println(month[i - 1]);
            }
        }

        System.out.println("*********************************");

   /*
        for (int i = 1; i <= 12; i++) {
            num = scan.nextInt();

            String result = "";
            switch (num) {
                case 1:
                    result = month[i - 1];
                    break;
                case 2:
                    result = month[i - 1];
                    break;
                case 3:
                    result = month[i - 1];
                    break;
                case 4:
                    result = month[i - 1];
                    break;
                case 5:
                    result = month[i - 1];
                    break;
                case 6:
                    result = month[i - 1];
                    break;
                case 7:
                    result = month[i - 1];
                    break;
                case 8:
                    result = month[i - 1];
                    break;
                case 9:
                    result = month[i - 1];
                    break;
                case 10:
                    result = month[i - 1];
                    break;
                case 11:
                    result = month[i - 1];
                    break;
                case 12:
                    result = month[i - 1];
                    break;


                default:
                    result="hi";
            }
            System.out.println(result);
        }

    */


    }
}