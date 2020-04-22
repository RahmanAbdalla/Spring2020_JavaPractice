package OfficeHours.Practice_04_08_2020;

public class nestedLoop_Practice {
    public static void main(String[] args) {


        int a = 5;
        while ( a <10){

            for (int i= 10; i<=50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();
            a++;
        }

        System.out.println("================================");


        for (int r=1; r <= 15; r++) {

            for (int s = 0; s <= 20; s++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("================================");

        for (int r=1; r <= 7; r++) {

            for (int s = 1; s <= r; s++) {// we need to make sure when r value is 1 then s prints
                                        // for only one time, therefore we give the value of r to s
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int r=8; r >= 1; r--) {

            for (int s = 1; s <= r; s++) {// we need to make sure when r value is 8 then s prints
                                   // for 8 times, therefore we give the value of r to s
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
