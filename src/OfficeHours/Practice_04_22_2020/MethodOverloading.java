package OfficeHours.Practice_04_22_2020;

public class MethodOverloading {

    public static void main(String[] args) {

        double num1 = method1(100);  //"Hello Cybertek", and then returns 10
        System.out.println(num1);

    }

    public static void method1(){
        System.out.println("Hello World");
    }

    public static double method1(int a){

        //    System.out.println("Hello Cybertek");
        return 10;

    }

    public static void method1(int a, int b){
        System.out.println("Hello Batch 18");
    }

}
