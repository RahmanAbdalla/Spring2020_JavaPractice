package Day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str = "I like Java programming John";
        int num1 = str.indexOf("Jo");
        System.out.println(num1);

        String str2 = "Cybertek school is awsome";

        int num2 = str2.indexOf("s");
        System.out.println(num2);
        int num3 =str2.indexOf("is")+1; // index of s
       // int num3 =str2.indexOf("s "); // we can also give space after s

        // int num3 =str2.indexOf("is");// index of i
        System.out.println(num3);

        String names = "Rahman";
        int num4 = names.indexOf("Z");
        System.out.println(num4);// -1: If the value doesn't exist in the string then we get negative num


        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);/* we have to add +1 coz it
                                                                    starts from A */

        System.out.println(firstName);
        System.out.println(lastName);


    }
}
