package Day39_AccessModifier;

public class Test {

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

        System.out.println(obj1.defaultAccess);

        System.out.println(obj1.publicAccess);

      //  obj1.ssn

        PersonalInfo obj2 = new PersonalInfo();
        System.out.println(obj2.grade);
        System.out.println(obj2.age);

    }
}
