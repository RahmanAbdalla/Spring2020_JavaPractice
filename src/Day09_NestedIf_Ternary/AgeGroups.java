package Day09_NestedIf_Ternary;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        String ageGroup=" ";

        if (age >= 1 && age <= 2) {
            ageGroup = "Baby";
        } else if (age >= 3 && age <= 5) {
            ageGroup="Toddler";
        } else if (age >= 5 && age <= 9) {
            ageGroup="kid";
        } else if (age >= 10 && age <= 12) {
            ageGroup="Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            ageGroup="Teenager";
        } else if (age >= 18 && age <= 20) {
            ageGroup="Young Adult";
        } else if (age >= 21 && age <= 39) {
            ageGroup="Adult";
        } else if (age >= 40 && age <= 49) {
            ageGroup="Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            ageGroup="Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            ageGroup="Very young senior citizen";
        } else if (age >= 65 && age <= 74) {
            ageGroup="Young senior citizen";
        } else if (age >= 75 && age <= 84) {
            ageGroup="Senior citizen";
        } else if (age >= 85 && age <= 150) {
            ageGroup="Old senior citizen";
        } else {
            System.out.println("invalid entery");
        }
        System.out.println(ageGroup);

        boolean eligibleToBuy= ageGroup =="Adult" || ageGroup =="Young Middle-Aged Adult" ||
                ageGroup == "Middle-Aged Adult";
        if (eligibleToBuy){
            System.out.println("You're eligible to buy");
        }
    }
}