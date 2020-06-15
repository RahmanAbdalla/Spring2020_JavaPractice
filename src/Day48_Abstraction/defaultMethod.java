package Day48_Abstraction;

abstract class J {

  /*  public default void method2(){  we cannot have default method in abstract class. ONLY in interface

    }

   */
}


public interface defaultMethod {

    default void method() { // We can ONLY have it in interface. And we can only run it subclass of interface
        System.out.println("This is a default method");
    }


    public static void main(String[] args) {


    }
}



class test implements defaultMethod{


    public static void main(String[] args) {

        test obj = new test();

        obj.method();
    }
}



