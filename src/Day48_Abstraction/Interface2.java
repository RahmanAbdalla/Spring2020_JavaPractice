package Day48_Abstraction;

public interface Interface2 {

    int a=10;// this variable is (static & final) by default, and the access modifier is public too
    // we can call this variable from interface name

    // We can NEVER create or have constructor is interface coz interface is NOt a class, and constructor uses class name
    /*  public Interface2(){
       } */

    public static void main(String[] args) {

        System.out.println(a);// to prove it it's static, we can call it directly from the main method.
        // a =200; we cannot reinitialize it coz interface variables are final by default

        System.out.println(Interface2.a);

        Interface2.method1();

    }


    public static void method1(){ // we can have static method in interface and call it from Interface name too

    }

    void method2();

    public default void method3(){ // we can have default method in interface and call it from Interface name too

    }
}
