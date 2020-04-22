package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {

        byte age = 30;

        boolean eligibleToBuy = age > 21  || age == 21;
        // we can also do it without boolean

        // if (age >= 21)
        if (eligibleToBuy){
            System.out.println("You're eligible to buy alchohol");
        }
        // if (age == 21)
        if (!eligibleToBuy){
            System.out.println("Go drink your milk");
        }

        boolean felling = true;
        
        if (felling == false){
            System.out.println("Don't be sad");
        }
        if (felling == true){
            System.out.println("Stay happy");
        }



    }
}
