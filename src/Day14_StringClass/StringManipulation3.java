package Day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String a = "CYBERTEK";
        String a1 = "cybertek";
        System.out.println(a.equals(a1));// false

        System.out.println(a.equalsIgnoreCase(a1));// true

        String website = "WWW.cybertek.com";
        website.toLowerCase();
        boolean validAddress = website.startsWith("WWW");

        if (validAddress){
            System.out.println("Valid website");
        }else{
            System.out.println("Invalid website");
        }

        // endWith

        String s4 = "Cybertek School";
        boolean q1 = s4.endsWith("l"); // l
        System.out.println(q1);

        /*

         */

        String email = "CybertekSchool@yahoo.com";

        if (email.endsWith("@gmail.com")){
            System.out.println("valid gmail address");
        }else {
            System.out.println("Invalid Gmail");
        }



    }
}
