package Day35_Static;

public class staticVariables {

    /*  1. When the variable is instance then each variable has its own copy. However when the variable is static, then
        there's ONLY one copy
        2. Instance variable CANNOT be called within the( public static void main(String[] args) { ) unless through an
        object created from class name. for ex Like: staticVariables obj1 = new staticVariables();
        3. static variables can be called either from main method directly or from instance methods, coz it's global var

     */

    int a2 = 200; // instance variable

    static int a3 = 300;

    public static void main(String[] args) {


        int a1 = 100; // local variable

        staticVariables obj1 = new staticVariables();
        obj1.a2 = 1000;

        obj1.a3 = 4000;

        staticVariables obj2 = new staticVariables();
        obj2.a2 = 2000;

        obj2.a3 = 5000;


        System.out.println( obj1.a2 );
        System.out.println( obj2.a2 );

        System.out.println( obj1.a3 ); // 5000
        System.out.println( obj2.a3 ); // 5000


    }

}
