package Resourses;
import Day40_Encapsulation.Encapsulation;
public class Encapsulation_Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        System.out.println(obj.getSsn());//0

        obj.setSsn(123456);

        System.out.println(obj.getSsn());//123456
    }
}
