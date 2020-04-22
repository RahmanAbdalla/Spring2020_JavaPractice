package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {

        //isEmpty(): checks if the string is empty, returns boolean(true or false)
        String a = "     ";
        boolean a1 = a.isEmpty();
        boolean a2 = !a.isEmpty();
        System.out.println(a1);
        System.out.println(a2);


        System.out.println("==========================================");

        // equals(str): checks if 2 str texts are equal or not, returns boolean (true or false)
        // equalsIgnorCase(str):checks if 2 str texts are equal or not, returns boolean (without case sensitivity)
        String s1= "cat";
        String s2= new String("cat");
        String s3 = "Cat";

        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2));// true: This equal operator is better to use
        System.out.println(s1.equals(s3));// false coz Java is case sensitive

        System.out.println(s1.equalsIgnoreCase(s3));//true: coz this one ignore case sensitivity

        System.out.println("==========================================");

        //contain(str):checks if a given atr contains in the string, returns boolean

        String w1 = "I like to learn Java";
        System.out.println(w1.contains("Java"));// true

        String w2 = "Top 3 Viruses are: 1. Corona, 2. Hanta, 3. Ebola";
        System.out.println(w2.contains("Corona")); // true

        System.out.println("==========================================");

        //startsWith(str):checks if the str is started with a given str
        //endsWith(str):checks if the str is ended with a given str

        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("wwww"));// true
        System.out.println(webAddress.startsWith("wwww"));// false coz it's four w

        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));// true
        System.out.println(gmail.endsWith("hotmail.com"));//false


    }
}
