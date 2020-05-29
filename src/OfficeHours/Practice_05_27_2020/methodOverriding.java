package OfficeHours.Practice_05_27_2020;

public class methodOverriding {

    protected  void method1(){
        System.out.println("Super class");
    }

}

class Test extends methodOverriding  {
    // sub             super

    @Override
    public void method1(){
        System.out.println("Sub class");

    }


    public static void main(String[] args) {

        Test obj = new Test();
        obj.method1();

    }
}