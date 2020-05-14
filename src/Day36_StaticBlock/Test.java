package Day36_StaticBlock;

public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlock2.tester1);//it gives (null) unless we initialized (tester1) inside the Static Block

        System.out.println(StaticBlock3.name);// Rahman
        System.out.println(StaticBlock3.num);// 200

        System.out.println(StaticBlock4.tester3);// Name: Adil, job title: SDET, salary: $110000.0, ID: 123

    }
}
