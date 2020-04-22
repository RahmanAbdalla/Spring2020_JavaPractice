package OfficeHours.Practice_04_01_2020;

public class literal_new {
    public static void main(String[] args) {

        String s1 = "Java"; //literal Str
        String s2 = "Java";//literal Str  :  both strings share the same object ("Java")

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1 == s2);// true, same object

        System.out.println(s1 == s3);// false, different objects at different location


        System.out.println(s4 == s3);//false czo they both have two different independent objs


    }
}
