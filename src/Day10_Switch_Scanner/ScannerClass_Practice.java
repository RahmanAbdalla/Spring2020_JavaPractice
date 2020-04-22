package Day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerClass_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        byte num1 = input.nextByte();
        System.out.println("Please enter second number");
        byte num2 = input.nextByte();

        // int total = (num1 + num2); We can also add them here
        // System.out.println("The sum of "+num1+" and "+num2+" is "+total);

        System.out.println("The sum of "+num1+" and "+num2+" is "+(num1+num2));

        System.out.println("Please enter you Salary");
        int number1 = input.nextInt();

        System.out.println("How many hours worked in a week");
        byte number2 = input.nextByte();

        int rate = number1/12/4/number2;

        System.out.println("Your hourly rate is: "+rate);

    }
}
