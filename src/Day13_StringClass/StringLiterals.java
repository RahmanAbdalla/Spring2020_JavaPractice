package Day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat"; // this is created inside String pool
        String str2 = new String("Cat");//this is created inside Java heap

        System.out.println(str1+" : "+str2);

        String str3 = "Cat"; // String pool

        System.out.println(str1 == str2); /* true coz same String variable sharing by two strings
                        or we can say String pool doesn't duplicate objects like "Cat" for ex: */

        String str4 = new String("Cat");
        System.out.println(str2 == str4);/* false: coz ste2 & str4 have two independant object which

                                          is "Cat" */
        String s1 = "Java"; // String pool. This "Java" is immutable, means you cannot modify it
        s1 = "JavaScript"; // here s1 gets the value "JavaScript" NOT "Java"
        System.out.println(s1); // "JavaScript"

        String s2 = "Java";/* no new object for "Java" will be created inside String pool coz it
                              exits there from previous variable (s1) */
        System.out.println(s1 == s2);/* false: coz though they share same location, String pool
                           coz they have two different objects: s1="Java" and s2= "JavaScript"*/







    }
}
