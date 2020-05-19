package Resourses;

import Day39_AccessModifier.AccessModifiers;
import Day39_AccessModifier.PersonalInfo;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

      //  System.out.println(obj.defaultAccess); ERROR coz default CANNOT be accessed in a different package
        System.out.println(obj.publicAccess);

        System.out.println(AccessModifiers.publicStatic);

      //  System.out.println(obj.ssn); it's private

        System.out.println("========================");

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);

        //But we CANNOT Access age, grade, ssn, and ID coz they're default or private
        //System.out.println(PersonalInfo.age);
       // System.out.println(PersonalInfo.grade);
       // System.out.println(PersonalInfo.ssn);
       // System.out.println(PersonalInfo.ID);


        //Calling through object
        PersonalInfo obj1 = new PersonalInfo();

        System.out.println(obj1.name);// it's always better to call it through class name as in line 21 and 22
        System.out.println(obj1.gender);

       // System.out.println(obj1.grade);
       // System.out.println(obj.age);
       // System.out.println(obj1.ssn);
       // System.out.println(obj1.ID);


    }
}
