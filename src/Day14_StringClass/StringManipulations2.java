package Day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = " ";

        boolean a1 = str.isEmpty();
        System.out.println(a1);

        String username = "";
        if (username.isEmpty()){
            System.out.println("Please make sure username is not empty");
        }

        String s1 = "Cat"; // string literal
        String s2 = new String("Cat");
        System.out.println(s1 == s2); /* false coz different memory location, different objects
                         this == operator checks everything including visible texts and locations too*/

        System.out.println(s1.equals(s2));// true coz it only check visible text (Cats)

        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";
        String z4 = "Lion";
        String z5 = "tiger";

        // ==
        System.out.println(z1 == z2); // false. different locations
        System.out.println(z2 == z3); // false
        System.out.println(z1 == z3); // false

        // equals()
        System.out.println(z1.equals(z2));// true
        System.out.println(z2.equals(z3));// true
        System.out.println(z1.equals(z3));// true

        System.out.println(z3.equals(z4));//false: the only time it returs false is when texts are
                                                // different
        System.out.println(z3.equals(z1.equals(z5)));// false coz case sensitive


    }
}
