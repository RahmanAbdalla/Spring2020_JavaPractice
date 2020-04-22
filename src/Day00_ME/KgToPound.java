package Day00_ME;
import java.util.*;
public class KgToPound {
    public static void main(String[] args) {

        double pound;
        double kilogram;

        Scanner input = new Scanner(System.in);
        System.out.println("write a pound number here");

        pound = input.nextDouble();
        kilogram = pound*0.453;
        System.out.println(pound+" is "+kilogram+" kilogram");

        System.out.println("Now enter a kilogram number");
        kilogram = input.nextDouble();
        pound = kilogram*2.25;
        System.out.println(kilogram+" is "+pound+" pounds");



    }
}
