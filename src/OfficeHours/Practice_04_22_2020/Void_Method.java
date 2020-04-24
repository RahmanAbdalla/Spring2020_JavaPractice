package OfficeHours.Practice_04_22_2020;

public class Void_Method {
    public static void main(String[] args) {

        print();

        int age = 20;
        boolean UsCitizen = false;
        vote(age,UsCitizen);
        System.out.println("====================");

        int age2 = 18;
        eligibleToBuyCig(age2);





    }

    public static void print () {
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

    }


    public static void vote (int age, boolean UsCitizen){
        boolean b = age >=18 && UsCitizen == true;

        if (b){
            System.out.println("You ate eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    public static void eligibleToBuyCig (int age ){
        if (age > 20){
            System.out.println("You are eligible to buy cigarette ");
        }else {
            System.out.println("You are eligible to buy lollipop");
        }
    }

}
