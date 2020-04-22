package Day10_Switch_Scanner;
import java.util.*;
public class SannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Please enter a byte number:");

        byte num1 = input.nextByte();
        System.out.println("You have entered: "+num1);

        if (num1 % 2 == 0 ){
            System.out.println(num1+" is even");
        }else{
            System.out.println(num1+" is odd");
        }




    }
}
