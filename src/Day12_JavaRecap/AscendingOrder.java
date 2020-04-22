package Day12_JavaRecap;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
          /*
     Assignment:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
         */
          Scanner scan = new Scanner(System.in);

        System.out.println("Please enter five numbers: ");
        double n1 =scan.nextDouble();
        double n2 =scan.nextDouble();
        double n3 =scan.nextDouble();
        double n4 =scan.nextDouble();
        double n5 =scan.nextDouble();

        String  sum1 = " ";
        boolean n12345 = n1<n2 && n1<n3 && n1<n4 && n1<n5 && n2<n3 || n2>n3 && n2<n4 || n4 > n2 &&
                         n2<n5 || n2>n5 && n3<n4 || n3>n4 && n3<n5 || n3>n5 && n4<n5 || n4>n5;
        boolean n21345 = n2<n1 && n2<n3 && n2<n4 && n2<n5 && n1<n3 && n1<n4 && n1<n5 &&
                         n3<n4 && n3<n5 && n4<n5;
        boolean n31245 = n3<n1 && n3<n2 && n3<n4 && n3<n5 && n1<n2 && n1<n4 && n1<n5 &&
                         n2<n4 && n2<n5 && n4 < n5;
        if (n12345){
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);
        }else if (n21345){
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n4);
            System.out.println(n5);

        }else if (n31245){
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n4);
            System.out.println(n5);

       }else if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
            System.out.println(n4);
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n5);

        }else if (n5<n1 && n5<n2 && n5<n3 && n5<n4){
            System.out.println(n5);
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);




        }


    }
}


