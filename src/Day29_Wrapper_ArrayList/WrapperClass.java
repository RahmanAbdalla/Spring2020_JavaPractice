package Day29_Wrapper_ArrayList;

public class WrapperClass {
    public static void main(String[] args) {

        /*
        Primitive are dedicated (Loyal) to Wrapper classes, that's, We CANNOT assign primitives to
        any Wrapper class but their own. Ex, int to Integer
        However Wrapper classes are NOT dedicated (Loyal) to Primitives, that's, we CAN assign Wrapper
        classes to any primitives. EX: Integer to int, byte, short ...
         */
        int a = 100;

        Integer b = a; // Wrapper class, it only is Loyal to int

        short s1 = 200;
        int n1 = s1;

       // Integer N1 = s1; // Error coz Integer is dedicated to int primitive ONLY
        Integer n2 = n1;

        int a1 = 20;
        float f1 = a1;
        // Float f2 = a1;

        Integer I1 = 200;
        int a2 = I1;
        Byte B1 = 126; //But there's NO restriction when assigning a wrapper class to the primitives
        int a3 = B1;
        System.out.println(a3); // 126
    }
}
