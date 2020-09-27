package Day35_Static;

public class staticMethods {

    int a = 100;
    static  int b = 200;

    public static void main(String[] args) {// if we leave it like this we cannot call the instance variable, so we MUST
          // create an object from the staticMethods class above. like this: staticMethods obj1 = new staticMethods();

        staticMethods obj1 = new staticMethods();// Still the compiler CANNOT run the instance variable (a) unless we call
                                            // it through a static object. Like this:  obj1.a

        System.out.println( obj1.a); // This is GOOD now

        System.out.println("======================");

        System.out.println(b); // 200
        System.out.println(staticMethods.b); // 200
        System.out.println(obj1.b);// 200.  this gives warning coz it prefers to be called through class name


        staticMethods obj2 = new staticMethods();
        obj2.method();

    }

    public void method (){// instance method
        System.out.println(a);// this method accepts instance variable (a) coz the method is instance too
        System.out.println(b);// this method also accepts the static variable (b) above coz it's a global variable



    }
}
