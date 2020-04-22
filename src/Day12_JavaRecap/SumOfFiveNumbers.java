package Day12_JavaRecap;

import java.util.*;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter five numbers: ");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();

        boolean positiveNum = num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0 && num5 > 0;

        double sum = num1 + num2 + num3 + num4 + num5;

        if (positiveNum) {

            if (num1 > 0) {
                // sum += num1;
            }
            if (num2 > 0) {
                //  sum += num2;
            }
            if (num3 > 0) {
                // sum += num3;
            }
            if (num4 > 0) {
                // sum += num4;
            }
            if (num5 > 0) {
                // sum += num5;
            }
            System.out.println(sum);

        } else {
            System.out.println("There are negative numbers");
        }

    }
}


