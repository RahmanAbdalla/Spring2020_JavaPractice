package Resourses;

import Day42_Inheritance.AccessModifiers;
import Day42_Inheritance.TestAccessModifiers;

public class Inheritance2 extends AccessModifiers {

    public static void main(String[] args) {

         /*
        publicVariable (inherited)
        protectedVariables (inherited)
        defaultData (NOT inherited) XXX
        privateVariable (NOT inherited) XXX
         */
        System.out.println(TestAccessModifiers.publicVariable);
        System.out.println(TestAccessModifiers.protectedVariables);
       // System.out.println(TestAccessModifiers.defaultData);
        //System.out.println(TestAccessModifiers.privateVariable);


        /*
        protectedMethod()  (inherited)
        publicMethod()     (inherited)
        defaultMethod()     (NOT inherited) XXX
        privateMethod()    (NOT inherited) XXX
         */
        TestAccessModifiers.protectedMethod();
        TestAccessModifiers.publicMethod();
       // TestAccessModifiers.defaultMethod();
        //TestAccessModifiers.privateMethod();
    }

}
