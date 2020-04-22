package Day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your agae");
        byte age = scan.nextByte();

        EligibleToBuyAlchohol(age);/* whatever we pass here will be assigned to int age
                                    below in the method and then it will be executed */

    }

    public static void EligibleToBuyAlchohol (int age){

        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Eligible to buy milk");
        }
    }

}
