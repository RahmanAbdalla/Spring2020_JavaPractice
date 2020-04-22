package Day10_Switch_Scanner;
import java.util.*;
public class RateCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your Salary");
        int salary = scan.nextInt();

        System.out.println("How many hours worked in a week");
        byte hours = scan.nextByte();

        System.out.println("How many weeks worked in year");
        byte weeks= scan.nextByte();

        int hourlyRate = salary/weeks/hours;

        System.out.println("Your hourly rate is: $"+hourlyRate);



    }
}
