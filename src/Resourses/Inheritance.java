package Resourses;

import Day42_Inheritance.Data;

public class Inheritance extends Data {

    /*
    public (inherited)
    protected (inherited)
    default (NOT inherited)
    private (NOT inherited)
     */

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);

       // System.out.println(Inheritance.defaultData);cannot be accessed outside package
       // System.out.println(Inheritance.privateData);Can NEVER be accessed regardless where it is

    }
}
