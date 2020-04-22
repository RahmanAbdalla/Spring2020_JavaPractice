package Day26_MethodOverLoading;

import java.io.StringReader;

public class MethodOverLoading { // same method with the same name but different parameters in the argument

    public static void main(String[] args) {

        method(10);// this
        method(10.0);
    }



    public static void method(int a){
        System.out.println("Original method");

    }
    public static void method (double a){
        System.out.println("Overloaded method");

    }
}
