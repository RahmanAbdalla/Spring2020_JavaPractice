package Day42_Inheritance;

public class TestAccessModifiers extends AccessModifiers {

    public static void main(String[] args) {

        /*
        publicVariable (inherited)
        defaultData (inherited)
        protectedVariables (inherited)
        privateVariable (NOT inherited) XXX
         */
        System.out.println(TestAccessModifiers.publicVariable);
        System.out.println(TestAccessModifiers.defaultData);
        System.out.println(TestAccessModifiers.protectedVariables);
        //System.out.println(TestAccessModifiers.privateVariable);


        /*
        protectedMethod()  (inherited)
        staticMethod()     (inherited)
        publicMethod()     (inherited)
        privateMethod()    (NOT inherited) XXX
         */
        TestAccessModifiers.protectedMethod();
        TestAccessModifiers.defaultMethod();
        TestAccessModifiers.publicMethod();
        //TestAccessModifiers.privateMethod();
    }

}
