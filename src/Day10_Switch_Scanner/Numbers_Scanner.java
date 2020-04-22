package Day10_Switch_Scanner;
import java.util.*;
public class Numbers_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1  = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter third number");
        int num3 = scan.nextInt();


       /*  We can also use Boolean
        boolean num1Max = num1>num2 && num1>num3;
        boolean num2Max = num2>num1 && num2>num3;
        boolean num3Max = !num1Max && !num2Max;

        */

             // maximum number
        int max = (num1>=num2 && num1>=num3)?num1:(num2>=num1 && num2>=num3)?num2:num3;

        System.out.println(max+" is the maximum number");

              // minimum number

        if (num1<num2 && num1<num3){
            System.out.println(num1+" is the minimum number");
        }else if (num2<num1 && num2<num3){
            System.out.println(num2+" is the minimum number");
        }else{
            System.out.println(num3+" is the minimum number");
        }
    }
}
