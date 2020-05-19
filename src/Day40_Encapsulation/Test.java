package Day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj1.ss);

        System.out.println(obj1.getSsn());//0


        obj1.setSsn(123456);

        System.out.println(obj1.getSsn());//123456
    }
}
