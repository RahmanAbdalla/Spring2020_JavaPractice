package OfficeHours.Practice_04_08_2020;

public class FoorLoop_Practice {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i+=2){
            System.out.println("Hello World " +i);
        }

        for (int z=0; z<=5;){
            z++; // z starts from 1 not 0. So output will be: 123456
            System.out.println(z);
        }
    }
}
