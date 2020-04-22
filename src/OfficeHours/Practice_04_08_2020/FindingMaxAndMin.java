package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int max=-2147483648;// we have to give the smallest int value to max
        int min= 2147483647;// he we have to give the largest int value to min
        int s=1;
        while (s <=3) {
            System.out.println("enter a number");
            number = scan.nextInt();

            if (number > max){
                max=number;
            }else if (number < min){
                min=number;
            }
            s++;
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}
