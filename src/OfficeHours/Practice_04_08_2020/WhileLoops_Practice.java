package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {


        for (int i=0; i <5; i++){
            System.out.println("Hello World");
        }
        System.out.println("=================================");

        int z =0;
        while (z < 5 ){
            z++;// z starts form 1, so print happens four times 1-5
            System.out.println(z);
        }
        System.out.println("=================================");

        int s = 0;
        while (s <=100 ){
            if (s % 15 == 0){
                System.out.println(s+" ");
            }
            s++;
        }
    }
}
