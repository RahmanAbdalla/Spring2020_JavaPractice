package OfficeHours.Practice_05_27_2020;

public class methodOverloading {

    public void method(){

    }

    private String method(int a){
        return "123";
    }

    public static void method2(){

    }

    public static int method2(int a){
        return 123;
    }

    public methodOverloading(){

    }

    public methodOverloading(int a){

    }

    public methodOverloading(int a, int b){

    }


    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int a) {
        System.out.println("int");
    }

}
