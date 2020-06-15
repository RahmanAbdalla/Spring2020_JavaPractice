package Day47_Abstraction;

class Test1{
    // We can have these method in regular classes: We can basically have everything in a regular class EXCEPT for
                                                                                  // abstract methods or variables
    //1. Constructor method
    public Test1(){

    }

    //2. Instance method
    public void instanceMethod(){

    }

    //3. Static method
    public static void staticMethod(){

    }
    // * But we CANNOT have abstract method in regular classes
  //  abstract void abstractMethod();

    // WE can also have every variables or blocks:
    int a =100; //instance variable
    static int b = 200; //static variable

    { //instance block

    }

    static { //static variable

    }


}


abstract class Test2{

    // We can basically have everything in abstract classes that a regular class has. BUT we CANNOT create object from
        // abstract classes.
    //1. Constructor method
    public Test2(){

    }

    //2. Instance method
    public void instanceMethod(){

    }

    //3. Static method
    public static void staticMethod(){

    }

    //4. abstract method
    abstract void abstractMethod();


    // WE can also have every variables or blocks:
    int a =100; //instance variable
    static int b = 200; //static variable

    { //instance block

    }

    static { //static variable

    }


}


public class Abstract_VS_NonAbstract {

}
