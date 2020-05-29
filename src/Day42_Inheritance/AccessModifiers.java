package Day42_Inheritance;

public class AccessModifiers {

    public static String publicVariable = "public";
    protected static String protectedVariables ="protected";
    static String defaultData = "default";
    private static String privateData = "private";


    public static void  publicMethod(){

        System.out.println("Inherited public method");
    }

    protected static void protectedMethod(){
        System.out.println("Inherited protected method");

    }
    static void defaultMethod() {
        System.out.println("Inherited static method");

    }

    private static void privateMethod(){

    }

}
